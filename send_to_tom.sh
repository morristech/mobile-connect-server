# Maven Build
mvn clean verify
# Copy to tommcat
sudo cp target/oidc-server.war /usr/share/tomcat8/webapps/
# Restart tomcat
sudo systemctl restart tomcat8
