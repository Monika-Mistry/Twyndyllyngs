module.exports = (sequelize, type) => sequelize.define('user', {
    id: {
        type: type.INTEGER,
        primaryKey: true,
        autoIncrement: true,
    },
    email: {
        type: type.STRING,
        allowNull: false,
    },
    username: {
        type: type.STRING,
        allowNull: false,
    },
    password: {
        type: type.STRING,
        allowNull: false,
    },
    resetPasswordToken: type.STRING,
    resetPasswordExpires: type.DATE,
});