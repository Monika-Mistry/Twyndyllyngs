import React, { Component } from 'react';

export class CreateAnalyst extends Component {

    constructor() {
        super();

        this.state={
            error: ""
        }
    }

    createAnalyst = (event) => {

        event.preventDefault();
        
    }

    render() {
        return (
            <div>
                <h1>Register Analyst</h1>
                <form onSubmit={this.createAnalyst}>
                    <p>Username:</p>
                    <input type="text" placeholder="username" required></input>
                    <br></br>
                    <p>Email:</p>
                    <input type="text" placeholder="email" required></input>
                    <br></br>
                    <p>Password:</p>
                    <input type="text" placeholder="password" required></input>
                    <br></br>
                    <button type="submit">Create</button>
                </form>
            </div>
        )
    }
}