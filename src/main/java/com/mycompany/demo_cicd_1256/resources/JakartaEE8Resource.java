package com.mycompany.demo_cicd_1256.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/hello")
public class JakartaEE8Resource {

    @GET
    public Response hello() {
        return Response.ok("Hello Jakarta EE 10 🚀").build();
    }
}
