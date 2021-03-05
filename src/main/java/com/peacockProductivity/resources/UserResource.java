package com.peacockProductivity.resources;

import com.codahale.metrics.annotation.Timed;
import com.peacockProductivity.dao.UserDAO;
import com.peacockProductivity.entities.User;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    private final UserDAO userDAO;

    public UserResource(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GET
    @Timed
    @Path("/list")
    @UnitOfWork
    public List<User> listUsers() {
        return userDAO.list();
    }


}
