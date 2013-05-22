package io.ett.ws;

import javax.ws.rs.*;

@Path("/mocked")
public class MockedServlet {

    @Path("/hello")
    @GET
    public String sayHello() {
        return "hello";
    }

    @Path("/bz")
    @POST
    @Consumes("application/xml")
    public void createBZ(@FormParam("bug") String bug, @FormParam("product") String product) {
        // 200 HTTP OK
    }

    @Path("/mead/{tag}/{pkg}")
    @GET
    @Produces("application/json")
    public String getMeadURL(@PathParam("tag") String tag, @PathParam("pkg") String pkg) {
        return tag + pkg;
    }
}
