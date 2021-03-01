package com.gradle.helloWorld;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void FizzBuzzNormalNumbers() {
        HelloWorld helloWorld = new HelloWorld();
        Assert.assertEquals("Hello World!", helloWorld.testThing());
    }

}