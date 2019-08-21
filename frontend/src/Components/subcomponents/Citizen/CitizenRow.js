import React from 'react';

export function CitizenRow(props) {
    return (

        <tbody>
            {props.data.map(element => {
                return (
                <tr key={element.citizenId}>
                    <td>
                        {element.forenames}
                    </td>
                    <td>
                        {element.surname}
                    </td>
                    <td>
                        {element.dateOfBirth}
                    </td>
                    <td>
                        {element.placeOfBirth}
                    </td>
                    <td>
                        {element.sex}
                    </td>
                    <td>
                        {element.homeAddress}
                    </td>
                </tr>)
            })}

        </tbody>
    )
}