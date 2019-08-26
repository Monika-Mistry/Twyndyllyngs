import React, { Component } from 'react';

export class CarProfile extends Component {
    render() {
        let page;
        if (this.props.data) {
            page = <p> Car Profile</p>
        } else {
            page = <p> Blank??</p>
        }
        return (
            <div>
                {page}
            </div>
        )
    }
}