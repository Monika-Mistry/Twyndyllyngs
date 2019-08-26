import React, { Component } from 'react';
import { Col, Container, Row } from 'reactstrap';
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";



export class CarProfile extends Component {

    constructor(props) {
        super(props)
    }

    render() {
        let car = this.props.registration;
        return (
            <div>
                <Container>
                    <Row>
                        <Col sm={2}>
                            <FontAwesomeIcon icon='car' style={{ width: 69, height: 69 }}></FontAwesomeIcon>
                        </Col>
                        <Col sm={4} align="left">
                            <p> Make: {car.make}</p>
                            <p> Model: {car.model}</p>
                            <p> Colour: {car.colour}</p>
                        </Col>
                        <Col sm={4} align="left">
                            <p> Registration No.: {car.vehicleRegistrationNo}</p>
                            <p> Registration Date: {car.registrationDate}</p>
                            <p> Registration Id: {car.registrationId}</p>
                        </Col>
                    </Row>
                </Container>
            </div>
        )
    }
}