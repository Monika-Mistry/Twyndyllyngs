
const passport = require('passport');
const User = require('../sequelize');
const validateUserInput = require("../validation/User");

module.exports = app => {
    app.post('/registerUser', (req, res, next) => {
        const { errors, isValid } = validateUserInput(req.body);
        if (!isValid) {
            return res.status(400).json(errors);
        }
        passport.authenticate('register', (err, user, info) => {
            if (err) {
                console.error(err);
            }
            if (info !== undefined) {
                res.status(403).send(info.message);
            } else {
                req.logIn(user, error => {
                    const data = {
                        username: user.username,
                    };
                    User.findOne({
                        where: {
                            username: data.username,
                        },
                    }).then(user => {
                        res.status(200).send({ message: 'user created' })
                    });
                });
            }
        })(req, res, next);
    });
};
