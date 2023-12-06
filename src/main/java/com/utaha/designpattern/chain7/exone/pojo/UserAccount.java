package com.utaha.designpattern.chain7.exone.pojo;

import lombok.Data;

/**
 * 用户账户信息
 * 包含 : 账号 , 密码 , 电话号码
 */
@Data
public class UserAccount {

    private String userName;
    private String password;
    private String phoneNumber;

}