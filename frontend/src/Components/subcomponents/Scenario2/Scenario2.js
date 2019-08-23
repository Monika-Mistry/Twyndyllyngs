import React, { Component } from 'react';
import { LocationMap } from './Scenario2Map.js';

export class Scenario2 extends Component {
    render() {
        return (
            <div>
                <p>Incident Occured</p>
                <LocationMap />
            </div>
        )
    }

}