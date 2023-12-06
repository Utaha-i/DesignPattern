package com.utaha.designpattern.chain7.exone.impl;


import com.utaha.designpattern.chain7.exone.Verify;
import com.utaha.designpattern.chain7.exone.pojo.UserAccount;

/**
 * 校验用户名称
 */
public class UserNameVerify extends Verify {
    @Override
    public void deploy(UserAccount userAccount) {
        if (userAccount.getUserName() != null){
            System.out.println("用户名校验通过");

            // 获取下一个验证器
            if (verify != null) {
                verify.deploy(userAccount);
            }
        } else {
            System.out.println("用户名校验未通过");
        }
    }
}