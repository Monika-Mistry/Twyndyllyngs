import React, { Component } from 'react';
import { BrowserRouter as Router, Route } from "react-router-dom";
import { NavBar } from './subcomponents/NavBar.js';
import { Login } from './subcomponents/Login.js';
import { Footer } from './subcomponents/Footer.js';
import { Audit } from './subcomponents/Audit/AuditHome.js';
import { Analyst } from './subcomponents/Analyst/AnalystHome.js';
import { CreateAnalyst } from './subcomponents/CreateAnalyst.js';

export class RouterHome extends Component {
    render() {
        return (
            <Router>
                <div>
                    <NavBar />
                    <Route exact path='/' render={() => <Login />} />
                    <Route path='/home' render={() => <Analyst />} />
                    <Route path='/audit' render={() => <Audit />} />
                    <Route path='/CreateAnalyst' render={() => <CreateAnalyst />} /> 
                    <Footer />
                </div>
            </Router>
        )
    }
}