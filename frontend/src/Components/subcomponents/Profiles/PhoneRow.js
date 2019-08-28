import React from 'react';

export function PhoneRow(props) {
    return (
        <tbody>
            {props.data.map(element => {
                return (
                <tr key={element.id}>
                    <td>
                        {element.timestamp}
                    </td>
                    <td>
                        {element.receiverMSISDN}
                    </td>
                    <td>
                        {element.callCellTowerId}
                    </td>
                    <td>
                        {element.receiverTowerId}
                    </td>
                </tr>)
            })}

        </tbody>
    )
}