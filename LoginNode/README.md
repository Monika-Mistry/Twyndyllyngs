# Final Project: Login Service

## Index
[0. Architecture](#arch)
   
[1. Node](#node)
   
[2. Passport](#passport)

[3. BCrypt](#bCrypt)

[4. Database](#data)

[5. Requests](#requests)

[6. Authors](#auth)

[7. Acknowledgements](#ack)

<a name="arch"></a>
# 0. Architecture

### Module Architecture

![Module Architecture](/Documentation/Architecture/Modules/Login.PNG)

### Application Architecture

![Application Architecture](/Documentation/Architecture/Application.PNG)

<a name="node"></a>
# 1. Node

Node.js fulfils the server architecture.
The Node server connects the core microservice to the user database.

This allows two different kind of users to log in.
1. An Auditor (who has priviledges to create users)
2. An Analyst (who may access the front end analyst pages)

<a name="passport"></a>
# 2. Passport

Passport is used to enable authentication for front-end users.
On login a Javascript Web Token (JWT) is sent to the browser which is cached.
This is then checked when navigating through the React front-end architecture to allow access to either Auditor or Analyst pages.
If the JWT is dropped (on logout, or unauthenticated user) the front-end user interface will revert automatically to a log-in page on every navigation link or refresh.
Therefore no end-points can be accessed unless the user is authenticated.

<a name="bCrypt"></a>
# 3. BCrypt

Passwords are encrypted using bcrypt.
These are hashed and stored in the database.
On login the hashed password is compared to the entered password using the bcrypt.compare function.
No passwords are sent to the front end.

<a name="data"></a>
# 4. Database

The user database is a MySQL database hosted on a Google Cloud Services VM.
This is accessed through the Sequelizer node_module and a password which is .gitignored. 

<a name="requests"></a>
# 5. Requests

User requests from the front end are validated in the API and then forwarded to the core API. The Login service acts as a gateway to the other services in the system where only authorised users can access the data. It communicates over port 8002.

<a name="auth"></a>
# 6. Authors

1. Rich Harris
2. Owen Miller
3. Thi Nguyen
4. Monika Mistry
5. Josh Brooks

<a name="ack"></a>
# 7. Acknowledgements

* QA consulting and our fantastic instructors.
