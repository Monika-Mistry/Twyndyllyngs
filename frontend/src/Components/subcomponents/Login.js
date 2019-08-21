import React, { Component } from 'react';
import { Link } from 'react-router-dom';

export class Login extends Component {

    constructor(props) {
        super(props)
    }

    user = () => {
        this.setState({
            onLogin: "analyst"
        })

        console.log("hello")
        console.log(this.props)

    }

    audit = () => {
        this.setState({
            onLogin: "audit"
        })
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