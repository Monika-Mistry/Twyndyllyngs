import React, { Component } from 'react'

export class Phone extends Component {
   
    constructor(props) {
        super(props)
    }
   
    render() {
        return(
            <div>
                <p> Hello</p>
                <p> {this.props.data[1]}</p>
            </div>
        )
    }
}