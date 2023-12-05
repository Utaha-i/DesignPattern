package com.example.designpattern.utaha.templateMethod6.client;

import com.utaha.templateMethod6.impl.WesternEurope;

public class Demo01 {
    public static void main(String[] args) {
        WesternEurope westernEurope = new WesternEurope();
        westernEurope.travel();
        westernEurope.cost();
    }
}
