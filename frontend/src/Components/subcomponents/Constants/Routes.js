import axios from 'axios';
import { loginApi, header} from './Constants.js'

export function findCitizens(citizens) {
    return axios.post(loginApi + "getCitizenDetails/", citizens, header)
    
}


export function findCar(vehicleRegistrationNo) {
    return axios.post(loginApi + "getCarDetails/", vehicleRegistrationNo, header)
}

export function findCitizenById(id) {
    return axios.post(loginApi + "getCitizenDetails/Profile", id, header)
}

export function registerUser(newUser) {
    return axios.post(loginApi + "registerUser", newUser, header)
}

export function loginUser(user) {
    return axios.post(loginApi + "loginUser", user)
}