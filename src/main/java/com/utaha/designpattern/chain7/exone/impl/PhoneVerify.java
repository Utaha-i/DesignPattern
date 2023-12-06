package com.utaha.designpattern.chain7.exone.impl;


import com.utaha.designpattern.chain7.exone.Verify;
import com.utaha.designpattern.chain7.exone.pojo.UserAccount;

/**
 * 校验手机号
 */
public class PhoneVerify extends Verify {
    @Override
    public void deploy(UserAccount userAccount) {
        if (userAccount.getPhoneNumber() != null){
            System.out.println("手机号校验通过");

            // 获取下一个验证器
            if (verify != null) {
                verify.deploy(userAccount);
            }
        } else {
            System.out.println("手机号校验未通过");
        }
    }
}