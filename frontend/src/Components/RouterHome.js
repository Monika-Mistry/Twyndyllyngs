import React, { Component } from 'react';
import { BrowserRouter as Router, Route} from "react-router-dom";
import { NavBar } from './subcomponents/NavBar.js';
import { Login } from './subcomponents/Login.js';
import { Footer } from './subcomponents/Footer.js';
import { Audit } from './subcomponents/Audit/AuditHome.js';
import { Analyst } from './subcomponents/Analyst/AnalystHome.js';
import { CreateAnalyst } from './subcomponents/Audit/CreateAnalyst.js';
import { ForgottenPassword } from './subcomponents/ForgottenPassword';
import { PrivateRoute } from './subcomponents/authenticate/PrivateRoute.js';
import { authed } from './subcomponents/authenticate/authenticator.js';
import { Scenario1 } from './subcomponents/Scenario1/Scenario1.js';
import { Scenario2} from './subcomponents/Scenario2/Scenario2.js';
import { LocationMap } from './subcomponents/Scenario2/Scenario2Map.js';
import { Scenario3 } from './subcomponents/Scenario3/Scenario3.js';
import { CitizenProfile } from './subcomponents/Citizen/CitizenProfile.js';

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
        sessionStorage.removeItem("JWToken")
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
                    <PrivateRoute path='/SuspectSearch' component={Scenario1} /> 
                    <PrivateRoute path='/AreaSearch' component={Scenario2} /> 
                    <PrivateRoute path='/CarDatabase' component={Scenario3} /> 
                    <PrivateRoute path='/LocationMap' component={LocationMap} /> 
                    <PrivateRoute path='/Profile' component={CitizenProfile} /> 
                    <Route path='/forgot' render={() => <ForgottenPassword />} />
                    <Footer />
                </div>
            </Router>
        )
    }
}