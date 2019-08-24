import React, { Component } from 'react';
import Scenario from '../Scenario.js';
import { Col, Button, Form, FormGroup, Label, Input } from 'reactstrap';
import { findCitizens } from '../Constants/Routes.js';
import { Link } from 'react-router-dom';
import { validation, alphavalid } from '../Constants/Constants.js';

export class Scenario1 extends Component {

    constructor() {
        super();
        this.state = {
            data: []
        };
    }

    findCitizens = (e) => {
        e.preventDefault();

        let user = {
            forenames: this.nullify(e.target[0].value),
            surname: this.nullify(e.target[1].value)
        }

        if (user.forenames === "null" && user.surname === "null") {
            document.getElementById("searchError").innerText = "Please Fill at least 1 search box"
        } else {

            if (validation(user.forenames, alphavalid) && validation(user.surname, alphavalid)) {
                document.getElementById("searchError").innerText = ""
                findCitizens(user).then(response => {
                    this.setState({
                        data: response.data
                    })
                }).catch(response => {
                    console.error(response);
                })
                console.log(user)
            } else {
                document.getElementById("searchError").innerText = "Search Criteria is invalid"
            }
        }
    }

    nullify = (value) => {
        if (!value) {
            return value = "null"
        } else {
            return value
        }
    }

    details = (element) => {
        console.log(element._id);
        console.log(element.forename);

        sessionStorage.setItem('forename', element.forename);
        window.open("/Profile");
    }

    render() {
        return (
            <div>
                <Form onSubmit={this.findCitizens} className="search-form">
                    <FormGroup row>
                        <Col>
                            <Label for="forname">Forename:</Label>
                        </Col>
                        <Col>
                            <Input type="text" name="forname" placeholder="enter forename" />
                        </Col>
                        <Col>
                            <Label for="forname">Surename:</Label>
                        </Col>
                        <Col>
                            <Input type="text" name="surname" placeholder="enter surname" />
                        </Col>
                        <Col>
                            <Button>Search</Button>
                        </Col>
                    </FormGroup>
                </Form>
                <p id="searchError" style={{ color: 'red' }}></p>
                <br></br>
                <br></br>
                <p> <Link to='/Profile'>profile</Link></p>
                <Scenario data={this.state.data} details={this.details} ></Scenario>

            </div>
        )
    }
}