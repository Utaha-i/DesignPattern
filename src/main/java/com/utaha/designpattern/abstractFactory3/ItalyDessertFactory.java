package com.utaha.designpattern.abstractFactory3;

import com.utaha.designpattern.abstractFactory3.pojo.coffee.Coffee;
import com.utaha.designpattern.abstractFactory3.pojo.coffee.LatteCoffee;
import com.utaha.designpattern.abstractFactory3.pojo.dessert.Dessert;
import com.utaha.designpattern.abstractFactory3.pojo.dessert.Tiramisu;

//意大利风味甜点工厂
public class ItalyDessertFactory implements DessertFactory {

    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new Tiramisu();
    }

}