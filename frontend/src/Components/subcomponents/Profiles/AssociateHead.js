import React from 'react';
import { Table } from 'reactstrap';
import { AssociateRow } from './AssociateRow.js';

export function AssociateHead(props) {

    return (
        <div>
            <Table>
                <thead>
                    <tr>
                        <th>Forenames</th>
                        <th>Surname</th>
                        <th>Address</th>
                    </tr>
                </thead>
                <AssociateRow data={props.data}/>
            </Table>
        </div>
    )
}
