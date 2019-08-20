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

SSH into the VM you just created.

run **database_setup.sh** (change [MY_PASsWORD] and [DATABASE] to appropriate values first).

## Populate database

Upload data .csv files to **/var/lib/mysql-files/**

run **data_import.sh** (this will create tables and import data fro mthe csvs).



