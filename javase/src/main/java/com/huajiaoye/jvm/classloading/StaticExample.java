package com.huajiaoye.jvm.classloading;

public class StaticExample {
    // 静态变量，在加载阶段分配内存，但不赋值
    static int staticVariable;

    // 静态初始化块，在初始化阶段进行
    static {
        System.out.println("Static initialization block executed");
        staticVariable = 42;
    }
}
