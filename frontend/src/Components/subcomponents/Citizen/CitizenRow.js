import React from 'react';
import { Button } from 'reactstrap';

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
                        {element.homeAddress}
                    </td>
                    <td>{<Button onClick={() => {props.details(element)}} data={element.name}>
                            Details
                 </Button>}</td>
                </tr>)
            })}

        </tbody>
    )
}