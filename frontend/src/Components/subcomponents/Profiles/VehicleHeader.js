import React from 'react';
import { Table } from 'reactstrap';
import  {VehicleRow}  from './VechicleRow.js';

export function VehicleHeader(props) {

    return (
        <div>
            <Table>
                <thead className="table-header">
                    <tr>
                        <th>Time Stamp</th>
                        <th>Street Address</th>
                        <th>Latitude</th>
                        <th>Longitude</th>
                    </tr>
                </thead>
                <VehicleRow data={props.data}/>
            </Table>
        </div>
    )
}