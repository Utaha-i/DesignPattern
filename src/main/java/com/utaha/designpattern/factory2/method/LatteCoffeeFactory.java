package com.utaha.designpattern.factory2.method;


import com.utaha.designpattern.factory2.method.pojo.Coffee;
import com.utaha.designpattern.factory2.method.pojo.LatteCoffee;

public class LatteCoffeeFactory implements CoffeeFactory {

    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}

