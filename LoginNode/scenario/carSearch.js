const express = require("express");
const router = express.Router();
const axios = require("axios");
import passport from "passport";

import { getCarDetails } from './urlConstants';
import { getCarRequest } from './routesConstants';

router.get(getCarDetails, (req, res, next) => {
    passport.authenticate('jwt', { session: false }, (err, user, info) => {
        if (err) {
            console.error(err);
        }
        if (info !== undefined) {
            res.status(401).send(info.message);
        } else {
            let vehicleReg = req.vehicleReg;
            getCarRequest(vehicleReg).then(response => {
                res.json(response.data);
            }).catch(err => { console.error(err) })
        }
    })(req, res, next);
})