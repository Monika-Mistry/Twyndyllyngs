import React from 'react';
import CitizenList from './CitizenList.js';

export default function Scenario(props) {

    return (
        <div>
            <CitizenList data={props.data} />
        </div>
    )
}
