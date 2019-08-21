import axios from 'axios';
import { coreApi } from './Constants.js'

export function findByForename(forename) {
    return axios.get(coreApi + "/getCitizensByForenames/user/" + forename)
}

export function findBySurname(Surname) {
    return axios.get(coreApi + "/getCitizensBySurname/user/" + Surname)
}

export function findByFullName(forename, surname) {
    return axios.get(coreApi + "/getCitizensByFullname/user/" + forename + "/" + surname)
}