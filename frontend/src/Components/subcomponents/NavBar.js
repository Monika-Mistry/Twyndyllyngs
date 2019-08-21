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

    render() {

        let barItems;
        if (this.props.currentUser === "analyst") {
            barItems = [
                <Nav className="ml-auto" navbar>
                    <NavItem>
                        <NavLink tag={RRNavLink}>
                            <p>logged in as {this.props.currentUser}</p>
                        </NavLink>
                    </NavItem>
                </Nav>
            ]
        } else if (this.props.currentUser === "audit") {
            barItems = [
                <Nav className="ml-auto" navbar>
                    <NavItem>
                        <NavLink tag={RRNavLink}>
                            <p>logged in as {this.props.currentUser}</p>
                        </NavLink>
                    </NavItem>
                </Nav>
            ]
        } else {
            barItems = ["not logged in"]
        }

        return (
            <div>
                <Navbar color="light" light expand="md">
                    <NavbarBrand tag={RRNavLink} to="/">
                        <img
                            style={{ width: 69, height: 69 }}
                            src={require('../../Logos/Lizzie.png')}>
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