import React, { Component } from 'react';
import { Link } from "react-router-dom";

export class Audit extends Component {
    render() {
        return (
            <div>
            <p>Audit Home</p>
            
            <button>
                <Link to="/CreateAnalyst">Create Analyst</Link>
            </button>

            </div>
        )
    }

}