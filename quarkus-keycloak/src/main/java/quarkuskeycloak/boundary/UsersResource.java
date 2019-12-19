package quarkuskeycloak.boundary;

import org.jboss.resteasy.annotations.cache.NoCache;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/api/me")
public class UsersResource {

    @GET
    @NoCache
    @Produces(MediaType.APPLICATION_JSON)
    public User me() {
        return new User();
    }

    public class User {
        private final String username = "Greg Graffin";

        public String getUsername() {
            return username;
        }
    }
}