package com.peacockProductivity;

import com.codahale.metrics.health.HealthCheck;

public class HealthyCheck extends HealthCheck {
    private final String version;

    public HealthyCheck(String version) {
        this.version = version;
    }

    @Override
    protected Result check() throws Exception {
        return Result.healthy("OK with version: " + this.version + ".");
    }
}
