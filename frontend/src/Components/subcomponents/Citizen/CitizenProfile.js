import React, { Component } from 'react';
import { Col, Container, Row } from 'reactstrap';
import Phone from '../Profiles/PhoneProfile.js';
import { VehicleContainer } from '../Profiles/VehicleContainer.js';
import { findCitizens, findCitizenVehicle, findCitizenMobile, findPhoneRecords, findAssociates } from '../Constants/Routes.js';
import { AssociateHead } from '../Profiles/AssociateHead.js';

export class CitizenProfile extends Component {

    constructor() {
        super()
        this.state = {
            forenames: null,
            surname: null,
            address: null,
            associates: [],
            citizen: { citizenId: "", forenames: "", surname: "", dob: "", gender: "", pob: "", address: "" },
            vehicle: [],
            mobile:[],
            callRecords:[],
            finances: []
        }
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
                callRecords: [{ id: "", timestamp: "", callerMSISDN: "", callCellTowerId: "", recieverMSISDN: "", recieverTowerId: "" }, { id: "", timestamp: "", callerMSISDN: "", callCellTowerId: "", recieverMSISDN: "", recieverTowerId: "" }],
                vehicle: { registrationId: "", registrationDate: "", vehicleRegistrationNo: "", make: "", model: "", colour: "", forenames: "", surname: "", address: "", dataOfBirth: "", driverLicenceId: "" },
                associates: [{ citizenId: "", forenames: "", surname: "" }],
                associates2: [{ forenames: "" }]
            });
        }).catch(response => {
            console.log(response)
        })

        findCitizenVehicle(user).then(response => {
            this.setState({
                vehicle: response.data[0]
            })
        }).catch(response => {
            console.log(response)
        })

        findCitizenMobile(user).then(response => {
            this.setState({
                mobile: response.data[0]
            })
            console.log(response.data[0])
        }).then(() => {

            let number = {
                number: this.state.mobile.phoneNumber
            }

            findPhoneRecords(number).then(response => {
                this.setState({
                    callRecords: response.data
                })
            }).catch(response => {
                console.log(response)
            })
        }).catch(response => {
            console.log(response)
        })

        findAssociates(user).then(response => {
            this.setState({
                associates: response.data
            })
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

                <h3 align="center"><u>Associates</u></h3>
                
                <br></br>

                <Container>

                    <AssociateHead data={this.state.associates}/>

                </Container>

                <br></br>
                <br></br>

                <h3 align="center"><u>Car</u></h3>

                <br></br>

                <Container>
                    <VehicleContainer data={this.state.vehicle} />
                </Container>
                <br></br>
                <br></br>

                <h3 align="center"><u>Phones</u></h3>

                <br></br>

                <Container>
                    <Row>
                        <Col>
                        <p> Phone Network: {this.state.mobile.network}</p>
                        </Col>
                        <Col>
                        <p>Phone Number: {this.state.mobile.phoneNumber}</p>
                        </Col>
                    </Row>
                    <Row>
                        <Phone data={this.state.callRecords} />
                    </Row>
                </Container>

                <br></br>
                <br></br>

                <h3 align="center"><u>Transactions</u></h3>

                <br></br>

                <Container>
                    <Row>
                        <p> Coming Soon {this.state.finances}</p>
                    </Row>
                </Container>


            </div>
        )
    }

}