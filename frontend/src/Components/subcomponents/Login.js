import React, { Component } from 'react';
import { Link, Redirect } from 'react-router-dom';
import { Form, FormGroup, Col, Label, Input, Button } from 'reactstrap';
import { loginUser } from './Constants/Routes.js'

export class Login extends Component {

    constructor() {
        super()
        this.state = {
            username: "",
            password: "",
            errorMessage: ""
        }
    }

    login = (e) => {
        e.preventDefault();

        let user = {
            username: e.target[0].value,
            password: e.target[1].value
        }

        loginUser(user).then(response => {
            sessionStorage.setItem("JWToken", response.data.token)
            sessionStorage.setItem("username", user.username);
            this.props.onLogin(response.data.usertype)
        }).catch(response => {
            this.setState({ errorMessage: "Incorrect Password" })
            console.error(response)
        })
    }

    render() {

        if (this.props.refer) {
            if (this.props.role === "analyst") {
                return <Redirect to='/analyst' />;
            } else {
                return <Redirect to='/auditor' />;
            }
        }
        return (
            <div>
                <div className="container login-form">
                    <Form onSubmit={this.login} className="search-form">
                        <FormGroup row>
                            <Label for="username">Username:</Label>
                            <Col>
                                <Input type="text" name="username" placeholder="Enter Username" required />
                            </Col>
                        </FormGroup>
                        <FormGroup row>
                            <Label for="password">Password:</Label>
                            <Col>
                                <Input type="password" name="password" placeholder="Enter Password" required />
                            </Col>
                        </FormGroup>
                        <FormGroup row>
                            <Col sm={{ size: 2, offset: 4 }}>
                                <Button>Login</Button>
                            </Col>
                        </FormGroup>
                    </Form>
                    <br></br>
                </div>
                <br></br>
                <p style={{color: 'red'}}>{this.state.errorMessage}</p>
                <br></br>
                <p> <Link to='/forgot'> Forgotten Password?</Link></p>
            </div>
        )
    }
}
