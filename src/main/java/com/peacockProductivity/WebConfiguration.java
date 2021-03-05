package com.peacockProductivity;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;
import io.dropwizard.db.DataSourceFactory;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class WebConfiguration extends Configuration {
    @Valid
    @JsonProperty("database")
    private DataSourceFactory dataSourceFactory;

    @Valid
    @JsonProperty
    private String version;

    @NotNull
    public DataSourceFactory getDataSourceFactory() {
        return dataSourceFactory;
    }

    @NotNull
    public String getVersion() {
        return version;
    }

    public void setDataSourceFactory(DataSourceFactory dataSourceFactory) {
        this.dataSourceFactory = dataSourceFactory;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
