package com.peacockProductivity.resources;

import com.codahale.metrics.annotation.Timed;
import com.peacockProductivity.data.Test;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class TestResource {

    public TestResource() {
    }

    @GET
    @Timed
    @Produces(MediaType.APPLICATION_JSON)
    public String getTestString() {
        Test test = new Test("Hello World");
        return test.getTestString();
    }
}
