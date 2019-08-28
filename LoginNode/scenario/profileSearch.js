const express = require("express");
const router = express.Router();
const passport = require('passport');
const jwt = require('jsonwebtoken');
const axios = require('axios');

const coreApiVehicle = "http://core:8000/vehicle/findVehicleByFullnameAndAddress/";
const coreApiMobile = "http://core:8000/mobile/getMobileByFullnameAndAddress/";
const coreApiRecords = "http://core:8000/mobile/getCallRecordsByCaller/";


const vehiclePath = "/vehicle"
const mobilePath = "/mobile"


const getVehicleRequest = (forenames, surname, address) => {
    return axios.get(coreApiVehicle + "/" + forenames + "/" + surname + "/" + address);
};

const getMobileRequest = (forenames, surname, address) => {
    return axios.get(coreApiMobile + "/" + forenames + "/" + surname + "/" + address);
};

const getPhoneRecords = (number) => {
    return axios.get(coreApiRecords + "/" + number);
};

const makeRequest = (path, method) => {
    router.post(path, (req, res, next) => {
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
                method(forenames, surname, address).then(response => {
                    res.json(response.data);
                }).catch(err => { console.error(err) })
            }
        })(req, res, next);
    });
}

makeRequest(vehiclePath, getVehicleRequest)

makeRequest(mobilePath, getMobileRequest)

router.post("/phoneRecords", (req, res, next) => {
    passport.authenticate('jwt', { session: false }, (err, user, info) => {
        if (err) {
            console.error(err);
        }
        if (info !== undefined) {
            res.status(401).send(info.message);
        } else {
            let number = req.body.number;
            getPhoneRecords(number).then(response => {
                res.json(response.data);
            }).catch(err => { console.error(err) })
        }
    })(req, res, next);
});

router.get("/test", (req, res) => {
    res.send("test")
});

module.exports = router;