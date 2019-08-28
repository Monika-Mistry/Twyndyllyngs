import React, { Component } from 'react';
import { Col, Container, Row } from 'reactstrap';
import { VehicleContainer } from './VehicleContainer.js';
import { Link } from 'react-router-dom';

export class VehicleProfile extends Component {

    details = () => {
        sessionStorage.setItem('forenames', this.props.data.forenames);
        sessionStorage.setItem('surname', this.props.data.surname);
        sessionStorage.setItem('address', this.props.data.address);
    }

    render() {
        let vehicle = this.props.data;
        return (
            <div>

                <Container align='center'>
                    <VehicleContainer data={vehicle} />
                </Container>
                <br></br>
                <br></br>
                <h3 align="center"><u>Current Owner</u></h3>
                <br></br>
                <Container className="profile" align="center">
                    <Row>
                        <Col sm={2}>
                            <img src={`https://thispersondoesnotexist.com/image?random=${Math.random()}`} style={{ width: 100, height: 100 }}></img>
                        </Col>
                        <Col sm={4} align="center">
                            <p> Full Name: {vehicle.forenames} {vehicle.surname}</p>
                            <p> Date of Brith : {vehicle.dateOfBirth} </p>
                            <p> Driving Licence: {vehicle.driverLicenceId} </p>
                        </Col>
                        <Col sm={4} align="center">
                            <p> Address: {vehicle.address} </p>
                        </Col>
                        <Col sm={2}>
                            <Link to='/Profile' onClick={this.details}>More Details</Link>
                        </Col>
                    </Row>
                </Container>
            </div>
        )
    }
}