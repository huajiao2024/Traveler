package com.huajiaoye.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    public void testGetGreeting() {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals("Hello, World!",helloWorld.getGreeting());
    }
}