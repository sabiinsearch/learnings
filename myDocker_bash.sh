## Create my own Docker network

network_name="myDocker_net"

# Check if the network exists
if docker network ls | grep -q "$network_name"; then
  echo "Network '$network_name' already exists."
else
  # Create the network
  echo "Creating network '$network_name'..."
  docker network create "$network_name"
  echo "Network '$network_name' created."
fi
## Create SQL Server in same network
docker run --name mysql-server --network myDocker_net_1 -v mysql-data:/var/lib/mysql -e MYSQL_ROOT_PASSWORD=my-secret-pw -d -p 3306:3306 mysql:latest

## Create SQL client in same network
docker run -it --rm --network myDocker_net_1 mysql:8.0 mysql -h mysql-server -u root -p
