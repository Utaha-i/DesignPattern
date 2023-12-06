package com.utaha.designpattern.abstractFactory3.pojo.dessert;

/**
 * 抹茶慕斯
 */
public class MatchMouse extends Dessert{

    String name = "Tiramisu";

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
