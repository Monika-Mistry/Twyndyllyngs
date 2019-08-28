import React from 'react'
import { PhoneHead } from './PhoneHeader.js'

export default function Phone(props) {
   
   
        return(
            <div>
                <PhoneHead data={props.data} />
                {/* <h3>Coming Soon</h3> */}
            </div>
        )
  
}