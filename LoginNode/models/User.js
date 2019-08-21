module.exports = (sequelize, type) => sequelize.define('user', {
    id: {
        type: type.INTEGER,
        primaryKey: true,
        autoIncrement: true,
    },
    // email: {
    //     type: type.STRING,
    //     allowNull: true,
    // },
    username: {
        type: type.STRING,
        allowNull: true,
    },
    password: {
        type: type.STRING,
        allowNull: true,
    },
    resetPasswordToken: type.STRING,
    resetPasswordExpires: type.DATE,
});