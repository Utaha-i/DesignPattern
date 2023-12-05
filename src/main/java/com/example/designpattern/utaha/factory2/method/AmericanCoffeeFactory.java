package com.example.designpattern.utaha.factory2.method;

import com.utaha.factory2.method.pojo.AmericanCoffee;
import com.utaha.factory2.method.pojo.Coffee;

public class AmericanCoffeeFactory implements CoffeeFactory {

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}