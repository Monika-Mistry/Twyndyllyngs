const jwt = require('jsonwebtoken');
const passport = require('passport');
const jwtSecret = require('../config/jwtConfig.js');
const User = require('../sequelize');

module.exports = app => {
    let usertype = "";
    app.post('/loginUser', (req, res, next) => {
        passport.authenticate('login', (err, users, info) => {
            if (err) {
                console.error(`error ${err}`);
            }
            if (info !== undefined) {
                if (info.message === 'bad username') {
                    res.status(401).send(info.message);
                } else {
                    res.status(403).send(info.message);
                }
            } else {
                req.logIn(users, () => {
                    User.findOne({
                        where: {
                            username: req.body.username,
                        },
                    }).then(user => {
                        usertype = user.usertype;
                        const token = jwt.sign({ id: user.id }, jwtSecret.secret, {
                            expiresIn: 60 * 60,
                        });
                        res.status(200).send({
                            auth: true,
                            token,
                            usertype,
                            message: 'user found & logged in',
                        });
                    });
                });
            }
        })(req, res, next);
    });
};