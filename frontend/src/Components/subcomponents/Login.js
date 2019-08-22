import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import { Form, FormGroup, Col, Label, Input, Button } from 'reactstrap';
export class Login extends Component {

    user = () => {
        let value = "analyst"
        this.props.onLogin(value)
    }

    audit = () => {
        let value = "audit"
        this.props.onLogin(value)
    }

    render() {
        return (
            <div>
                <Form onSubmit={this.user} className="search-form" >
                    <FormGroup row>
                        <Col sm={1}>
                            <Label for="forname">Username:</Label>
                        </Col>
                        <Col sm={3}>
                            <Input type="text" name="username" placeholder="enter username" required/>
                        </Col>
                        </FormGroup>
                        <FormGroup row>
                        <Col sm={1}>
                            <Label for="password">Password:</Label>
                        </Col>
                        <Col sm={3}>
                            <Input type="password" name="password" placeholder="enter password" required/>
                        </Col>
                        </FormGroup>
                        <FormGroup row>
                        <Col sm={{ size: 2, offset: 1 }}>
                            <Button>Login</Button>
                        </Col>
                    </FormGroup>
                </Form>
                <br></br>
                <br></br>
                <Link to='./home' onClick={this.user}>
                    <button> Analyst </button>
                </Link>
                <Link to='./audit' onClick={this.audit}>
                    <button> Audit </button>
                </Link>
                <p> <Link to='/forgot'> Forgotten Password?</Link></p>
            </div>
        )
    }
}