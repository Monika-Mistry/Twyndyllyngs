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

A client works at an investigation agency. As part of their job they need to analyse a large amount of secure data provided by a third-party provider. The data includes records from various different database tables.

#### Scenario 1: A person has been detained
A person has been detained by an investigator. They would like to find out more information about the suspect using the data provided. They only have the suspect’s name and would like to search the data to determine more information about the suspect’s background.

#### Scenario 2: An incident has occurred
An incident has occurred and the investigation team are on the case. The team needs to find out who was in the vicinity of the incident at that particular point in time. They want to find out the details of potential suspects using location and time-stamped data.

#### Scenario 3: Suspect flees the scene
A suspect is fleeing the scene of an incident in a car. The number plate of the car has been reported to the investigation agency. The investigators need to narrow down a suspect using the reported number plate and find out where else they have been.

<a name="solution"></a>
### Solution

Project Chameleon delivers a sovereign stand-alone data searching application. 
* Microserviced architecture is used to ensure development best practices, with a mixture of local and cloud-hosted environments for development. 
* Security was the primary consideration when designing, structuring, and developing the project. 
* The final product is entirely cloud hosted on multiple VMs on the Google Cloud Platform. 

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
* Funding - £30 budget for cloud resources and cloud database solutions were out of our budget. The application has been deployed using a free trial on GCP which also had resource restrictions:
> Your free trial credit applies to all GCP resources, except that you cannot:
> Have more than 8 cores (or virtual CPUS) running at the same time.
> Add GPUs to your instances.
> Request a quota increase. For an overview of Compute Engine quotas, see Resource Quotas.
* Time - The scope of the project was very short.
* Team - Team composition did not reflect a standard team structure, team consisted of all junior developers.

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
