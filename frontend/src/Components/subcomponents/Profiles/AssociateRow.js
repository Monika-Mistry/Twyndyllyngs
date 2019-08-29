import React from 'react';

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
                </tr>)
            })}

        </tbody>
    )
}