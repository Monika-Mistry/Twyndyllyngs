const express = require('express');
const Cors = require('cors');
const bodyParser = require('body-parser');
const logger = require('morgan');
const swaggerJSDoc = require('swagger-jsdoc');
const swaggerUi = require('swagger-ui-express');
const passport = require('passport');

const app = express();

const API_PORT = process.env.API_PORT || 8002;

const swaggerDefinition = {
    info: {
        title: 'MySQL Registration Swagger API',
        version: '1.0.0',
        description: 'Endpoints to test the user registration routes',
    },
    host: 'localhost:8002',
    basePath: '/',
    securityDefinitions: {
        bearerAuth: {
            type: 'apiKey',
            name: 'Authorization',
            scheme: 'bearer',
            in: 'header',
        },
    },
};

const options = {
    swaggerDefinition,
    apis: ['./routes/*.js'],
};

const swaggerSpec = swaggerJSDoc(options);

app.get('/swagger.json', (req, res) => {
    res.setHeader('Content-Type', 'application/json');
    res.send(swaggerSpec);
});

require('./config/passport');

app.use('/api-docs', swaggerUi.serve, swaggerUi.setup(swaggerSpec));
app.use(Cors());
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());
app.use(logger('dev'));
app.use(passport.initialize());

require('./routes/loginUser')(app);
require('./routes/findUsers.js')(app);

app.listen(API_PORT, () => console.log(`Listening on port ${API_PORT}`));

module.exports = app;