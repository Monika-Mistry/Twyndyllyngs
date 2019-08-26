import React from 'react';

export function PhoneRow(props) {
    return (
        <tbody>
            {props.data.map(element => {
                return (
                <tr key={element.id}>
                    <td>
                        {element.value}
                    </td>
                </tr>)
            })}

        </tbody>
    )
}