const express = require("express");
const router = express.Router();
const passport = require('passport');
const jwt = require('jsonwebtoken');
const axios = require('axios');

router.get("/test", (req, res) => {
    res.send("test")
});

const postMaker = (path, method) => {
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
})
}

// const coreApiAssociates = "http://core:8000/associate/getAssociatesByFullNameAndAddress";
// const associatePath = "/associate"
// const getAllAssociates = (forenames, surname, address) => {
//     return axios.get(coreApiAssociates + forenames + "/" + surname + "/" + address);
// };
// postMaker(associatePath, getAllAssociates)

// const coreApiMobile = "http://core:8000/mobile/getMobileByFullnameAndAddress";
// const mobilePath = "/mobile"
// const getAllMobile = (forenames, surname, address) => {
//     return axios.get(coreApiMobile + forenames + "/" + surname + "/" + address);
// };
// postMaker(mobilePath, getAllMobile)

const coreApivehicle = "http://core:8000/vehicle/findVehicleByForenameSurnameAddress/";
const vehiclePath = "/vehicle"
const getAllvehicle = (forenames, surname, address) => {
    return axios.get(coreApivehicle + forenames + "/" + surname + "/" + address);
};
postMaker(vehiclePath, getAllvehicle)

module.exports = router;
