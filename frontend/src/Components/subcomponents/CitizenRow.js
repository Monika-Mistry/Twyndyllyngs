import React from 'react';

export function CitizenRow(props) {
    console.log("citizenrow")
    console.log(props.data)
    return (
        <tr>
            <td>
                {props.data.forenames}
            </td>
            <td>
                {props.data.surname}
            </td>
            <td>
                {props.data.dateOfBirth}
            </td>
            <td>
                {props.data.placeOfBirth}
            </td>
            <td>
                {props.data.sex}
            </td>
            <td>
                {props.data.homeAddress}
            </td>
        </tr>
    )
}