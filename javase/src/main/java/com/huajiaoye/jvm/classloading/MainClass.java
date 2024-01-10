package com.huajiaoye.jvm.classloading;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Main method executed");
        System.out.println("Static variable value:" + StaticExample.staticVariable);
    }
}

/*
*  输出结果：
*     Main method executed
*     Static initialization block executed
*     Static variable value:42
* */