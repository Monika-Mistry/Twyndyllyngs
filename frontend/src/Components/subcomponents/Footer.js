import React, { Component } from "react";
import { MDBCol, MDBContainer, MDBRow, MDBFooter } from "mdbreact";
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";

export class Footer extends Component {
    render() {
        return (
            <MDBFooter color="blue" className="font-small pt-4 mt-4">
                <MDBContainer fluid className="text-center text-md-left">
                    <MDBRow>
                        <MDBCol md="3">
                            <h5 className="title">Address</h5>
                            <p>Line 1, Line 2, Town, county, Post Code,
                            </p>
                        </MDBCol>
                        <MDBCol md="3">
                            <h5 className="title">Contact Us</h5>
                            <div className="row">
                                
                                <p><FontAwesomeIcon icon='phone'></FontAwesomeIcon>  0116 489 3265</p>
                            </div>
                            <div className="row">
                                
                                
                                <p> <FontAwesomeIcon icon='envelope'></FontAwesomeIcon> contactDesk@twyndyll.co</p>
                            </div>
                        </MDBCol>
                        <MDBCol md="6">
                            <br></br>
                            <img style={{ width: 400 }} src={require('../../Logos/Twyndyllyngs.png')}></img>
                        </MDBCol>
                    </MDBRow>
                </MDBContainer>
                <div className="footer-copyright text-center py-3">
                    <MDBContainer fluid>
                        &copy; Twyndyllyngs {new Date().getFullYear()}
                    </MDBContainer>
                </div>
            </MDBFooter>
        );
    }
}