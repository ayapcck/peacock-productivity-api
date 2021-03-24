package com.peacockProductivity.resources;

import com.codahale.metrics.annotation.Timed;
import com.peacockProductivity.dao.RoleDAO;
import com.peacockProductivity.entities.Role;
import io.dropwizard.hibernate.UnitOfWork;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/roles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RoleResource {

    private final RoleDAO roleDAO;

    public RoleResource(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }

    @GET
    @Timed
    @Path("/list")
    @UnitOfWork
    public List<Role> listUsers() {
        return roleDAO.list();
    }


}
