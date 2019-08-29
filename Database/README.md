# Database Setup

## MySQL on Google Cloud Platform VM

## Create a Firewall rule:

https://console.cloud.google.com/networking/firewalls/add?project=idyllic-volt-244018

### Use the following settings:

**Name:** mysql-remote-access

**Target tags:** mysql-remote-access

**Source IP ranges:** 0.0.0.0/0

**Protocols and ports, tcp:** 3306


## Create a Compute Engine VM Instance on GCP: 

https://console.cloud.google.com/compute/instancesAdd?project=idyllic-volt-244018

### Use the following settings:

**Boot disk:** Ubuntu 18.04 LTS

**Firewall:** Allow Http traffic

**Network tags:** mysql-remote-access

Set external IP to be static rather than ephemeral.

## Install and configure MySQL server

**SSH** into the Virtual Machine you just created.

Run **database_setup.sh** (change [MY_PASSWORD] and [DATABASE] to appropriate values first).

## Populate database

Upload data .csv files to **/var/lib/mysql-files/**

Run the commands in **full_data_import.txt** (this will create tables and import data from the .csv files).

# Spring Boot App configuration

### Use the application.properties file in this repo in your application

Change [IP ADDRESS] to the IP address of the database virtual machine you just created.

### Add the following dependency to pom.xml:
```
<dependency>
  <groupId>com.github.ulisesbocchio</groupId>
  <artifactId>jasypt-spring-boot-starter</artifactId>
  <version>2.1.0</version>
</dependency>
```

### Add the following annotation to the main app (under @SpringBootApp):
```
@EnableEncryptableProperties
```

### Run your app with the following additional argument:
```
 -Djasypt.encryptor.password=[password]
 ```


