const express = require("express");
const router = express.Router();
const passport = require('passport');
const jwt = require('jsonwebtoken');
const axios = require('axios');

const coreApiCitizen = "http://core:8000/citizen/";

const getAllCitizenRequest = (forenames, surname) => {
    return axios.get(coreApiCitizen + forenames + "/" + surname);
};

const getACitizenRequest = (id) => {
    return axios.get(coreApiCitizen + "getById/" + id);
};

router.get("/test", (req, res) => {
    res.send("test")
});


router.post("/", (req, res, next) => {
    passport.authenticate('jwt', { session: false }, (err, user, info) => {
        if (err) {
            console.error(err);
        }
        if (info !== undefined) {
            res.status(401).send(info.message);
        } else {
            let forenames = req.body.forenames;
            let surname = req.body.surname;
            getAllCitizenRequest(forenames, surname).then(response => {
                res.json(response.data);
            }).catch(err => { console.error(err) })
        }
    })(req, res, next);
});

router.post("/profile", (req, res, next) => {
    passport.authenticate('jwt', { session: false }, (err, user, info) => {
        if (err) {
            console.error(err);
        }
        if (info !== undefined) {
            res.status(401).send(info.message);
        } else {
            let id = req.body.id;
            getACitizenRequest(id).then(response => {
                res.json(response.data);
            }).catch(err => { console.error(err) })
        }
    })(req, res, next);
});

module.exports = router;



