package com.example.designpattern.utaha.chain7.exone;

import com.utaha.chain7.exone.pojo.UserAccount;

/**
 * 校验类的父类
 * 校验账号 , 校验密码 , 校验手机号 的请求类都需要继承该类
 */
public abstract class Verify {

    /**
     * 责任链的核心是类中包含一个自己
     *      包含一个与自己相同类型的对象
     * 责任链模式中的 校验器 封装一个 校验器 本身
     * 使用 protected 修饰的目的是让子类可以获取到该类
     */
    protected Verify verify;

    /**
     * 设置下一个校验器
     * @param verify 校验器
     */
    public void setNextVerify(Verify verify) {
        this.verify = verify;
    }

    /**
     * 校验过程
     * 需要子类进行实现
     */
    public abstract void deploy(UserAccount userAccount);
}