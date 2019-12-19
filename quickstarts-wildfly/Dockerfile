FROM jboss/wildfly
RUN /opt/jboss/wildfly/bin/add-user.sh admin secret --silent
RUN cd /opt/jboss/wildfly/ && \
 curl https://downloads.jboss.org/keycloak/7.0.0/adapters/keycloak-oidc/keycloak-wildfly-adapter-dist-7.0.0.tar.gz --output keycloak-wildfly-adapter-dist-7.0.0.tar.gz && \
 tar -zxvf keycloak-wildfly-adapter-dist-7.0.0.tar.gz && \
 ./bin/jboss-cli.sh --file=bin/adapter-install-offline.cli
ENTRYPOINT ["/opt/jboss/wildfly/bin/standalone.sh"]
CMD ["-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
