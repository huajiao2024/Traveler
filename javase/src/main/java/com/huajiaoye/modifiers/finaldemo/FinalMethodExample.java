package com.huajiaoye.modifiers.finaldemo;

/*
* final 修饰的方法不能被子类继承
* staitc 修饰的静态方法，是属于类的，不能被重写，也就没有 static final 的必要
*
*
* */

public class FinalMethodExample extends BaseClass {

    //@Override
    //public void doSomething() {
    //    super.doSomething();
    //}

    public static void doSomethingElse(){
        System.out.println("Derived Doing something else.");
    }

    public static void main(String[] args) {
        // doSomething();
        BaseClass.doSomethingElse();
        FinalMethodExample.doSomethingElse();
    }
}

