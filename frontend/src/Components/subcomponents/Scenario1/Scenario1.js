import React, { Component } from 'react';
import Scenario from '../Scenario.js';
import { Col, Button, Form, FormGroup, Label, Input } from 'reactstrap';
import { findCitizens } from '../Constants/Routes.js';
import { Link } from 'react-router-dom';

export class Scenario1 extends Component {

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


        findCitizens(forename, surname).then(response => {
            this.setState({
                data: response.data
            })
        })

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
                <br></br>
                <br></br>
                <p> <Link to='/Profile'>profile</Link></p>
                <Scenario data={this.state.data} details={this.details} ></Scenario>

            </div>
        )
    }
}