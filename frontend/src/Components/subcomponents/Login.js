import React, { Component } from 'react';

export class Login extends Component {

    user = () => {
        window.location = './home'
    }

    audit =() => {
        window.location = './audit'
    }

    render() {
        return (
            <div>
                <p>Login Page</p>
                <button onClick={this.user}> Analyst </button>
                <button onClick={this.audit}> Audit </button>
            </div>
        )
    }

}