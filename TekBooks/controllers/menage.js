'use strict';

var Book = require('../models/bookModel');
var Category = require('../models/categoryModel');

module.exports = function (router) {
    router.get('/books', function (req, res) {
        Book.find({}, function(err, books){
          if(err){
            console.log(err);
          }
          var model = {
            books: books
          };
          res.render('menage/books/index', model);
        });
    });

    router.get('/', function (req, res) {
        res.render('menage/index');
    });

    router.get('/categories', function (req, res) {
      Category.find({}, function(err, categories){
        if(err){
          console.log(err);
        }
        var model = {
          categories: categories
        };
        res.render('menage/categories/index', model);
      });
    });

    router.get('/books/add', function(req, res){
      Category.find({}, function(err, categories){
        if(err) console.log(err);
        var model = {
          categories: categories
        };

        res.render('menage/books/add', model);
      });
    });


//Add Books
    router.post('/books', function(req, res){
            var title =  req.body.title && req.body.title.trim();
            var category = req.body.category && req.body.category.trim();
            var author = req.body.author && req.body.author.trim();
            var publisher = req.body.publisher && req.body.publisher.trim();
            var price = req.body.price && req.body.price.trim();
            var description = req.body.description && req.body.description.trim();
            var cover = req.body.cover && req.body.cover.trim();

            if (title == '' || price == ''){
                req.flash('error', 'Please fill out required fields');
                res.location('/menage/books/add');
                res.redirect('/menage/books/add');
            }

            if (isNaN(price)){
                req.flash('error', 'Price must be a number');
                res.location('/menage/books/add');
                res.redirect('/menage/books/add');
            }

            var newBook = new Book({
                title: title,
                category: category,
                author: author,
                publisher: publisher,
                price: price,
                description: description,
                cover: cover
            });

            newBook.save(function(err){
                if(err){
                    console.log('save error', err);
                }

                req.flash('success', 'Book Added');
                res.location('/menage/books');
                res.redirect('/menage/books');
            });
        });

};
