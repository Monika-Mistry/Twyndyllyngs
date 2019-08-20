# Core API

This API is responsible for redirecting incoming requests to the correct APIs. It also acts as the producer for the auditing, sending messages any time a search is executed by a user.

## Endpoints

Core API communicates over port **8000**

### Citizen

**Get Citizen By Forename(s):** http://core:8000/getCitizensByForenames/{username}/{forenames}

**Get Citizen By Surname:** http://core:8000/getCitizensBySurname/{username}/{surname}

**Get Citizen By Forename(s) and Surname:** http://core:8000/getCitizensByFullname/{username}/{forenames}/{surname}

**Get Citizen By Id:** http://core:8000/getCitizenById/{username}/{citizenId}

### User

**Login User:**

**Create User:**

**Delete User:**
