# Citizen API

This API is responsible for getting Citizen's information from a database when a search is made by a user.

## Endpoints

Citizen API communicates over port **8003**

### Get Citizen(s) by Forename(s):
http://citizen:8003/getCitizensByForenames/{username}/{forenames}

### Get Citizen(s) by Surname:
http://citizen:8003/getCitizensBySurname/{username}/{surname}

### Get Citizen(s) by Fullname:
http://citizen:8003/getCitizensByFullname/{username}/{forenames}/{surname}

### Get Citizen by Id:
http://citizen:8003/getCitizenById/{username}/{citizenId}
