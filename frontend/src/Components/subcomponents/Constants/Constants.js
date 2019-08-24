export const loginApi = "/server/";

export const ACCESS_TOKEN = 'accessToken';

export const passValid = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})");
export const alnu8Valid = new RegExp("^(?=.[A-Za-z0-9])(?=.{8,})");
export const alnu6Valid = new RegExp("^(?=.[A-Za-z0-9])(?=.{6,})");
export const alnuValid = new RegExp("^(?=.*[A-Za-z])(?=.*[0-9])");
export const alphavalid = new RegExp("^(?=.*[A-Za-z])");
export const numValud = new RegExp("^(?=.*[0-9])");

export const headers = {
    headers: {
        'Content-Type': 'application/json',
        "Access-Control-Allow-Origin": "*",
    }
}

export function validation(value, valid) {
    const Regex = valid
    if (Regex.test(value)) {
        return true
    } else {
        return false
    }
}