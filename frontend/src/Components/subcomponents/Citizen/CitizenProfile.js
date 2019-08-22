import React, { Component } from 'react';
import { Col, Container, Row } from 'reactstrap';
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { ScrollBar} from '../Scroll.js';

export class CitizenProfile extends Component {

    constructor(props) {
        super(props)
    }

    fill = () => {
        sessionStorage.setItem('forename', "john");
        sessionStorage.setItem('surname', 'smith');
        sessionStorage.setItem('dob', '13/05/87');
        sessionStorage.setItem('gen', 'M');
        sessionStorage.setItem('pob', 'England');
        sessionStorage.setItem('address', 'drgdhghht');
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
                            <p> Full Name: {sessionStorage.getItem('forename')} {sessionStorage.getItem('surname')}</p>
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
                    <Row>
                        <ScrollBar />
                    </Row>
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