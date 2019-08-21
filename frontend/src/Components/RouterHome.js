import React, { Component } from 'react';
import { BrowserRouter as Router, Route } from "react-router-dom";
import { NavBar } from './subcomponents/NavBar.js';
import { Login } from './subcomponents/Login.js';
import { Footer } from './subcomponents/Footer.js';
import { Audit } from './subcomponents/Audit/AuditHome.js';
import { Analyst } from './subcomponents/Analyst/AnalystHome.js';
import { CreateAnalyst } from './subcomponents/CreateAnalyst.js';
import { ForgottenPassword } from './subcomponents/ForgottenPassword.js'

export class RouterHome extends Component {

    constructor(){
        super()
        this.state = {
            loggedIn: null
        }
    }

    reset = () => {
        this.setState({
            loggedIn: null
        })
    }

    onLogin = (user) => {
        this.setState({
            loggedIn: user
        })
    }

    render() {
        return (
            <Router>
                <div>
                    <NavBar currentUser={this.state.loggedIn} logout={this.reset}/>
                    <Route exact path='/' render={() => <Login onLogin={this.onLogin}/>} />
                    <Route path='/home' render={() => <Analyst/>} />
                    <Route path='/audit' render={() => <Audit />} />
                    <Route path='/CreateAnalyst' render={() => <CreateAnalyst />} /> 
                    <Route path='/forgot' render={() => <ForgottenPassword />} />
                    <Footer />
                </div>
            </Router>
        )
    }
}