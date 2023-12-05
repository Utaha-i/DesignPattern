package com.example.designpattern.utaha.templateMethod6;

/**
 * 旅行的模板类
 */
public abstract class TravelImpl implements Travel{

    public void travel() {
        //做攻略
        makePlan();

        //收拾行李
        packUp();

        //去目的地
        toDestination();

        //玩耍、拍照
        play();

        //乘坐交通工具去返回
        backHome();
    }
    protected abstract void makePlan();

    /**
     * 收拾行李为“通用的”方法 ，不需要设为抽象方法
     */
    protected void packUp(){
        System.out.println("收拾一下行李，并不需要子类特殊处理；如需要，则重新超类方法");
    }

    protected abstract void toDestination();

    protected abstract void play();

    protected abstract void backHome();

    @Override
    public void cost() {
        System.out.println("旅游所花费的金额");
    }

}
