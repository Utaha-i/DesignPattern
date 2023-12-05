package com.example.designpattern.utaha.chain7.exone.client;

import com.utaha.chain7.exone.impl.PasswordVerify;
import com.utaha.chain7.exone.impl.PhoneVerify;
import com.utaha.chain7.exone.impl.UserNameVerify;
import com.utaha.chain7.exone.pojo.UserAccount;

/**
 * 程序入口
 */
public class Main {
    public static void main(String[] args) {
        UserNameVerify userNameVerify = new UserNameVerify();
        PasswordVerify passwordVerify = new PasswordVerify();
        PhoneVerify phoneVerify = new PhoneVerify();

        UserAccount userAccount = new UserAccount();
        userAccount.setUserName("username");
        userAccount.setPassword("123456");
        userAccount.setPhoneNumber("13888888888");

        // 创建职责链
        userNameVerify.setNextVerify(passwordVerify);
        passwordVerify.setNextVerify(phoneVerify);

        // 开始校验 , 执行职责链
        userNameVerify.deploy(userAccount);
    }
}