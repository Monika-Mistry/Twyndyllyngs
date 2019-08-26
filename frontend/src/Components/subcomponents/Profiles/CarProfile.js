import React, { Component } from 'react';
import { Col, Container, Row } from 'reactstrap';
import { FontAwesomeIcon } from "@fortawesome/react-fontawesome";

export class CarProfile extends Component {

    constructor(props) {
        super(props)
    }

    render() {
        return (
            <div>
                <p> {this.props.registration}</p>
                <Container>
                    <Row>
                        <Col sm={2}>
                            <FontAwesomeIcon icon='car' style={{ width: 69, height: 69 }}></FontAwesomeIcon>
                        </Col>
                        <Col sm={4} align="left">
                            <p> Make: </p>
                            <p> Model: </p>
                            <p> Colour: </p>
                        </Col>
                        <Col sm={4} align="left">
                            <p> Registration No.:</p>
                            <p> Registration Date: </p>
                            <p> Registration Id: </p>
                        </Col>
                    </Row>
                </Container>
            </div>
        )
    }
}