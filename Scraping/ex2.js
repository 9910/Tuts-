var express = require('express');
var path = require('path');
var request = require('request');
var cheerio = require('cheerio');
var fs = require('fs');
var app = express();
var port = 8000;

var url = "https://www.jobs.libertymutualgroup.com/job/-/-/685/4310336?src=JB-10380";

request(url, function(err, res, body){
   var $ = cheerio.load(body);
   var companyName = $(".job-id .job-info"); //ID or Class to find content
   var companyNameText = companyName.text();

   var jobTitle = $('.jobtitle font');
   var jobTitleText = jobTitle.text();

   var location = $('.location');
   var locationText = location.text();

   var summary = $('#job_summary p');
   var summaryText = summary.text();

   var job = {
      jobTitle: jobTitleText,
      location: locationText,
      summary: summaryText
   };

   // #('.company').filter(function() {
   //    var companyName = $(this);
   //    companyNameText = companyName.text();
   // });

   console.log(job);
});

app.listen(port);
console.log('server is listening on ' + port);
