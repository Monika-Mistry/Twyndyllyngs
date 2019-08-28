export const loginApi = "/login/";

export const passValid = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?=.{8,})");
export const alnu8Valid = new RegExp("^(?=.[A-Za-z0-9])(?=.{8,})");
export const alnu6Valid = new RegExp("^(?=.[A-Za-z0-9])(?=.{6,})");
export const alnuValid = new RegExp("^(?=.*[A-Za-z])(?=.*[0-9])");
export const alphavalid = new RegExp("^(?=.*[A-Za-z])");
export const numValud = new RegExp("^(?=.*[0-9])");
export const latValid = /^[-+]?([1-8]?\d(\.\d+)?|90(\.0+)?)$/;
export const longValid = /^[-+]?(180(\.0+)?|((1[0-7]\d)|([1-9]?\d))(\.\d+)?)$/;

export const header = {
    headers: {
        'Content-Type': `application/json`,
        'Authorization': `JWT ${sessionStorage.getItem("JWToken")}`,
        'username': `${sessionStorage.getItem("username")}`
    }
}

export function validation(value, valid) {
    if (valid.test(value)) {
        return true
    } else {
        return false
    }
}
