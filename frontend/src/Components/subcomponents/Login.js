import React, { Component } from 'react';

export class Login extends Component {

    user = () => {
        window.open('./home')
    }

    audit =() => {
        window.open('./audit')
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