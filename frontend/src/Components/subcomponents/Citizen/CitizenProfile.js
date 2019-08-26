import React, { Component } from 'react';
import { Col, Container, Row } from 'reactstrap';
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { ScrollBar } from '../ScrollBar/Scroll.js';

export class CitizenProfile extends Component {

    constructor() {
        super()
        this.state = {
            associates: [],
            forename: sessionStorage.getItem('forename')
        }
    }

    fill = () => {
        sessionStorage.clear()
    }

    componentDidMount() {
        sessionStorage.clear()
    }

    render() {
        return (
            <div>
                <p>Citizen Profile Page</p>
                <button onClick={this.fill}>profile</button>

                <Container>
                    <Row>
                        <Col sm={2}>
                            <FontAwesomeIcon icon='user' style={{ width: 69, height: 69 }}></FontAwesomeIcon>
                        </Col>
                        <Col sm={4} align="left">
                            <p> Full Name: {this.state.forename} {sessionStorage.getItem('surname')}</p>
                            <p> D.o.B : {sessionStorage.getItem('dob')} </p>
                            <p> Gender : {sessionStorage.getItem('gen')} </p>
                        </Col>
                        <Col sm={4} align="left">
                            <p> Place of Birth: {sessionStorage.getItem('pob')}</p>
                            <p> Address: {sessionStorage.getItem('address')} </p>
                        </Col>
                    </Row>
                </Container>

                <br></br>
                <br></br>

                <h3 align="left">Associates:</h3>

                <Container>

                    <ScrollBar />

                </Container>

                <br></br>
                <br></br>

                <h3 align="left">Car:</h3>

                <Container>
                    <Row>
                        <p>hi</p>
                    </Row>
                </Container>
                <br></br>
                <br></br>

                <h3 align="left">Phones:</h3>

                <Container>
                    <Row>
                        <p>hi</p>
                    </Row>
                </Container>

                <br></br>
                <br></br>

                <h3 align="left">Transactions:</h3>

                <Container>
                    <Row>
                        <p>hi</p>
                    </Row>
                </Container>


            </div>
        )
    }

}