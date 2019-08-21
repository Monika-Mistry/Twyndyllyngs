import React, { Component } from 'react';
import { Link } from "react-router-dom";

export class Audit extends Component {
    render() {
        return (
            <div>
            <p>Audit Home</p>
                <Link to="/CreateAnalyst">
                    <button>Create Analyst</button>
                </Link>
            </div>
        )
    }

}