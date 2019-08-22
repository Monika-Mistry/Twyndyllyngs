import axios from 'axios';

import {coreApiCar} from './urlConstants';

export function getCarRequest(vehicleReg){
    return axios.get(coreApiCar + vehicleReg);
}