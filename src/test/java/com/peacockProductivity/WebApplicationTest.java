package com.peacockProductivity;

import org.junit.Assert;
import org.junit.Test;

public class WebApplicationTest {

    @Test
    public void HelloWorldGenericTest() {
        WebApplication webApplication = new WebApplication();
        Assert.assertEquals("Hello World!", webApplication.testThing());
    }

}