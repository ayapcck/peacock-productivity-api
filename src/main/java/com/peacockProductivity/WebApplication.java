package com.peacockProductivity;

import com.peacockProductivity.dao.UserDAO;
import com.peacockProductivity.entities.User;
import com.peacockProductivity.resources.TestResource;
import com.peacockProductivity.resources.UserResource;
import io.dropwizard.Application;
import io.dropwizard.db.DataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.hibernate.SessionFactory;

public class WebApplication extends Application<WebConfiguration> {

    public static void main(String[] args) throws Exception {
        new WebApplication().run(args);
    }

    @Override
    public void run(WebConfiguration config, Environment env) {
        SessionFactory sessionFactory = hibernate.getSessionFactory();

        UserDAO userDAO = new UserDAO(sessionFactory);

        env.jersey().register(new TestResource());
        env.jersey().register(new UserResource(userDAO));
        env.healthChecks().register("template", new HealthyCheck(config.getVersion()));
    }

    private final HibernateBundle<WebConfiguration> hibernate = new HibernateBundle<WebConfiguration>(User.class) {
        @Override
        public DataSourceFactory getDataSourceFactory(WebConfiguration configuration) {
            return configuration.getDataSourceFactory();
        }
    };

    @Override
    public void initialize(Bootstrap<WebConfiguration> bootstrap) {
        bootstrap.addBundle(hibernate);
    }

}
