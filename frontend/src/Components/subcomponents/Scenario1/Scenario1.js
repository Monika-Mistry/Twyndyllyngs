import React, { Component } from 'react';
import Scenario from '../Scenario.js';
import { Col, Button, Form, FormGroup, Label, Input } from 'reactstrap';
import { findCitizens } from '../Constants/Routes.js';
import { Link, Redirect } from 'react-router-dom';
import { validation, alphavalid } from '../Constants/Constants.js';

export class Scenario1 extends Component {

    constructor() {
        super();
        this.state = {
            data: [],
            forenames: "",
            surname: "",
            address: "",
            profile: false
        };
    }

    findCitizens = (e) => {
        e.preventDefault();

        let user = {
            forenames: this.nullify(e.target[0].value),
            surname: this.nullify(e.target[1].value),
            address: this.nullify(e.target[2].value),
            username: sesstionStorage.getItem("username")
        }

        console.log((e.target[2].value))

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
                    console.error(response.message);
                })
                console.log(user)
                console.log(sessionStorage.getItem('JWToken'))
            } else {
                document.getElementById("searchError").innerText = "Search Criteria is invalid. \n Please do not enter any numbers or special characters."
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
        console.log(element)
        sessionStorage.setItem('forenames', element.forenames);
        sessionStorage.setItem('surname', element.surname);
        sessionStorage.setItem('address', element.homeAddress);
    }

    render() {
        if (this.state.profile) {
            return <Redirect to='/Profile' />
        }
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
                            <Label for="surname">Surname:</Label>
                        </Col>
                        <Col>
                            <Input type="text" name="surname" placeholder="enter surname" />
                        </Col>
                        <Col>
                            <Label for="address">Address:</Label>
                        </Col>
                        <Col>
                            <Input type="text" name="address" placeholder="enter address here" />
                        </Col>
                        <Col>
                            <Button>Search</Button>
                        </Col>
                    </FormGroup>
                </Form>
                <p id="searchError" style={{ color: 'red' }}></p>
                <br></br>
                <br></br>
                <Scenario data={this.state.data} details={this.details} ></Scenario>

            </div>
        )
    }
}