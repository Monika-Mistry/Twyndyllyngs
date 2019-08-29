import React from 'react';
import { Table } from 'reactstrap';
import { PhoneRow } from './PhoneRow.js';

export function PhoneHead(props) {

    return (
        <div>
            <Table>
                <thead>
                    <tr>
                        <th>Time Stamp</th>
                        <th>Recipient</th>
                        <th>Caller Tower</th>
                        <th>Reciever Tower</th>
                    </tr>
                </thead>
                <PhoneRow data={props.data}/>
            </Table>
        </div>
    )
}