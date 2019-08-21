import React, { Component } from 'react';
import axios from 'axios';

export class CreateAnalyst extends Component {

    constructor() {
        super();

        this.state={
            error: ""
        }
    }

    createAnalyst = (event) => {

        event.preventDefault();

        let newAnalyst = {
            username: event.target[0].value,
            email: event.target[1].value,
            password: event.target[2].value
        }

        axios
            .post("http://...", newAnalyst)
            .then(response => {
                console.log(response);
            })
            .catch(err => console.log(err))
    }

    render() {
        return (
            <div>
                <h1>Register Analyst</h1>
                <form onSubmit={this.createAnalyst}>
                    <p>Username:</p>
                    <input type="text" placeholder="username"></input>
                    <br></br>
                    <p>Email:</p>
                    <input type="text" placeholder="e.g. twyndyllyngs@email.com"></input>
                    <br></br>
                    <p>Password:</p>
                    <input type="text" placeholder="password"></input>
                    <br></br>
                    <button type="submit">Create</button>
                </form>
            </div>
        )
    }
}