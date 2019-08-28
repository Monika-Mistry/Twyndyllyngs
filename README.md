# Project Chameleon - Team Twyndyllyngs

In fulfilment of the final group project for week 16 of QA Academy.

## Index
[Brief](#brief)
  * [Solution](#solution)
  
[Architecture](#architecture)
  * [Multi Tier Architechture Diagram](#mla)
  
[Wireframes](#wireframes)
  * [Link to Dynamic High-Fidelity Wireframes](https://xd.adobe.com/view/599b62f7-9972-4b4e-55b9-dce92bf4cd81-2faa/)
  
[Testing](#testing)

[Deployment](#depl)
  * [Technologies Used](#tech)

[Limitations](#limitations)
  
[Aspirations for the Future](#nextsteps)

[Authors](#auth)

[Acknowledgements](#ack)

<a name="brief"></a>
## Brief
[insert brief here]

<a name="solution"></a>
### Solution

Project Chameleon delivers an application utilising microservices to perform various tasks. Security played a key role in structuring the delivered product and ...

<a name="architecture"></a>
## Architecture

<a name="mla"></a>
### Multi Tier Architechture Diagram

![Application Architecture](/Documentation/Architecture/Ports.PNG)

<a name="wireframes"></a>
## Wireframes

High-fidelity wireframes to demonstrate how the final product could look were created and can be viewed [here](https://xd.adobe.com/view/599b62f7-9972-4b4e-55b9-dce92bf4cd81-2faa/).

<a name="testing"></a>
## Testing

JUnit, Mockito and selenium tests have been used for automated testing, and SonarQube for static analysis and ECLEmma for test coverage.

Test coverage for the backend services achieves a minimum of 70%, there are as of yet no working Selenium tests. 

The SonarQube static analysis shows minor code smells relating to entity constructors used for testing and duplicated code across entities.


<a name="depl"></a>
## Deployment

<a name="tech"></a>
### Technologies Used
* Version Control – Git
* Agile Project Management - Jira
* Frameworks - Spring, React
* Libraries - Node, React
* Build Tool/Dependency Management - Maven, Node Package Manager (NPM)
* Integrated Developement Environment(IDE) - Visual Studio Code, Spring Tool Suite
* CI Server - Jenkins
* Testing - JUnit, Mockito, SonarQube, ECLEmma
* Cloud Services - Google Cloud Platform (GCP)
* Containerisation Tool - docker, docker-compose
* Database - mongo, mySQL
* Languages - Java, JavaScript, Git, SQL, HTML/CSS

<a name="limitations"></a>
## Application Limitations

<a name="nextsteps"></a>
## Aspirations for the Future

* Using machine learning (ML)/artificial intelligence (AI) to suggest and refine suggestions of linked data to the end user.
* End users can publish a final report containing their analysis.
* Enable the user interface to add records to the database.
* Enable the map as the primary user interface.
* Optimise for both desktop and mobile.
* All of the immediate above to enable operation staff to directly feed into the database with live observations.
* Refine the UI through user acceptance testing and user feedback to enable user flow.
* Code for heat mapping of suspect activity on the geographic display.
* Modify to allow live steaming data captured live to display on the user interface, instead of – or in addition to – the static database entries.
* Enhance security of endpoints, services, and database through extra layers of encryption and containerisation.
* Speed up the database responses through a thorough schema of indexes.
* Develop connective interface architecture to enable the application to “plug-and-play” into different database technologies or streams, allowing the product to more easily be sold off-the-shelf.
* Develop future-proofed technology agnostic end-points to enable the application to remain current as back-end architecture changes over time.

<a name="auth"></a>
## Authors

1. [Rich Harris](https://github.com/RJHarrisUK "Rich's GitHub")
2. [Owen Miller](https://github.com/biomiller "Owen's GitHub")
3. [Thi Nguyen](https://github.com/thi6 "Thi's GitHub")
4. [Monika Mistry](https://github.com/Monika-Mistry "Monika's GitHub")
5. [Josh Brooks](https://github.com/jjbrooks251 "Josh's Github")

<a name="ack"></a>
## Acknowledgements

* QA consulting and our fantastic instructors.
