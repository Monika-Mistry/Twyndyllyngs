import React, { Component } from 'react';
import { LocationMap } from './Scenario2Map.js';
import { Col, Button, Form, FormGroup, Label, Input } from 'reactstrap';
import TimeRangePicker from '@wojtekmaj/react-timerange-picker';
import DateRangePicker from '@wojtekmaj/react-daterange-picker';
import { validation, longValid, latValid } from '../Constants/Constants.js';

export class Scenario2 extends Component {

    constructor() {
        super()
        this.state = {
            date: [new Date(), new Date()],
            time: ['10:00', '11:00']
        }
    }

    onTimeChange = time => this.setState({ time })
    onDateChange = date => this.setState({ date })

    findEvents = (e) => {
        e.preventDefault()

        let values = {
            latitude: e.target[0].value,
            longitude: e.target[1].value,
            initDate: this.state.date[0],
            finDate: this.state.date[1],
            initTime: this.state.time[0],
            finTime: this.state.time[1]
        }

        if (validation(values.latitude, latValid)) {
            if (validation(values.longitude, longValid)) {
                console.log(values)
                document.getElementById("latlongerror").innerText = ""
            } else {
                document.getElementById("latlongerror").innerText = "Longitude must be between -180 and 180"
            }
            
        } else {
            document.getElementById("latlongerror").innerText = "Latitude must be between -90 and 90"
        }

        
    }

    render() {
        return (
            <div>
                <p>Incident Occured</p>
                <br></br>
                <br></br>
                <Form onSubmit={this.findEvents} className="search-form">
                    <FormGroup row>
                        <Col>
                            <Label for="latitude">Latitude:</Label>
                        </Col>
                        <Col>
                            <Input type="text" name="latitude" placeholder="enter latitude" />
                        </Col>
                        <Col>
                            <Label for="longitude">Longitude:</Label>
                        </Col>
                        <Col>
                            <Input type="text" name="longitude" placeholder="enter longitude" />
                        </Col>
                        <Col>
                            <Button>Search</Button>
                        </Col>
                    </FormGroup>
                </Form>
                <p id="latlongerror" style={{ color: 'red' }}> </p>
                <DateRangePicker
                    onChange={this.onDateChange}
                    value={this.state.date}
                />
                <TimeRangePicker
                    onChange={this.onTimeChange}
                    value={this.state.time}
                />

                <br></br>
                <br></br>
                <LocationMap />
            </div>
        )
    }

}