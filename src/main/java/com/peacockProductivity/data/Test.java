package com.peacockProductivity.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Test {
    private String testString;

    public Test() {

    }

    public Test(String testString) {
        this.testString = testString;
    }

    @JsonProperty
    public String getTestString() {
        return testString;
    }
}
