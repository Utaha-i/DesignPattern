package com.example.designpattern.utaha.factory2.simple;

public class SimpleAnimalFactory {

    public Animal createAnimal(String animalType) {
        if ("cat".equals(animalType)) {
            Cat cat = new Cat();
            //一系列复杂操作
            return cat;
        } else if ("dog".equals(animalType)) {
            Dog dog = new Dog();
            //一系列复杂操作
            return dog;
        } else {
            throw new RuntimeException("animalType=" + animalType + "无法创建对应对象");
        }
    }
}
