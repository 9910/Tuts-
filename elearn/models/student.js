var mongoose = require('mongoose');

//User Schema
var studentSchema = mongoose.Schema({
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

var Student = module.exports = mongoose.model('Student', studentSchema);
