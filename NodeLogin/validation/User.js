const Validator = require("validator");
const isEmpty = require("./is-empty");

module.exports = function validateUserInput(data) {
  let errors = {};

  data.username = !isEmpty(data.username) ? data.username : "";
  data.role = !isEmpty(data.role) ? data.role : "";
  data.password = !isEmpty(data.password) ? data.password : "";
  data.password2 = !isEmpty(data.password2) ? data.password2 : "";

  if (!Validator.isAlphanumeric(data.username)) {
    errors.username = "Username is invalid";
  }

  if (Validator.isEmpty(data.username)) {
    errors.username = "Username field is required";
  }

  if (Validator.isEmpty(data.role)) {
    errors.email = "Role field is required";
  }

  if (!Validator.equals(data.password, data.password2)) {
    errors.password = "Passwords do not match";
  }

  if (Validator.isEmpty(data.password)) {
    errors.password = "Password field is required";
  }

  if (Validator.isEmpty(data.password2)) {
    errors.password2 = "Password2 field is required";
  }

  return {
    errors,
    isValid: isEmpty(errors)
  };
};
