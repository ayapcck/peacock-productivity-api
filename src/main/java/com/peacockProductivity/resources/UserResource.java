package com.peacockProductivity.resources;

import com.codahale.metrics.annotation.Timed;
import com.peacockProductivity.dao.UserDAO;
import com.peacockProductivity.entities.User;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Optional;

import static com.peacockProductivity.common.Constants.USER_ID;

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
    @UnitOfWork
    @Path("/{" + USER_ID + "}")
    public Response getUserById(@PathParam(USER_ID) int userId) {
        Optional<User> optUser = userDAO.get(userId);
        return Response.ok(optUser.get()).build();
    }

    @GET
    @Timed
    @Path("/list")
    @UnitOfWork
    public List<User> listUsers() {
        return userDAO.list();
    }


}
