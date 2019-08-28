import React from 'react';
import {
    withRouter
} from "react-router-dom";

import { authed } from './authenticator';

export const AuthButton = withRouter(
    ({ history }) =>
        authed.isAuthenticated ? (
            <p>
                Welcome!{" "}
                <button
                    onClick={() => {
                        authed.signout(() => history.push("/"));
                    }}
                >
                    Sign out
          </button>
            </p>
        ) : (
                <p>You are not logged in.</p>
            )
);