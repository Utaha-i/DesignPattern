package com.example.designpattern.utaha.abstractFactory3;

import com.utaha.abstractFactory3.pojo.coffee.AmericanCoffee;
import com.utaha.abstractFactory3.pojo.coffee.Coffee;
import com.utaha.abstractFactory3.pojo.dessert.Dessert;
import com.utaha.abstractFactory3.pojo.dessert.MatchMouse;

//美式甜点工厂
public class AmericanDessertFactory implements DessertFactory {

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchMouse();
    }

}