docker network create myDocker_net
docker run --name mysql-server --network myDocker_net_1 -v mysql-data:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -d -p 3306:3306 mysql:latest
docker run -it --rm --network myDocker_net_1 mysql:8.0 mysql -h mysql-server -u root -p
