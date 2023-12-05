package com.example.designpattern.utaha.abstractFactory3.pojo.coffee;

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
