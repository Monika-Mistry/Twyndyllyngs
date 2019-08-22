const express = require("express");
const router = express.Router();
const passport = require('passport');
const jwt = require('jsonwebtoken');
const axios = require('axios');

const coreApiCitizen = "http://core:8000/citizen/";

const getAllCitizenRequest = (forename, surname) => {
    return axios.get(coreApiCitizen + forename + "/" + surname);
};

const getACitizenRequest = (id) => {
    return axios.get(coreApiCitizen + id);
};

router.get("/test", (req, res) => {
    res.send("test")
});


router.get("/", (req, res, next) => {
    passport.authenticate('jwt', { session: false }, (err, user, info) => {
        if (err) {
            console.error(err);
        }
        if (info !== undefined) {
            res.status(401).send(info.message);
        } else {
            let forename = req.forename;
            let surname = req.surname;
            getAllCitizenRequest(forename, surname).then(response => {
                res.json(response.data);
            }).catch(err => { console.error(err) })
        }
    })(req, res, next);
});

router.get("/profile", (req, res, next) => {
    passport.authenticate('jwt', { session: false }, (err, user, info) => {
        if (err) {
            console.error(err);
        }
        if (info !== undefined) {
            res.status(401).send(info.message);
        } else {
            let id = req.id;
            getACitizenRequest(id).then(response => {
                res.json(response.data);
            }).catch(err => { console.error(err) })
        }
    })(req, res, next);
});

module.exports = router;



