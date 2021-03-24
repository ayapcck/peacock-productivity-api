package com.peacockProductivity.dao;

import com.peacockProductivity.entities.Role;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;

public class RoleDAO extends AbstractDAO<Role> {
    public RoleDAO(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public Optional<Role> get(int id) {
        return Optional.ofNullable(super.get(id));
    }

    public List<Role> list() {
        return list(criteria());
    }
}
