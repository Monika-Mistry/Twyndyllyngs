import React, { Component } from 'react';
import { Link, Redirect } from 'react-router-dom';
import { Form, FormGroup, Col, Label, Input, Button } from 'reactstrap';

export class Login extends Component {

    login = (e) => {
        e.preventDefault();
        let value = "analyst"
        this.props.onLogin(value)
    }

    audit = () => {
        let value = "auditor"
        this.props.onLogin(value)
    }

    render() {

        if (this.props.refer)  {
            if (this.props.role === "analyst"){
                return <Redirect to='./analyst' />;
            } else {
                return <Redirect to='/auditor' />;
            }
        }
        return (
            <div>
                <Form onSubmit={this.login} className="search-form" >
                    <FormGroup row>
                        <Col sm={1}>
                            <Label for="forname">Username:</Label>
                        </Col>
                        <Col sm={3}>
                            <Input type="text" name="username" placeholder="enter username" required />
                        </Col>
                    </FormGroup>
                    <FormGroup row>
                        <Col sm={1}>
                            <Label for="password">Password:</Label>
                        </Col>
                        <Col sm={3}>
                            <Input type="password" name="password" placeholder="enter password" required />
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
                <Link to='./auditor' onClick={this.audit}>
                    <button> Audit </button>
                </Link>
                <p> <Link to='/forgot'> Forgotten Password?</Link></p>
            </div>
        )
    }
}