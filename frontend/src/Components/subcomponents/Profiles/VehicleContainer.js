import React, { Component } from 'react';
import { Col, Container, Row } from 'reactstrap';
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";



export class VehicleContainer extends Component {

    render() {
        let vehicle = this.props.data;
        return (
            <div>
                <Container>
                    <Row>
                        <Col sm={2}>
                            <FontAwesomeIcon icon='car' style={{ width: 69, height: 69 }}></FontAwesomeIcon>
                        </Col>
                        <Col sm={4} align="left">
                            <p> Make: {vehicle.make}</p>
                            <p> Model: {vehicle.model}</p>
                            <p> Colour: {vehicle.colour}</p>
                        </Col>
                        <Col sm={4} align="left">
                            <p> Registration No: {vehicle.vehicleRegistrationNo}</p>
                            <p> Registration Date: {vehicle.registrationDate}</p>
                        </Col>
                    </Row>
                </Container>
            </div>
        )
    }
}