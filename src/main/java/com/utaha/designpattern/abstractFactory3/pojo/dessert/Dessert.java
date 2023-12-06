package com.utaha.designpattern.abstractFactory3.pojo.dessert;


/**
 * 甜点 超类
 */
public class Dessert {
    String name = "Unknown Dessert";

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
    public String toString() {
        return "甜点：" + getName();
    }
}
