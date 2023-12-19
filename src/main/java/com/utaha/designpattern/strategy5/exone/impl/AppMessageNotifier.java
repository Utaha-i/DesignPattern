package com.utaha.designpattern.strategy5.exone.impl;


import com.utaha.designpattern.strategy5.exone.MessageNotifier;
import com.utaha.designpattern.strategy5.exone.pojo.User;

/**
 * App通知Api
 */
public class AppMessageNotifier implements MessageNotifier {

    @Override
    public boolean support(int notifyType) {
        return notifyType == 1;
    }

    @Override
    public void notify(User user, String content) {
       //调用通知app通知的api
        System.out.println(user.getName() + "发送了app通知" + content);
    }
}