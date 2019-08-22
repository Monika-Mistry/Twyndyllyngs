import React from 'react'
import ReactGoogleMapLoader from "react-google-maps-loader"
import ReactGoogleMap from "react-google-map"

export const LocationMap = () =>
    <ReactGoogleMapLoader
        params={{
            key: "AIzaSyCI3cDduwloUnVSfREo-6wuRYTMjOHcQjc",
            libraries: "places,geometry",
        }}
        render={googleMaps =>
            googleMaps && (
                <div style={{ height: "800px" }}>
                    <ReactGoogleMap
                        googleMaps={googleMaps}
                        center={{ lat: 53.467204, lng: -2.280786 }}
                        zoom={16}
                    />
                </div>
            )}
    />