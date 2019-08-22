import React from 'react';
import CitizenHeader from './CitizenHeader';

export default function CitizenList(props) {

    return (
        <div>
            <CitizenHeader data={props.data } details={props.details}/>
        </div>
    )
}