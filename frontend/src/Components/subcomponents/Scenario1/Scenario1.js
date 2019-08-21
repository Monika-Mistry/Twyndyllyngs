import React, { Component } from 'react';
import axios from 'axios';
import Scenario from '../Scenario.js';
import { findByForename, findBySurname, findByFullName } from '../Constants/Routes.js'
import {coreApi} from '../Constants/Constants.js'

export default class Scenario1 extends Component {

    constructor() {
        super();
        this.state = {
            data: []
        };
    }

    findCitizens = () => {
        
        let forename = this.state.searchForenames;
        let surname = this.state.searchSurname;

        console.log(forename + surname)

        if(forename && !surname) {
            findByForename(forename).then(response => {
                this.setState({
                    data: response.data
                })
            })
        } else if ( surname && !forename) {
            findBySurname(surname).then(response => {
                this.setState({
                    data: response.data
                })
            })
           }
         else {
            findByFullName(forename, surname).then(response => {
                this.setState({
                    data: response.data
                })
            })
        }
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
                <button onClick={this.findCitizens}>Search</button>

                <Scenario data={this.state.data} ></Scenario>

            </div>
        )
    }
}