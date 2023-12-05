package com.example.designpattern.utaha.strategy5.impl;

import com.utaha.strategy5.MessageNotifier;
import com.utaha.strategy5.pojo.User;

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