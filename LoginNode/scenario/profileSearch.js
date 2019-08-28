const express = require("express");
const router = express.Router();
const passport = require('passport');
const jwt = require('jsonwebtoken');
const axios = require('axios');

const coreApiVehicle = "http://core:8000/vehicle/findVehicleByFullnameAndAddress/";

const getVehicleRequest = (forenames, surname, address) => {
    return axios.get(coreApiVehicle +  "/" + forenames + "/" + surname + "/" + address);
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
            let address = req.body.address;
            getVehicleRequest(forenames, surname, address).then(response => {
                res.json(response.data);
            }).catch(err => { console.error(err) })
        }
    })(req, res, next);
});

module.exports = router;