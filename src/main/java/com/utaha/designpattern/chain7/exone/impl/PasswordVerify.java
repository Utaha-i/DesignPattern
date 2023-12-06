package com.utaha.designpattern.chain7.exone.impl;


import com.utaha.designpattern.chain7.exone.Verify;
import com.utaha.designpattern.chain7.exone.pojo.UserAccount;

/**
 * 校验密码
 */
public class PasswordVerify extends Verify {
    @Override
    public void deploy(UserAccount userAccount) {
        if (userAccount.getPassword() != null){
            System.out.println("密码校验通过");

            // 获取下一个验证器
            if (verify != null) {
                verify.deploy(userAccount);
            }
        } else {
            System.out.println("密码校验未通过");
        }
    }
}