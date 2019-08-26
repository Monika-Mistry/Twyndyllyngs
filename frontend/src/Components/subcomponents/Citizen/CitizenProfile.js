import React, { Component } from 'react';
import { Col, Container, Row } from 'reactstrap';
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { ScrollBar } from '../ScrollBar/Scroll.js';
import Phone  from '../Profiles/PhoneProfile.js';
import { VehicleContainer } from '../Profiles/VehicleContainer.js';

export class CitizenProfile extends Component {

    constructor() {
        super()
        this.state = {
            associates: ["hello", "bye bye", "aardvark"],
            citizen: [],
            vehicle: [],
            phone: [],
            finances: [],
            associates2: []
        }
    }

    show = () => {
        console.log(this.state.associates)
    }

    onLoad = () => {
        this.setState({
            citizen: {citizenId: 4, forenames: "josh", surname: "brooks", dob: "today", gender: "M", pob: "earth", address: "yes"},
            phone: [{id: 1, timestamp: 2, callerMSISDN: 3, callCellTowerId: 4, recieverMSISDN:5 , recieverTowerId: 6}, {id: 2, timestamp: 3, callerMSISDN: 4, callCellTowerId: 5, recieverMSISDN: 6, recieverTowerId: 7}],
            vehicle: {registrationId: 1, registrationDate: "day", vehicleRegistrationNo: 2, make: "yes", model: "true", colour: "blue", forenames: "forename", surname: "surname", address: "england", dataOfBirth: "today", driverLicenceId: 3},
            associates: [{citizenId: 1, forenames: "monika", surname: "mistry"}, {citizenId: 2, forenames: "owen", surname: "miller"}, {citizenId: 3, forenames: "rich", surname: "thi"}],
            associates2: [{forenames: "monika"}, {forenames: "owen"}, {forenames: "rich"}]
        
        });
        console.log(this.state.associates)
        
        sessionStorage.clear()
    }

    componentDidMount() {
        this.onLoad()
    }

    render() {
        return (
            <div>
                <button onClick={this.show} >click</button>
                <Container>
                    <Row>
                        <Col sm={2}>
                            <FontAwesomeIcon icon='user' style={{ width: 69, height: 69 }}></FontAwesomeIcon>
                        </Col>
                        <Col sm={4} align="left">
                            <p> Full Name: {this.state.citizen.forenames} {this.state.citizen.surname}</p>
                            <p> D.o.B : {this.state.citizen.dob} </p>
                            <p> Gender : {this.state.citizen.gender} </p>
                        </Col>
                        <Col sm={4} align="left">
                            <p> Place of Birth: {this.state.citizen.pob}</p>
                            <p> Address: {this.state.citizen.address} </p>
                        </Col>
                    </Row>
                </Container>
                <br></br>
                <br></br>

                <h3 align="left">Associates:</h3>

                <Container>

                    <ScrollBar data={this.state.associates}/>

                </Container>

                <br></br>
                <br></br>

                <h3 align="left">Car:</h3>

                <Container>
                    <VehicleContainer data={this.state.vehicle}/>
                </Container>
                <br></br>
                <br></br>

                <h3 align="left">Phones:</h3>

                <Container>
                    <Row>
                        <Phone data={this.state.phone} />    
                    </Row>
                </Container>

                <br></br>
                <br></br>

                <h3 align="left">Transactions:</h3>

                <Container>
                    <Row>
                        <p> Coming Soon {this.state.finances}</p>
                    </Row>
                </Container>


            </div>
        )
    }

}