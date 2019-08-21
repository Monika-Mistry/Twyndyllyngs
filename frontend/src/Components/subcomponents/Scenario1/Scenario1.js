import React, { Component } from 'react';
import Scenario from '../Scenario.js';
import { Col, Button, Form, FormGroup, Label, Input } from 'reactstrap';
import { findByForename, findBySurname, findByFullName } from '../Constants/Routes.js';

export default class Scenario1 extends Component {

    constructor() {
        super();
        this.state = {
            data: []
        };
    }

    findCitizens = (e) => {
        e.preventDefault();

        let forename = e.target[0].value;
        let surname = e.target[1].value;

        if (forename && !surname) {
            findByForename(forename).then(response => {
                this.setState({
                    data: response.data
                })
            })
        } else if (surname && !forename) {
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

    render() {
        return (
            <div>
                <p>Suspect Detained</p>

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
                            <Button>Create Account</Button>
                        </Col>
                    </FormGroup>
                </Form>

                <Scenario data={this.state.data} ></Scenario>

            </div>
        )
    }
}