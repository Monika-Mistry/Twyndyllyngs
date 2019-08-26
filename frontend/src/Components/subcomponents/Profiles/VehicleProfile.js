import React, { Component } from 'react';
import { Col, Container, Row } from 'reactstrap';
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { VehicleContainer } from './VehicleContainer.js';

export class VehicleProfile extends Component {

    render() {
        let vehicle = this.props.data;
        return (
            <div>

                <Container>
                    <VehicleContainer data={vehicle} />
                </Container>
                <br></br>
                <br></br>
                <h3 align="left">Current Owner:</h3>
                <br></br>
                <Container>
                <Row>
                        <Col sm={2}>
                            <FontAwesomeIcon icon='user' style={{ width: 69, height: 69 }}></FontAwesomeIcon>
                        </Col>
                        <Col sm={4} align="left">
                            <p> Full Name: {vehicle.forenames} {vehicle.surname}</p>
                            <p> D.o.B : {vehicle.dob} </p>
                            <p> Driving Licence: {vehicle.driverLicenceId} </p>
                        </Col>
                        <Col sm={4} align="left">
                            <p> Address: {vehicle.address} </p>
                        </Col>
                    </Row>
                </Container>
            </div>
        )
    }
}