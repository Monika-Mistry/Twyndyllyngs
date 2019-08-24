import axios from 'axios';
import { loginApi, headers } from './Constants.js'

export function findCitizens(citizens) {
    return axios.post(loginApi + "/getCitizenDetails/", citizens, headers)
}

export function findCar(vehicleRegistrationNo) {
    return axios.post(loginApi + "/getCarDetails/", vehicleRegistrationNo, headers)
}

export function findCitizenById(id) {
    return axios.post(loginApi + "/getCitizenDetails/Profile", id, headers)
}

export function registerUser(newUser) {
    return axios.post(loginApi + "/registerUser", newUser, headers)
}

export function loginUser(user) {
    return axios.post(loginApi + "/loginUser", user, headers)
}