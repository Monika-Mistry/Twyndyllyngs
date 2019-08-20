const Sequelize = require('sequelize');
const UserModel = require('./models/User');

const sequelize = new Sequelize('users', 'root', '1234', {
    host: 'localhost',
    port: 27002,
    dialect: 'mysql',
});

const User = UserModel(sequelize, Sequelize);

sequelize.sync().then(() => {
    console.log('Users db and user table have been created');
});

module.exports = User;