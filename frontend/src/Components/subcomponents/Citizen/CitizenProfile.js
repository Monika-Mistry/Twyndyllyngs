import React, { Component } from 'react';
import { Col, Container, Row } from 'reactstrap';
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";
import { ScrollBar } from '../ScrollBar/Scroll.js';
import { Phone } from '../Profiles/PhoneProfile.js';
import { CarProfile } from '../Profiles/CarProfile.js';

export class CitizenProfile extends Component {

    constructor() {
        super()
        this.state = {
            associates: ["hello", "bye bye", "aardvark"],
            forename: sessionStorage.getItem('forename'),
            surname: "",
            dob: "",
            gender: "",
            pob: "",
            address: "",
            vehicle: "regNo",
            phone: null,
            finances: []
        }
    }

    testing = () => {
        console.log(this.state.phone)
    }



    onLoad = () => {
        this.setState({
            phone: [{id: "1", value: "Hello"}, {id: "2", value: "trial"}]
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
                <p>Citizen Profile Page</p>
                <button onClick={this.testing}>Show</button>

                <Container>
                    <Row>
                        <Col sm={2}>
                            <FontAwesomeIcon icon='user' style={{ width: 69, height: 69 }}></FontAwesomeIcon>
                        </Col>
                        <Col sm={4} align="left">
                            <p> Full Name: {this.state.forename} {this.state.surname}</p>
                            <p> D.o.B : {this.state.dob} </p>
                            <p> Gender : {this.state.gender} </p>
                        </Col>
                        <Col sm={4} align="left">
                            <p> Place of Birth: {this.state.pob}</p>
                            <p> Address: {this.state.address} </p>
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
                    <CarProfile registration={this.state.vehicle}/>
                </Container>
                <br></br>
                <br></br>

                <h3 align="left">Phones:</h3>

                <Container>
                    <Row>
                        {/* <Phone data={this.state.phone} /> */}
                        <p> HEllo</p>
                    </Row>
                </Container>

                <br></br>
                <br></br>

                <h3 align="left">Transactions:</h3>

                <Container>
                    <Row>
                        <p>{this.state.finances}</p>
                    </Row>
                </Container>


            </div>
        )
    }

}