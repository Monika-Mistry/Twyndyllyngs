import React, { Component } from 'react';
import { Form, FormGroup, Col, Label, Input, Button } from 'reactstrap';
import { validation, passValid, alnu8Valid} from '../Constants/Constants.js';
import { registerUser} from '../Constants/Routes.js';
import { Redirect } from 'react-router-dom';

export class CreateAnalyst extends Component {

    constructor() {
        super();

        this.state = {
            error: ""
        }
    }

    createAnalyst = (e) => {
        e.preventDefault();

        let newUser = {
            username: e.target[0].value,
            role: "analyst",
            password: e.target[1].value,
            password2: e.target[2].value,
        }

        if (validation(newUser.password, passValid)) {
            console.log("ay")
            document.getElementById("passError").innerText = ""
            if (newUser.password === newUser.password2) {
                document.getElementById("pass2valid").innerText = "Passwords match"
                document.getElementById("pass2Error").innerText = ""

                if (validation(newUser.username, alnu8Valid)) {
                    document.getElementById("nameError").innerText = ""
                    registerUser(newUser).then(() => { 
                        return <Redirect to='/auditor' />
                    }).catch( res => {
                        console.log(res)
                    })
                } else {
                    document.getElementById("nameError").innerText = "Username must contain 1 Upper and 1 Lower case letter and a Number"
                }
            } else {
                document.getElementById("pass2valid").innerText = ""
                document.getElementById("pass2Error").innerText = "Passwords do not match"
            }
        } else {
            document.getElementById("passError").innerText = "Passwords must contain 1 Upper letter, 1 Lower Case letter, 1 Number and a special character"
        }
    }

    render() {
        return (
            <div>
                <h1>Register Analyst</h1>
                <Form onSubmit={this.createAnalyst} className="search-form">
                    <FormGroup row>
                        <Col sm={1}>
                            <Label for="forname">Username:</Label>
                        </Col>
                        <Col sm={3}>
                            <Input type="text" name="username" placeholder="enter username" required />
                        </Col>
                        <Col>
                            <p id='nameError' style={{ color: 'red' }}></p>
                        </Col>
                    </FormGroup>
                    <FormGroup row>
                        <Col sm={1}>
                            <Label for="password">Password:</Label>
                        </Col>
                        <Col sm={3}>
                            <Input type="password" name="password" placeholder="enter password" required />
                        </Col>
                        <Col>
                            <p id='passError' style={{ color: 'red' }}></p>
                        </Col>
                    </FormGroup>
                    <FormGroup row>
                        <Col sm={1}>
                            <Label for="password">Confirm Password:</Label>
                        </Col>
                        <Col sm={3}>
                            <Input type="password" name="password2" placeholder="confirm password" required />
                        </Col>
                    </FormGroup>
                    <FormGroup row>
                        <p id='pass2valid' style={{ color: 'green' }}></p>
                        <p id='pass2Error' style={{ color: 'red' }}></p>
                    </FormGroup>
                    <FormGroup row>
                        <Col sm={{ size: 2, offset: 1 }}>
                            <Button>Login</Button>
                        </Col>
                    </FormGroup>
                </Form>

            </div>
        )
    }
}