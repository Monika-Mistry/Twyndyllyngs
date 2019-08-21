import React from 'react';
import { Table } from 'reactstrap';
import { CitizenRow } from './CitizenRow';

export default function CitizenHeader(props) {

    return (
        <div>
            <Table>
                <thead>
                    <tr>
                        <th>Forenames</th>
                        <th>Surname</th>
                        <th>Date Of Birth</th>
                        <th>Place of Birth</th>
                        <th>Gender</th>
                        <th>Home Address</th>
                    </tr>
                </thead>
                <CitizenRow data={props.data} />
            </Table>
        </div>
    )
}
