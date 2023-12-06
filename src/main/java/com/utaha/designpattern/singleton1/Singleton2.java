package com.utaha.designpattern.singleton1;

public class Singleton2 {
    /*
        持有私有静态实例，防止被引用
    */
    private static Singleton2 instance = new Singleton2();

    /*
        私有构造方法，防止被实例化
    */
    private Singleton2() {
    }

    /*
        2:饿汉式
    */
    public static Singleton2 getInstance() {
        return instance;
    }
}
