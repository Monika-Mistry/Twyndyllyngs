const passport = require('passport');
const User = require('../sequelize');

module.exports = (app) => {
    app.get('/findUser', (req, res, next) => {
        passport.authenticate('jwt', { session: false }, (err, user, info) => {
            if (err) {
                console.error(err);
            }
            if (info !== undefined) {
                res.status(401).send(info.message);
            } else if (user.username === req.query.username) {
                User.findOne({
                    where: {
                        username: req.query.username,
                    },
                }).then((userInfo) => {
                    if (userInfo != null) {
                        res.status(200).send({
                            auth: true,
                            username: userInfo.username,
                            password: userInfo.password,
                            message: 'user found in db',
                        });
                    } else {
                        res.status(401).send('no user exists in db with that username');
                    }
                });
            } else {
                res.status(403).send('username and jwt token do not match');
            }
        })(req, res, next);
    });
};