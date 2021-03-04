package com.peacockProductivity;

import com.peacockProductivity.resources.TestResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class WebApplication extends Application<WebConfiguration> {

    public static void main(String[] args) throws Exception {
        new WebApplication().run(args);
    }

    @Override
    public void run(WebConfiguration config, Environment env) {
        env.jersey().register(new TestResource());
        env.healthChecks().register("template", new HealthyCheck(config.getVersion()));
    }

}
