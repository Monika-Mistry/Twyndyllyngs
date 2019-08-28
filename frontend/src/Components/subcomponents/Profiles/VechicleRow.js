import React from 'react';

export function VehicleRow(props) {
    return (
        <tbody>
            {props.data.map(element => {
                return (
                <tr key={element.id}>
                    <td>
                        {element.timestamp}
                    </td>
                    <td>
                        {element.streetName}
                    </td>
                    <td>
                        {element.latitude}
                    </td>
                    <td>
                        {element.longitude}
                    </td>
                </tr>)
            })}

        </tbody>
    )
}