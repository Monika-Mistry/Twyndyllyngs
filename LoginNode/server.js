const express = require('express');
const Cors = require('cors');
const bodyParser = require('body-parser');
const logger = require('morgan');
const passport = require('passport');

const app = express();
const API_PORT = process.env.API_PORT || 8002;

app.use(Cors());
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());
app.use(logger('dev'));
app.use(passport.initialize());
app.listen(API_PORT, () => console.log(`Listening on port ${API_PORT}`));

require('./config/passport');
require('./routes/loginUser')(app);
require('./routes/findUsers.js')(app);
require('./routes/registerUser.js')(app);

const carSearch = require('./scenario/carSearch.js');
const citizenSearch = require('./scenario/citizenSearch.js');
const profileSearch = require('./scenario/profileSearch.js');

app.use("/getCarDetails",carSearch);
app.use("/getCitizenDetails", citizenSearch);
app.use("/ProfileDetails", profileSearch);

module.exports = app;