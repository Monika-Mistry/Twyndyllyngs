import React, { Component } from 'react';
import Scenario3 from '../Scenario3/Scenario3.js';
import Scenario2 from '../Scenario2/Scenario2.js';
import Scenario1 from '../Scenario1/Scenario1.js';

export class Analyst extends Component {

    constructor(props){
        super(props)
    }

    state = {
        renderView: 0
    }

    ClickScenario1 = e => {
        this.setState({
            renderView: 1
        })
    }

    ClickScenario2 = e => {
        this.setState({
            renderView: 2
        })
    }

    ClickScenario3 = e => {
        this.setState({
            renderView: 3
        })
    }

    render() {
        if (this.state.renderView === 1) {
            return (
                <div><p>Analyst Home</p>
                    <button onClick={this.ClickScenario1}> Scenario 1 - Detainee </button>
                    <button onClick={this.ClickScenario2}> Scenario 2 - Incident </button>
                    <button onClick={this.ClickScenario3}> Scenario 3 - Vehicle </button>
                    <Scenario1 />
                </div>
            )
        }
        if (this.state.renderView === 2) {
            return (
                <div><p>Analyst Home</p>
                    <button onClick={this.ClickScenario1}> Scenario 1 - Detainee </button>
                    <button onClick={this.ClickScenario2}> Scenario 2 - Incident </button>
                    <button onClick={this.ClickScenario3}> Scenario 3 - Vehicle </button>
                    <Scenario2 />
                </div>
            )
        }
        if (this.state.renderView === 3) {
            return (
                <div><p>Analyst Home</p>
                    <button onClick={this.ClickScenario1}> Scenario 1 - Detainee </button>
                    <button onClick={this.ClickScenario2}> Scenario 2 - Incident </button>
                    <button onClick={this.ClickScenario3}> Scenario 3 - Vehicle </button>
                    <Scenario3 />
                </div>
            )
        }
        else {
            return (
                <div><p>Analyst Home</p>
                    <button onClick={this.ClickScenario1}> Scenario 1 - Detainee </button>
                    <button onClick={this.ClickScenario2}> Scenario 2 - Incident </button>
                    <button onClick={this.ClickScenario3}> Scenario 3 - Vehicle </button>
                    <p>Loading...</p>
                    <button onClick={this.pro}>Click me</button>
                </div>
            )
        }
    }
}