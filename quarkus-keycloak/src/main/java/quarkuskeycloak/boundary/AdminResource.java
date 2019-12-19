package quarkuskeycloak.boundary;

import org.jboss.resteasy.annotations.cache.NoCache;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/admin")
public class AdminResource {

    @GET
    @NoCache
    @Produces(MediaType.TEXT_PLAIN)
    public String admin() {
        return "granted";
    }
}