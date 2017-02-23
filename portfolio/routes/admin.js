var express = require('express');
var router = express.Router();
var multer  = require('multer');
var upload = multer({ dest: './public/img/portfolio' });
var mysql = require('mysql');

var connection = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: '',
  database: 'portfolio'
});

connection.connect();

/* GET home page. */
router.get('/', function(req, res, next) {
  connection.query('SELECT * FROM projects', function(err, rows, fields){
    if(err) console.log(err);
    res.render('dashboard', {
      "rows": rows,
      layout: "layout2"
    });
  });
});

router.get('/new', function(req, res, next){
  res.render('new');
});

router.post('/new', upload.single('fieldname'), function(req, res, next){
  var title = req.body.title;
  var description = req.body.description;
  var service = req.body.service;
  var client = req.body.client;
  var projectdate = req.body.projectdate;

    //File info
    var profileImageOriginalName = req.files.profileimage.originalname;
    var profileImageName = req.files.profileimage.name;
    var profileImageMime = req.files.profileimage.mimetype;
    var profileImagePath = req.files.profileimage.path;
    var profileImageExt = req.files.profileimage.extension;
    var profileImageSize = req.files.profileimage.size;

  req.checkBody('name', 'Name field is required').notEmpty();
  req.checkBody('service', 'Service field is required').notEmpty();

  var errors = req.validationErrors();

  if(errors){
    res.render('new', {
      errors: errors,
      title: title,
      description: description,
      service: service,
      client: client
    });
  } else {
    var project = {
      title: title,
      description: description,
      service: service,
      client: client,
      date: projectdate,
      image: projectimage
    };

    var query = connection.query('INSERT INTO projects SET ?', project, function(err, results){
      // Project Insert
    });

    req.flash('success', 'Project Added');
    res.location('/admin');
    res.redirect('/admin');
  }
});

router.post('/edit/:id', upload.single('fieldname'), function(req, res, next){
  var title = req.body.title;
  var description = req.body.description;
  var service = req.body.service;
  var client = req.body.client;
  var projectdate = req.body.projectdate;

    //File info
    var profileImageOriginalName = req.files.profileimage.originalname;
    var profileImageName = req.files.profileimage.name;
    var profileImageMime = req.files.profileimage.mimetype;
    var profileImagePath = req.files.profileimage.path;
    var profileImageExt = req.files.profileimage.extension;
    var profileImageSize = req.files.profileimage.size;

  req.checkBody('name', 'Name field is required').notEmpty();
  req.checkBody('service', 'Service field is required').notEmpty();

  var errors = req.validationErrors();

  if(errors){
    res.render('new', {
      errors: errors,
      title: title,
      description: description,
      service: service,
      client: client
    });
  } else {
    var project = {
      title: title,
      description: description,
      service: service,
      client: client,
      date: projectdate,
      image: projectimage
    };

    var query = connection.query('UPDATE projects SET ? WHERE id ='+req.params.id, project, function(err, results){
      // Project Insert
    });

    req.flash('success', 'Project Updated');
    res.location('/admin');
    res.redirect('/admin');
  }
});

router.get('/edit/:id', function(req, res, next) {
  connection.query('SELECT * FROM projects WHERE id ='+req.params.id, function(err, row, fields){
    if(err) console.log(err);
    res.render('edit', {
      "row": row[0],
      layout: "layout2"
    });
  });
});

router.delete('/delete/:id', function(req, res){
  connection.query('DELETE FROM projects WHERE id = '+req.params.id, function(err, result){
    if(err) throw err;
  });
  req.flash('success', 'Project Deleted');
  res.location('/admin');
  res.redirect('/admin');
});

module.exports = router;
