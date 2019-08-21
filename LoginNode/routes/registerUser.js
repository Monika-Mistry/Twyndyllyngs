
const passport = require('passport');
const User = require('../sequelize');

module.exports = app => {
    app.post('/registerUser', (req, res, next) => {
        passport.authenticate('register', (err, user, info) => {
            if (err) {
                console.error(err);
            }
            if (info !== undefined) {
                console.error(info.message);
                res.status(403).send(info.message);
            } else {
                req.logIn(user, error => {
                    console.log(user);
                    const data = {
                        username: user.username,
                    };
                    console.log(data);
                    User.findOne({
                        where: {
                            username: data.username,
                        },
                    }).then(user => {
                        console.log(user);
                        user
                            .update({
                                email: data.email,
                            })
                            .then(() => {
                                console.log('user created in db');
                                res.status(200).send({ message: 'user created' });
                            });
                    });
                });
            }
        })(req, res, next);
    });
};
