!#/bin/bash
 
# get updates
sudo apt-get update

# install mysql server
sudo apt-get -y install mysql-server-5.7

# Improve mysql security
sudo mysql_secure_installation


# configure server to listen on its internal ip address
LOCAL_IP=$(curl  http://metadata.google.internal/computeMetadata/v1/instance/network-interfaces/0/ip \
    -H "Metadata-Flavor: Google")

sudo sed -i "s|bind-address.*|bind-address = $LOCAL_IP|" /etc/mysql/mysql.conf.d/mysqld.cnf

# restart mysql
sudo service mysql restart

# test the server is running locally
sudo mysql --user=root -p -e "show databases"


sudo mysql -uroot -p \
    -e "CREATE USER 'REMOTE'@'%' IDENTIFIED BY '[MY_PASSWORD]';"

sudo mysql -uroot -p -e \
    "GRANT ALL PRIVILEGES ON *.* TO 'REMOTE'@'%' IDENTIFIED BY '[MY_PASSWORD]';"

sudo mysql -uroot -p -e "CREATE DATABASE [DATABASE]"


