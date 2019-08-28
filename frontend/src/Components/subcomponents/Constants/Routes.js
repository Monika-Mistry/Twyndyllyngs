import axios from 'axios';
import { loginApi, header} from './Constants.js'

export function findCitizens(citizens) {
    return axios.post(loginApi + "getCitizenDetails/", citizens, header)
    
}

export function findCitizenVehicle(citizen) {
    return axios.post(loginApi + "ProfileDetails/vehicle/", citizen, header)
}

export function findCitizenMobile(citizen) {
    return axios.post(loginApi + "ProfileDetails/mobile/", citizen, header)
}

export function findPhoneRecords(number) {
    return axios.post(loginApi + "ProfileDetails/phoneRecords/", number, header)
}

export function findAssociates(citizen) {
    return axios.post(loginApi + "ProfileDetails/associates/", citizen, header)
}

findAssociates

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