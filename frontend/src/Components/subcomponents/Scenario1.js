import React, { Component } from 'react';
import axios from 'axios';
import Scenario from './Scenario.js';

export default class Scenario1 extends Component {

    constructor() {
        super();
        this.state = {
            data: []
        };
    }

    findByFullname = () => {
        axios.get("http://localhost:8003/getCitizensBySurname/" + "1" + "/" + this.state.searchSurname).then(response => {
            this.setState({
                data: response.data
            });
        });
    }

    handleChange1 = event => {
        this.setState({
            searchForenames: event.target.value
        });
    }

    handleChange2 = event => {
        this.setState({
            searchSurname: event.target.value
        });
    }

    render() {
        return (
            <div>
                <p>Suspect Detained</p>

                <form>
                    Please enter detainees first and last names:
                    <br></br>
                    <br></br>
                    Forenames:
                        <input type="text"
                        name="forenames"
                        value={this.state.searchForenames}
                        onChange={this.handleChange1}
                    />
                    Surname:
                    <input type="text"
                        name="surname"
                        value={this.state.searchSurname}
                        onChange={this.handleChange2}
                    />
                </form>
                <br></br>
                <button onClick={this.findByFullname}>Search</button>

                <Scenario data={this.state.data} ></Scenario>

            </div>
        )
    }
}