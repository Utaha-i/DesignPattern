package com.example.designpattern.utaha.abstractFactory3.pojo.dessert;

/**
 * 提拉米苏
 */
public class Tiramisu extends Dessert{

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
