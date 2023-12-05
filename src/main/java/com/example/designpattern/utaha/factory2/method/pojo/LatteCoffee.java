package com.example.designpattern.utaha.factory2.method.pojo;

/**
 * 拿铁咖啡 子类
 */
public class LatteCoffee extends Coffee {

    String name = "LatteCoffee";

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
