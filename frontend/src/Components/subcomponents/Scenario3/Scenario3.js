import React, { Component } from 'react';
import { Col, Button, Form, FormGroup, Label, Input } from 'reactstrap';
import { findCar } from '../Constants/Routes.js';
import { alnuValid, validation } from '../Constants/Constants.js';
import { VehicleProfile } from '../Profiles/VehicleProfile.js';
import { VehicleHeader } from '../Profiles/VehicleHeader.js';

export class Scenario3 extends Component {

    constructor() {
        super()
        this.state = {
            vehicle: {address: "",
            colour: "",
            dateOfBirth: "",
            driverLicenceId: " ",
            forenames: " ",
            make: "",
            model: "",
            registrationDate: "",
            registrationId: "",
            surname: "",
            vehicleRegistrationNo: ""},
            location: []
        }
    }
    
    CarSearch = (e) => {
        e.preventDefault();
        let reg = {
            vehicleRegistrationNo : e.target[0].value,
            username: sessionStorage.getItem("username")
        }

        if (validation(reg.vehicleRegistrationNo, alnuValid)) {
            if (reg.vehicleRegistrationNo.length >= 6 && reg.vehicleRegistrationNo.length <= 8) {
                document.getElementById("regError").innerText = ""; 
                findCar(reg).then( response => {
                    this.setState({
                        vehicle: response.data.vehicleRegistration[0],
                        location: response.data.vehicleLocation
                    })
                    console.log(response.data);
                }).catch( response => {
                    console.log(response);
                })
            } else {
                document.getElementById("regError").innerText = "Reg needs to be between 6 to 8 characters long, Remember Spaces";
            }
        } else {
            document.getElementById("regError").innerText = "A car registration requires numbers and letters";
        }
    }

    render() {
        return (
            <div>
                <p>Suspect Fleeing</p>
                <div className="container">
                    <Form onSubmit={this.CarSearch}>
                        <FormGroup row>
                            <Col sm={2}>
                                <Label>Car Registration:</Label>
                            </Col>
                            <Col sm={2}>
                                <Input type="text" placeholder="eg. AB12 3CD" required> </Input>
                            </Col>
                            <Col sm={2}>
                                <Button> Search</Button>
                            </Col>
                        </FormGroup>
                        <FormGroup row>
                            <p id="regError" style={{ color: 'red' }}></p>
                        </FormGroup>
                    </Form>
                </div>

                <VehicleProfile data={this.state.vehicle}/>
                <VehicleHeader data={this.state.location}/>
            </div>

        )
    }
}
