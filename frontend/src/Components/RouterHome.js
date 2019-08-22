import React, { Component } from 'react';
import { BrowserRouter as Router, Route, Redirect } from "react-router-dom";
import { NavBar } from './subcomponents/NavBar.js';
import { Login } from './subcomponents/Login.js';
import { Footer } from './subcomponents/Footer.js';
import { Audit } from './subcomponents/Audit/AuditHome.js';
import { Analyst } from './subcomponents/Analyst/AnalystHome.js';
import { CreateAnalyst } from './subcomponents/Audit/CreateAnalyst.js';
import { ForgottenPassword } from './subcomponents/ForgottenPassword';
import { PrivateRoute } from './subcomponents/authenticate/PrivateRoute.js';
import { authed } from './subcomponents/authenticate/authenticator.js';

export class RouterHome extends Component {

    constructor(){
        super()
        this.state = {
            redirectToReferrer: false,
            loggedIn: null
        }
    }

    reset = () => {
        this.setState({
            loggedIn: null,
            redirectToReferrer: false
        })
    }

    onLogin = (user) => {
        this.setState({
            loggedIn: user
        })

        authed.authenticate(() => {
            this.setState({ redirectToReferrer: true });
          });

    }

    render() {
        return (
            <Router>
                <div>
                    <NavBar currentUser={this.state.loggedIn} logout={this.reset}/>
                    <Route exact path='/' render={() => <Login onLogin={this.onLogin} refer={this.state.redirectToReferrer} role={this.state.loggedIn} />} />
                    <PrivateRoute path='/analyst' component={Analyst} />
                    <PrivateRoute path='/auditor' component={Audit} />
                    <PrivateRoute path='/CreateAnalyst' component={CreateAnalyst} /> 
                    <Route path='/forgot' render={() => <ForgottenPassword />} />
                    <Footer />
                </div>
            </Router>
        )
    }
}