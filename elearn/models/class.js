var mongoose = require('mongoose');

//Class Schema
var classSchema = mongoose.Schema({
  title: {
    type: String
  },
  description: {
    type: String
  },
  instructor: {
    type: String
  },
  lessons: [{
    lessonNumber: {type: Number},
    lessonTitle: {type: String},
    lessonBody: {type: String}
  }]
});

var Class = module.exports = mongoose.model('Class', classSchema);

//Fetch all Classes
module.exports.getClasses = function(callback, limit){
  Class.find(callback).limit(limit);
}

//Fetch Single Class
module.exports.getClassesById = function(id, callback){
  Class.findById(id, callback);
}
