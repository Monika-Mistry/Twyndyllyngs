import React from 'react';
import CitizenList from './Citizen/CitizenList.js';

export default function Scenario(props) {

    return (
        <div>
            <CitizenList data={props.data} details={props.details}/>
        </div>
    )
}
