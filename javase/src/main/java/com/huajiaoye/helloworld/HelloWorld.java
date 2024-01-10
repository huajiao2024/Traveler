package com.huajiaoye.helloworld;

public class HelloWorld {
    public String getGreeting() {
        return "Hello, World!";
    }
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.getGreeting());
    }
}
