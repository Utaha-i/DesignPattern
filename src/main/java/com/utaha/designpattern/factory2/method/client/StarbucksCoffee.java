package com.utaha.designpattern.factory2.method.client;


import com.utaha.designpattern.factory2.method.AmericanCoffeeFactory;
import com.utaha.designpattern.factory2.method.LatteCoffeeFactory;
import com.utaha.designpattern.factory2.method.CoffeeFactory;
import com.utaha.designpattern.factory2.method.pojo.Coffee;

/**
 * 咖啡馆（供应咖啡）
 */
public class StarbucksCoffee {

    public static void main(String[] args) {
        //模拟请求为美式美式咖啡
        String coffeeType = "AmericanCoffee";
        //默认工厂interface
        CoffeeFactory coffeeFactory = null;
        if ("AmericanCoffee".equals(coffeeType)) {
            //美式咖啡工厂
            coffeeFactory = new AmericanCoffeeFactory();
        } else {
            //拿铁咖啡工厂
            coffeeFactory = new LatteCoffeeFactory();
        }
        Coffee coffee = orderCoffee(coffeeFactory);
        System.out.println(coffee.toString());

    }

    /**
     *
     * @param factory 需要哪个具体工厂生产咖啡
     * @return 要产生的咖啡子类
     */
    public static Coffee orderCoffee(CoffeeFactory factory) {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}