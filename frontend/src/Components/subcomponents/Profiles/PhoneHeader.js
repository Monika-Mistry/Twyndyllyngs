import React from 'react';
import { Table } from 'reactstrap';
import { PhoneRow } from './PhoneRow.js';

export function PhoneHead(props) {

    return (
        <div>
            <Table>
                <thead>
                    <tr>
                        <th>Value</th>
                    </tr>
                </thead>
                <PhoneRow data={props.data}/>
            </Table>
        </div>
    )
}