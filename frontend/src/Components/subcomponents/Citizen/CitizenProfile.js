import React, { Component } from 'react';
import { Col, Container, Row, Collapse, Card, CardBody, Button } from 'reactstrap';
import { ScrollBar } from '../ScrollBar/Scroll.js';
import Phone from '../Profiles/PhoneProfile.js';
import { VehicleContainer } from '../Profiles/VehicleContainer.js';
import { findCitizens } from '../Constants/Routes.js';

export class CitizenProfile extends Component {

    constructor() {
        super()
        this.state = {
            forenames: null,
            surname: null,
            address: null,
            associates: ["hello", "bye bye", "aardvark"],
            citizen: { citizenId: "", forenames: "", surname: "", dob: "", gender: "", pob: "", address: "" },
            vehicle: [],
            phone: [],
            finances: [],
            associates2: [],
            associatesCollapse: false,
            carCollapse: false,
            phoneCollapse: false,
            transactionsCollapse: false
        }
    }

    toggleAssociates = () => {
        this.setState({ associatesCollapse: !this.state.associatesCollapse });
    }

    toggleCar = () => {
        this.setState({ carCollapse: !this.state.carCollapse });
    }

    togglePhone = () => {
        this.setState({ phoneCollapse: !this.state.phoneCollapse });
    }

    toggleTransactions = () => {
        this.setState({ transactionsCollapse: !this.state.transactionsCollapse });
    }

    show = () => {
        console.log(this.state.citizen)
    }

    onLoad = () => {

        let user = {
            forenames: sessionStorage.getItem('forenames'),
            surname: sessionStorage.getItem('surname'),
            address: sessionStorage.getItem('address')
        }

        findCitizens(user).then(response => {

            sessionStorage.removeItem('forenames')
            sessionStorage.removeItem('surname')
            sessionStorage.removeItem('address')

            this.setState({
                citizen: response.data[0],
                phone: [{ id: 1, timestamp: 2, callerMSISDN: 3, callCellTowerId: 4, recieverMSISDN: 5, recieverTowerId: 6 }, { id: 2, timestamp: 3, callerMSISDN: 4, callCellTowerId: 5, recieverMSISDN: 6, recieverTowerId: 7 }],
                vehicle: { registrationId: 1, registrationDate: "day", vehicleRegistrationNo: 2, make: "yes", model: "true", colour: "blue", forenames: "forename", surname: "surname", address: "england", dataOfBirth: "today", driverLicenceId: 3 },
                associates: [{ citizenId: 1, forenames: "monika", surname: "mistry" }, { citizenId: 2, forenames: "owen", surname: "miller" }, { citizenId: 3, forenames: "rich", surname: "thi" }],
                associates2: [{ forenames: "monika" }, { forenames: "owen" }, { forenames: "rich" }]
            });
        }).catch(response => {
            console.log(response)
        })
    }

    componentDidMount() {
        this.onLoad()
    }

    render() {
        return (
            <div>
                <Container>

                    <h1 className="information-header" align="center"><u>Profile</u></h1>

                    <br></br>

                    <Row>
                        <Col sm={2}>
                            <img src={`https://thispersondoesnotexist.com/image?random=${Math.random()}`} style={{ width: 100, height: 100 }}></img>
                        </Col>
                        <Col sm={4} align="center">
                            <p> Full Name: {this.state.citizen.forenames} {this.state.citizen.surname}</p>
                            <p> D.o.B : {this.state.citizen.dateOfBirth} </p>
                            <p> Gender : {this.state.citizen.sex} </p>
                        </Col>
                        <Col sm={4} align="center">
                            <p> Place of Birth: {this.state.citizen.placeOfBirth}</p>
                            <p> Address: {this.state.citizen.homeAddress} </p>
                        </Col>
                    </Row>
                </Container>
                <br></br>
                <br></br>

                <h3 style={{paddingTop:"40px"}} align="center"><u>Associates</u></h3>
                
                <Button onClick={this.toggleAssociates} style={{
                    alignSelf: 'stretch'
                }}>View Associates</Button>
                <Collapse isOpen={this.state.associatesCollapse}>
                    <Card>
                        <CardBody>

                            <Container>

                                <ScrollBar data={this.state.associates} />

                            </Container>


                        </CardBody>
                    </Card>
                </Collapse>

                <h3 style={{paddingTop:"40px"}} align="center"><u>Vehicle</u></h3>

                <Button onClick={this.toggleCar} style={{
                    alignSelf: 'stretch'
                }}>View Vehicle Details</Button>
                <Collapse isOpen={this.state.carCollapse}>
                    <Card>
                        <CardBody>

                            <Container>
                                <VehicleContainer data={this.state.vehicle} />
                            </Container>
                            <br></br>
                            <br></br>

                        </CardBody>
                    </Card>
                </Collapse>

                <h3 style={{paddingTop:"40px"}} align="center"><u>Phones</u></h3>

                <Button onClick={this.togglePhone} style={{
                    alignSelf: 'stretch'
                }}>View Phone Calls</Button>
                <Collapse isOpen={this.state.phoneCollapse}>
                    <Card>
                        <CardBody>

                            <Container>
                                <Row>
                                    <Phone data={this.state.phone} />
                                </Row>
                            </Container>

                            <br></br>
                            <br></br>


                        </CardBody>
                    </Card>
                </Collapse>

                <h3 style={{paddingTop:"40px"}} align="center"><u>Transactions</u></h3>

                <Button onClick={this.toggleTransactions} style={{
                    alignSelf: 'stretch'
                }}>View Financial Transactions</Button>
                <Collapse isOpen={this.state.transactionsCollapse}>
                    <Card>
                        <CardBody>

                            <Container>
                                <Row>
                                    <p> Coming Soon {this.state.finances}</p>
                                </Row>
                            </Container>

                        </CardBody>
                    </Card>
                </Collapse>


            </div>
        )
    }

}