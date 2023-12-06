package com.utaha.designpattern.factory2.method;


import com.utaha.designpattern.factory2.method.pojo.AmericanCoffee;
import com.utaha.designpattern.factory2.method.pojo.Coffee;

public class AmericanCoffeeFactory implements CoffeeFactory {

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}