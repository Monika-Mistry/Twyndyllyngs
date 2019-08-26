import React, { Component } from 'react'
import { PhoneHead } from './PhoneHeader.js'
export class Phone extends Component {
   
    constructor(props) {
        super(props)
    }
   
    render() {
        return(
            <div>
                <p> Hello</p>
                <PhoneHead date={this.props.data} />
            </div>
        )
    }
}