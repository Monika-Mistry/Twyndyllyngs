const Sequelize = require('sequelize');
const db = require('./config/jwtConfig.js');

const sequelize = new Sequelize('users', 'REMOTE', db.dbpassword, {
    host: '35.242.170.11',
    port: 3306,
    dialect: 'mysql',
});

var User = sequelize.define('users', {
    username: {
        type: Sequelize.STRING,
        field: 'username'
    },
    password: {
        type: Sequelize.STRING,
        field: 'password'
    },
    usertype: {
        type: Sequelize.STRING,
        field: 'usertype'
    },
});

module.exports = User;
