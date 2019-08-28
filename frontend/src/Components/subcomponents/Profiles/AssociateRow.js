import React from 'react';
import { Link } from 'react-router-dom';

export function AssociateRow(props) {
    return (

        <tbody>
            {props.data.map(element => {
                return (
                <tr key={element.forenames}>
                    <td>
                        {element.forenames}
                    </td>
                    <td>
                        {element.surname}
                    </td>
                    <td>
                        {element.address}
                    </td>
                    <td>{<Link to='/Profile' onClick={() => {props.details(element)}} data={element.name}>
                            Details
                 </Link>}</td>
                </tr>)
            })}

        </tbody>
    )
}