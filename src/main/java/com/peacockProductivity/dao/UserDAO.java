package com.peacockProductivity.dao;

import com.peacockProductivity.entities.User;
import io.dropwizard.hibernate.AbstractDAO;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Optional;

public class UserDAO extends AbstractDAO<User> {
    public UserDAO(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public Optional<User> get(int id) {
        return Optional.ofNullable(super.get(id));
    }

    public List<User> list() {
        return list(criteria());
    }
}
