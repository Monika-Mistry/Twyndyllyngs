import React, { Component } from 'react';
import { Link } from 'react-router-dom';

export class Login extends Component {

    constructor(props) {
        super(props)
    }

    user = () => {
        let value = "analyst"
        this.props.onLogin(value)
    }

    audit = () => {
        let value = "audit"
        this.props.onLogin(value)
    }

    render() {
        return (
            <div>
                <p>Login Page</p>
                <Link to='./home' onClick={this.user}>
                    <button> Analyst </button>
                </Link>
                <Link to='./audit' onClick={this.audit}>
                    <button> Audit </button>
                </Link>
                <p> <Link to='/forgot'> Forgotten Password?</Link></p>
            </div>
        )
    }
}