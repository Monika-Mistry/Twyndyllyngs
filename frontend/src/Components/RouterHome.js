import React, { Component } from 'react';
import { BrowserRouter as Router, Route} from "react-router-dom";
import { NavBar } from './subcomponents/NavBar.js';
import { Login } from './subcomponents/Login.js';

export class RouterHome extends Component {
    render() {
        return(
            <Router>
                <div>
                    <NavBar />
                    <Route exact path='/' render={() => <Login />} />
                </div>
            </Router>
        )
    }
}