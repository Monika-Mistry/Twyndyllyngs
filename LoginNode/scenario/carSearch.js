const express = require("express");
const router = express.Router();
const passport = require('passport');
const jwt = require('jsonwebtoken');
const axios = require('axios');


const coreApiCar = "http://core:8000/vehicle/";

const getCarRequest = vehicleReg => {
    return axios.get(coreApiCar + vehicleReg);
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
            let vehicleReg = req.body.vehicleRegistrationNo;
            
            getCarRequest(vehicleReg).then(response => {
                res.json(response.data);
            }).catch(err => { console.error(err) })
        }
    })(req, res, next);
});

module.exports = router;