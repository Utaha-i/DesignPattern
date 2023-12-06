package com.utaha.designpattern.abstractFactory3.pojo.coffee;

/**
 * 咖啡超类
 */
public class Coffee {

    String name = "Unknown Coffee";

    public String getName() {
        return name;
    }

    public void addMilk() {
        this.name = name + " + milk";
    }

    public void addSugar() {
        this.name = name + " + sugar";
    }

    @Override
    public String toString(){
        return "咖啡：" + getName();
    }
}
