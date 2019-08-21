import axios from 'axios';
import { coreApi } from './Constants.js'

export function findByForename(forename) {
    return axios.get(coreApi + "/getCitizensByForenames/" + "1" + "/" + forename)
}

export function findBySurname(Surname) {
    return axios.get(coreApi + "/getCitizensBySurname/" + "user" + "/" + Surname)
}

export function findByFullName(forename, surname) {
    return axios.get(coreApi + "/getCitizensByFullname/" + "1" + "/" + forename + "/" + surname)
}