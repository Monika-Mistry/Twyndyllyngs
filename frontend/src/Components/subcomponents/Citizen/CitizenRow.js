import React from 'react';
import { Button } from 'reactstrap';
import { Link } from 'react-router-dom';

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
                    <td>{<Link onClick={() => {props.details(element)}} data={element.name}>
                            Details
                 </Link>}</td>
                </tr>)
            })}

        </tbody>
    )
}