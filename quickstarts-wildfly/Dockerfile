FROM jboss/wildfly:21.0.2.Final
RUN /opt/jboss/wildfly/bin/add-user.sh admin secret --silent
RUN cd /opt/jboss/wildfly/ && \
 curl -L -k https://github.com/keycloak/keycloak/releases/download/12.0.1/keycloak-oidc-wildfly-adapter-12.0.1.tar.gz --output keycloak-wildfly-adapter.tar.gz && \
 tar -zxvf keycloak-wildfly-adapter.tar.gz && \
 ./bin/jboss-cli.sh --file=bin/adapter-install-offline.cli
ENTRYPOINT ["/opt/jboss/wildfly/bin/standalone.sh"]
CMD ["-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
