package com.huajiaoye.modifiers.finaldemo;

/*
*   用 final 修饰的变量表示常量，一旦被赋值后不可再次修改
*   用 static final 用于定义类级别的常量，该常量在所有实例间共享，并且不能再次修改。
*   用 static 关键字是类级别的静态变量
*
* */

public class FinalVariableExample {
    public static final int MAX_SIZE = 100;

    public static int MAX_AGE = 100;

    public static void main(String[] args) {

        System.out.println(FinalVariableExample.MAX_SIZE);
        // FinalVariableExample.MAX_SIZE = 200; 编译错误

        System.out.println(FinalVariableExample.MAX_AGE);
        FinalVariableExample.MAX_AGE = 200;
        System.out.println(FinalVariableExample.MAX_AGE);

        final int MAX_VALUE = 100;
        System.out.println("MAX_VALUE:" + MAX_VALUE);
        // MAX_VALUE = 200; 编译错误，final 变量不能再次赋值
    }
}
