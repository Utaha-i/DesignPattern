package com.utaha.designpattern.factory2.method.pojo;

/**
 * 美式咖啡 子类
 */
public class AmericanCoffee extends Coffee {

    String name = "AmericanCoffee";

    public String getName() {
        return name;
    }

    public void addMilk() {
        this.name = name + " + milk";
    }

    public void addSugar() {
        this.name = name + " + sugar";
    }

}
