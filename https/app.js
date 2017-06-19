var fs = require('fs');
var https = require('https');
var path = require('path');
var express = require('express');

var app = express();
var directoryToServe = 'client';
var port = 3000;

app.use('/', express.static(path.join(__dirname, '..', directoryToServe)));


var httpsOptions = {
    cert: fs.readFileSync(path.join(__dirname, 'ssl', 'server.crt')),
    key: fs.readFileSync(path.join(__dirname, 'ssl', 'server.key')),
};

https.createServer(httpsOptions, app)
    .listen(port, function () {
        console.log('Serving ${directoryToServe}/ directory at https://localhost:${port}');
    })