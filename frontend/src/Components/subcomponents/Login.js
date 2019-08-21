import React, { Component } from 'react';
import { Link } from 'react-router-dom';

export class Login extends Component {

    render() {
        return (
            <div>
                <p>Login Page</p>
                <Link to='./home'>
                    <button> Analyst </button>
                </Link>
                <Link to='./audit'>
                    <button> Audit </button>
                </Link>
                <p> <Link to='/forgot'> Forgotten Password?</Link></p>
            </div>
        )
    }

}