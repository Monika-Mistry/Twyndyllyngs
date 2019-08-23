!#/bin/bash
sudo mysql -e "
CREATE TABLE AnprCamera (
		anprPointId BIGINT,
		streetName VARCHAR(40),
		latitude DOUBLE,
		longitude DOUBLE,
	PRIMARY KEY (anprPointId)
);"

sudo mysql -e "
LOAD DATA INFILE '/var/lib/mysql-files/anprCamera_subset.csv' 
INTO TABLE AnprCamera
FIELDS TERMINATED BY ',' 
ENCLOSED BY '\"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(anprPointId, streetName, latitude, longitude);
"

sudo mysql -e "
CREATE TABLE AtmPoint (
        atmId BIGINT,
        operator VARCHAR(40), 
        streetName VARCHAR(50), 
        postcode VARCHAR(10), 
        latitude DOUBLE, 
        longitude DOUBLE, 
	PRIMARY KEY (atmId)
);
"
sudo mysql -e "
LOAD DATA INFILE '/var/lib/mysql-files/atmPoint_subset.csv' 
INTO TABLE AtmPoint
FIELDS TERMINATED BY ',' 
ENCLOSED BY '\"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(atmId,operator,streetName,postcode,latitude,longitude);
"

sudo mysql -e "
CREATE TABLE AtmTransactions (
        timeStamp DATETIME,
        atmId BIGINT, 
        bankCardNumber BIGINT, 
        type VARCHAR(20), 
        amount INT, 
        id INT NOT NULL AUTO_INCREMENT, 
	PRIMARY KEY (id)
);
"

sudo mysql -e "
LOAD DATA INFILE '/var/lib/mysql-files/atmTransactions_subset.csv' 
INTO TABLE AtmTransactions
FIELDS TERMINATED BY ',' 
ENCLOSED BY '\"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(timeStamp,atmId,bankCardNumber,type,amount);
"

sudo mysql -e "
CREATE TABLE BankCard (
        id BIGINT,
        cardNumber VARCHAR(16), 
        sortCode VARCHAR(10), 
        bankAccountId BIGINT, 
        accountNo VARCHAR(15), 
        bank VARCHAR(30), 
	PRIMARY KEY (id)
);
"
sudo mysql -e "
LOAD DATA INFILE '/var/lib/mysql-files/bankcard_subset.csv' 
INTO TABLE BankCard
FIELDS TERMINATED BY ',' 
ENCLOSED BY '\"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(id,cardNumber,sortCode,bankAccountId,accountNo,bank);
"
sudo mysql -e "
CREATE TABLE Celltower (
        cellTower BIGINT,
        operator VARCHAR(20), 
        type VARCHAR(10), 
        latitude DOUBLE, 
        longitude DOUBLE, 
	PRIMARY KEY (cellTower)
);
"
sudo mysql -e "
LOAD DATA INFILE '/var/lib/mysql-files/celltower_subset.csv' 
INTO TABLE Celltower
FIELDS TERMINATED BY ',' 
ENCLOSED BY '\"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(cellTower,operator,type,latitude,longitude);
"
sudo mysql -e "
CREATE TABLE Citizen (
        citizenID BIGINT,
        forenames VARCHAR(30), 
        surname VARCHAR(20), 
        homeAddress VARCHAR(100), 
        dateOfBirth DATE, 
        placeOfBirth VARCHAR(22), 
        sex VARCHAR(6),
	PRIMARY KEY (citizenID)
);
"

sudo mysql -e "
LOAD DATA INFILE '/var/lib/mysql-files/citizen_subset.csv' 
INTO TABLE Citizen
FIELDS TERMINATED BY ',' 
ENCLOSED BY '\"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(citizenID,forenames,surname,homeAddress,@dateofBirth,placeofBirth,sex)
SET dateOfBirth = STR_TO_DATE(@dateOfBirth,'%d/%m/%Y');
"

sudo mysql -e "
CREATE TABLE Epos (
        id BIGINT,
        vendor VARCHAR(50), 
        streetName VARCHAR(50), 
        postCode VARCHAR(10), 
        latitude DOUBLE, 
        longitude DOUBLE, 
	PRIMARY KEY (id)
);
"

sudo mysql -e "
LOAD DATA INFILE '/var/lib/mysql-files/epos_subset.csv' 
INTO TABLE Epos
FIELDS TERMINATED BY ',' 
ENCLOSED BY '\"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(id,vendor,streetName,postCode,latitude,longitude);
"

sudo mysql -e "
CREATE TABLE EposTransactions (
        timestamp DATETIME,
        eposid BIGINT,
        bankCard BIGINT, 
        payeeAccount BIGINT, 
        amount DOUBLE, 
	id INT NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (id)
);
"
sudo mysql -e "
LOAD DATA INFILE '/var/lib/mysql-files/eposTransactions_subset.csv' 
INTO TABLE EposTransactions
FIELDS TERMINATED BY ',' 
ENCLOSED BY '\"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(@timestamp,eposid,bankCard,payeeAccount,amount)
SET timestamp= STR_TO_DATE(@timestamp,'%Y-%m-%dT%H:%i:%s.%fZ');
"

sudo mysql -e "
CREATE TABLE MobileCallRecords (
        timestamp DATETIME,
        callerMSISDN VARCHAR(12),
        callCellTowerId VARCHAR(10), 
        receiverMSISDN VARCHAR(12), 
        receiverTowerId VARCHAR(10), 
	id INT NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (id)
);
"

sudo mysql -e "
LOAD DATA INFILE '/var/lib/mysql-files/mobileCallRecords_subset.csv' 
INTO TABLE MobileCallRecords
FIELDS TERMINATED BY ',' 
ENCLOSED BY '\"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(@timestamp,callerMSISDN,callCellTowerId,receiverMSISDN,receiverTowerId)
SET timestamp= STR_TO_DATE(@timestamp,'%Y-%m-%dT%H:%i:%s.%f');
"

sudo mysql -e "
CREATE TABLE PeopleBankAccount (
        bankAccountId BIGINT,
        accountNo VARCHAR(15), 
        bank VARCHAR(30), 
        forenames VARCHAR(30), 
        surname VARCHAR(20), 
        dateOfBirth DATE, 
        homeAddress VARCHAR(100),
	PRIMARY KEY (bankAccountId)
);
"

sudo mysql -e "
LOAD DATA INFILE '/var/lib/mysql-files/peoplebankaccount_subset.csv' 
INTO TABLE PeopleBankAccount
FIELDS TERMINATED BY ',' 
ENCLOSED BY '\"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(bankAccountId, accountNo,bank, forenames, surname, @dateOfBirth, homeAddress)#
SET dateOfBirth = STR_TO_DATE(@dateOfBirth,'%d/%m/%Y');
"
sudo mysql -e "
CREATE TABLE VehicleObservations (
	anprPointId BIGINT,
	timestamp DATETIME,
	vehicleRegistrationNo VARCHAR(15),
	id INT NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (id)
);
"

sudo mysql -e "
LOAD DATA INFILE '/var/lib/mysql-files/vehicleObservations_subset.csv' 
INTO TABLE VehicleObservations
FIELDS TERMINATED BY ',' 
ENCLOSED BY '\"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(anprPointId, @timestamp, vehicleRegistrationNo)
SET timestamp= STR_TO_DATE(@timestamp,'%Y-%m-%dT%H:%i:%s.%f');
"

sudo mysql -e "
CREATE TABLE VehicleRegistration (
	registrationId BIGINT,
	registrationDate DATE,
        vehicleRegistrationNo VARCHAR(15),
        make VARCHAR(30), 
        model VARCHAR(30), 
        colour VARCHAR(30),
	forenames VARCHAR(30),
	surname VARCHAR(20),
	address VARCHAR(100),
	dateOfBirth DATE,
	driverLicenceId VARCHAR(30),
	PRIMARY KEY (registrationId)
);
"
sudo mysql -e "
LOAD DATA INFILE '/var/lib/mysql-files/vehicleRegistration_subset.csv' 
INTO TABLE VehicleRegistration
FIELDS TERMINATED BY ',' 
ENCLOSED BY '\"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(registrationId, @registrationDate, vehicleRegistrationNo, make, model, colour, forenames, surname, address, @dateOfBirth, driverLicenceId)
SET registrationDate = STR_TO_DATE(@registrationDate,'%d/%m/%Y') , dateOfBirth = STR_TO_DATE(@dateOfBirth,'%d/%m/%Y');
"

sudo mysql -e "
CREATE TABLE Vehicles (
        vehicleRegistrationNo VARCHAR(15),
        make VARCHAR(30), 
        model VARCHAR(30), 
        colour VARCHAR(30), 
	PRIMARY KEY (vehicleRegistrationNo)
);
"

sudo mysql -e "
LOAD DATA INFILE '/var/lib/mysql-files/vehicles_subset.csv' 
INTO TABLE Vehicles
FIELDS TERMINATED BY ',' 
ENCLOSED BY '\"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(vehicleRegistrationNo, make, model, colour);
"

sudo mysql -e "
CREATE TABLE PeopleMobile (
        forenames VARCHAR(30), 
        surname VARCHAR(20), 
        address VARCHAR(100),
	dateOfBirth DATE,
        phoneNumber VARCHAR(50),
        network VARCHAR(20),
	id INT NOT NULL AUTO_INCREMENT,
	PRIMARY KEY (id)
);
"

sudo mysql -e "
LOAD DATA INFILE '/var/lib/mysql-files/peoplemobile_subset.csv' 
INTO TABLE PeopleMobile
FIELDS TERMINATED BY ',' 
ENCLOSED BY '\"'
LINES TERMINATED BY '\r\n'
IGNORE 1 ROWS
(forenames,surname,@dateOfBirth,address,phoneNumber,network)
SET dateOfBirth = STR_TO_DATE(@dateOfBirth,'%d/%m/%Y');
"