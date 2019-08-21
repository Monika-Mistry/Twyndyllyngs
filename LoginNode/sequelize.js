const Sequelize = require('sequelize');
// const UserModel = require('./models/User');

const sequelize = new Sequelize('users', 'root', '1234', {
    host: 'localhost',
    port: 27002,
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
    }
})

User.sync({ force: true });

module.exports = User;