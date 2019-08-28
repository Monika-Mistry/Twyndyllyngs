import React, { Component } from 'react';
import { NavLink as RRNavLink } from "react-router-dom";
import {
    Collapse,
    Navbar,
    NavbarToggler,
    NavbarBrand,
    Nav,
    NavItem,
    NavLink
} from 'reactstrap';

export class NavBar extends Component {
    constructor(props) {
        super(props);
        this.toggleNavbar = this.toggleNavbar.bind(this);
        this.state = {
            collapsed: true
        };
    }

    toggleNavbar() {
        this.setState({
            collapsed: !this.state.collapsed
        });
    }

    confirm = () => {

    }

    render() {

        let barItems;
        let user;
        if (this.props.currentUser === "analyst") {
            user = "/analyst"
            barItems = [
                <Nav className="ml-auto" navbar key="analyst">
                    <NavItem>
                        <NavLink tag={RRNavLink} to='/SuspectSearch'>
                            <p>Suspect Search</p>
                        </NavLink>
                    </NavItem>
                    <NavItem>
                        <NavLink tag={RRNavLink} to='/AreaSearch'>
                            <p>Area Search</p>
                        </NavLink>
                    </NavItem>
                    <NavItem>
                        <NavLink tag={RRNavLink} to='/CarDatabase'>
                            <p>Car Database</p>
                        </NavLink>
                    </NavItem>
                    <NavItem>
                        <NavLink tag={RRNavLink} onClick={this.props.logout} to='/'>
                            <p>Analyst Logout</p>
                        </NavLink>
                    </NavItem>
                </Nav>
            ]
        } else if (this.props.currentUser === "auditor") {
            user = "/auditor"
            barItems = [
                <Nav className="ml-auto chameleon-navbar" navbar key="auditor">
                    <NavItem>
                        <NavLink tag={RRNavLink} to='./CreateAnalyst'>
                            <p>Create Analyst</p>
                        </NavLink>
                    </NavItem>
                    <NavItem>
                        <NavLink tag={RRNavLink} onClick={this.props.logout} to='/'>
                            <p>Audit Logout</p>
                        </NavLink>
                    </NavItem>
                </Nav>
            ]
        } else {
            user = "/"
            barItems = []
        }

        return (
            <div>
                <Navbar className="chameleon-dark" dark expand="md">
                    <NavbarBrand tag={RRNavLink} to={user}>
                        <img
                            style={{ width: 69, height: 69 }}
                            src={require('../../Logos/Lizzie_white.png')}
                            alt="Chameleon">
                        </img>
                        
                    </NavbarBrand>
                    <NavbarBrand>Chameleon</NavbarBrand>
                    <NavbarToggler onClick={this.toggle} />
                    <Collapse isOpen={this.state.isOpen} navbar>
                        {barItems}
                    </Collapse>
                </Navbar>
            </div>
        );


    }
}