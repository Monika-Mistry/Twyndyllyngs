import React from 'react';
import { Table } from 'reactstrap';
import { CitizenRow } from './CitizenRow';

export default function CitizenHeader(props) {

    return (
        <div>
            <Table>
                <thead className="table-header chameleon-grey">
                    <tr>
                        <th>Forenames</th>
                        <th>Surname</th>
                        <th>Date Of Birth</th>
                        <th>Address</th>
                        <th>See More</th>
                    </tr>
                </thead>
                <CitizenRow data={props.data} details={props.details} />
            </Table>
        </div>
    )
}
