import axios from 'axios';
import { coreApi } from './Constants.js'

export function findByForename(forename) {
    axios.get(coreApi + "/getCitizensByForenames/" + "1" + "/" + forename).then(response => {
        return response
    });
}

export function findBySurname(Surname) {
    axios.get(coreApi + "/getCitizensBySurname/" + "1" + "/" + Surname).then(response => {
        return response
    });
}

export function findByFullName(forename, surname) {
    axios.get(coreApi + "/getCitizensByFullname/" + "1" + "/" + forename + "/" + surname).then(response => {
        return response
    });
}