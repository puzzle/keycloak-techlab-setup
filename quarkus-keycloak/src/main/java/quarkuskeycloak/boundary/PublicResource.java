package quarkuskeycloak.boundary;

import org.jboss.resteasy.annotations.cache.NoCache;

import javax.annotation.security.RolesAllowed;
import javax.json.bind.JsonbBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/public")
public class PublicResource {

    @GET
    @NoCache
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello() {
        return "{ \"payload\": \"Hello World!\" }";
    }
}