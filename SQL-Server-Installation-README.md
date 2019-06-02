## Install SQL Server on a Mac

1) Docker Installation : Install Docker

2) SQL Server Installation on Docker
 * https://database.guide/how-to-install-sql-server-on-a-mac/
 * https://adamwilbert.com/blog/2018/3/26/get-started-with-sql-server-on-macos-complete-with-a-native-gui
 * https://www.quackit.com/sql_server/mac/install_sql_server_on_a_mac.cfm
 
3) Pull the SQL Server Image
 * docker pull microsoft/mssql-server-linux
4) Launch the SQL Server Image
  * docker run -d --name sql_docker -e 'ACCEPT_EULA=Y' -e 'SA_PASSWORD=myPassw0rd' -p 1433:1433 microsoft/mssql-server-linux
5) To Check the Docker container is running or not
  * docker ps -all
  
6) Install sql-cli
 * https://www.quackit.com/sql_server/mac/install_sql-cli_on_a_mac.cfm
 * npm install -g sql-cli

7) Connect to SQL Server
  * mssql -u sa -p myPassw0rd

8) Verification
 * select @@version


9) SQL Server GUI for your Mac – Azure Data Studio
 * Intro : https://database.guide/what-is-azure-data-studio/
 * Installation Steps : https://database.guide/how-to-install-azure-data-studio-on-a-mac/
 * Connection Steps : https://database.guide/create-a-sql-server-database-with-azure-data-studio/
 
--- 

### Docker commands
 * https://www.digitalocean.com/community/tutorials/how-to-remove-docker-images-containers-and-volumes
 * docker ps -a : List all Containers
 * docker rm container_id or name : Remove Containers
 * docker images -a : List Images