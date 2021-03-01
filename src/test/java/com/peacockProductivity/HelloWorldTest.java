package com.peacockProductivity;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void HelloWorldGenericTest() {
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertEquals("Hello World!", helloWorld.testThing());
    }

}