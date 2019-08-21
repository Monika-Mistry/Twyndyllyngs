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
        if (this.props.currentUser === "analyst") {
            barItems = [
                <Nav className="ml-auto" navbar key="analyst">
                    <NavItem>
                        <NavLink tag={RRNavLink} to='/'>
                            <p>Scenario 1</p>
                        </NavLink>
                    </NavItem>
                    <NavItem>
                        <NavLink tag={RRNavLink} to='/'>
                            <p>Scenario 2</p>
                        </NavLink>
                    </NavItem>
                    <NavItem>
                        <NavLink tag={RRNavLink} to='/'>
                            <p>Scenario 3</p>
                        </NavLink>
                    </NavItem>
                    <NavItem>
                        <NavLink tag={RRNavLink} onClick={this.props.logout} to='/'>
                            <p>Analyst Logout</p>
                        </NavLink>
                    </NavItem>
                </Nav>
            ]
        } else if (this.props.currentUser === "audit") {
            barItems = [
                <Nav className="ml-auto" navbar key="audit">
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
            barItems = []
        }

        return (
            <div>
                <Navbar color="light" light expand="md">
                    <NavbarBrand tag={RRNavLink} to='/'>
                        <img
                            style={{ width: 69, height: 69 }}
                            src={require('../../Logos/Lizzie.png')}
                            alt="Chameleon">
                        </img>
                    </NavbarBrand>
                    <NavbarToggler onClick={this.toggle} />
                    <Collapse isOpen={this.state.isOpen} navbar>
                        {barItems}
                    </Collapse>
                </Navbar>
            </div>
        );


    }
}