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
        if (this.props.currentUser) {
            barItems = [
                <Nav className="ml-auto" navbar>
                    <NavItem>
                        <NavLink tag={RRNavLink}>
                            <p>Logged in as: {this.props.currentUser}</p>
                        </NavLink>
                    </NavItem>
                    <NavItem>
                        <NavLink tag={RRNavLink} onClick={this.props.logout} to='/'>
                            <p>Logout</p>
                        </NavLink>
                    </NavItem>
                </Nav>
            ]
        // } else if (this.props.currentUser === "audit") {
        //     barItems = [
        //         <Nav className="ml-auto" navbar>
        //             <NavItem>
        //                 <NavLink tag={RRNavLink}>
        //                     <p>Logged in as: {this.props.currentUser}</p>
        //                 </NavLink>
        //             </NavItem>
        //             <NavItem>
        //                 <NavLink tag={RRNavLink} onClick={this.props.logout} to='/'>
        //                     <p>Logout</p>
        //                 </NavLink>
        //             </NavItem>
        //         </Nav>
        //     ]
        } else {
            barItems = []
        }

        return (
            <div>
                <Navbar color="light" light expand="md">
                    <NavbarBrand tag={RRNavLink}>
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