# Maven Build
mvn clean verify
# Copy to tommcat
sudo cp target/mobile-connect-server.war /usr/share/tomcat8/webapps/oidc.war
# Restart tomcat
sudo systemctl restart tomcat8
