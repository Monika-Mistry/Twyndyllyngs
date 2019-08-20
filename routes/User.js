const express = require("express");
const router = express.Router();

const User = require("../models/user");
const validateUserInput = require("../validation/User");
const bcrypt = require("bcryptjs");

// @route   GET user/all
// @desc    Get all users
// @access  Public
router.get("/all", (req, res) => {
  const errors = {};
  User.find({}, '-password')
    .then(users => {
      if (!users) {
        errors.noUsers = "There are no users";
        res.status(404).json(errors);
      }

      res.json(users);
    })
    .catch(err => res.status(404).json({ noUsers: "There are no users" }));
});

// @route   GET user
// @desc    login a specific user
// @access  Public
router.post("/loginUser", (req, res) => {

  User.findOne({ username: req.body.username })
    .then(user => {
      if (!user) {
        return res.status(200).send("Username is incorrect");
      } else {
        bcrypt.compare(req.body.password, user.password, function (err, result) {
          if (result == true) {
            return res.status(200).json({ message: "User successfully logged in" });
          } else {
            res.send("Incorrect Password");
          }
        });
      }
    });
});

// @route   POST user/createuser
// @desc    Create a user
// @access  Public
router.post("/createUser", (req, res) => {

  const { errors, isValid } = validateUserInput(req.body);
  if (!isValid) {
    console.log(errors)
    return res.json(errors);
  }

  const newUser = new User({
    username: req.body.username,
    password: req.body.password,
    password2: req.body.password2,
    role: req.body.role
  });

  // hash the password
  bcrypt.genSalt(10, (err, salt) => {
    bcrypt.hash(newUser.password, salt, (err, hash) => {
      if (err) throw err;
      newUser.password = hash;
      newUser.save().then(user => res.json({ message: "New user successfully registered" }))
        .catch(err => res.json({ message: "Username and/or e-mail already exists" }));
    });
  });
});

module.exports = router;
