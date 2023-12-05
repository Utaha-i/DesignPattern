package com.example.designpattern.utaha.templateMethod6.impl;

import com.utaha.templateMethod6.TravelImpl;

public class WesternEurope extends TravelImpl {

    @Override
    public void makePlan() {
        System.out.println("制定计划");
    }

    /**
     * 收拾行李，超类已经做了实现，子类无特殊处理不需要重写
     */
//    @Override
//    protected void packUp() {
//    }

    @Override
    public void toDestination() {
        System.out.println("去目的地");
    }

    @Override
    public void play() {
        System.out.println("爽玩");
    }

    @Override
    public void backHome() {
        System.out.println("希望这个夏天不会落幕！");
    }

    @Override
    public void cost() {
        System.out.println("西欧一次所需要的金额");
    }
}
