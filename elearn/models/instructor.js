var mongoose = require('mongoose');

//instructor Schema
var instructorSchema = mongoose.Schema({
  firstName: {
    type: String
  },
  lastName: {
    type: String
  },
  address: [{
    streetAddress: {type: String},
    city: {type: String},
    state: {type: String},
    zip: {type: String}
  }],
  username: {
    type: String
  },
  email: {
    type: String
  },
  classes:[{
    classId: {type: [mongoose.Schema.Types.ObjectId]},
    classtitle: {type: String}
  }]
});

var Instructor = module.exports = mongoose.model('Instructor', instructorSchema);
