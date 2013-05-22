package io.ett.ws;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/mocked")
public class MockedServlet {

    @Path("/hello")
    @GET
    public String sayHello() {
        return "hello";
    }

    @Path("/bz")
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String createBZ(@FormParam("bug") String bug, @FormParam("product") String product) {
        return bug + product;
    }

    @Path("/mead/{tag}/{pkg}")
    @GET
    @Produces("application/json")
    public String getMeadURL(@PathParam("tag") String tag, @PathParam("pkg") String pkg) {
        return tag + pkg;
    }
}
