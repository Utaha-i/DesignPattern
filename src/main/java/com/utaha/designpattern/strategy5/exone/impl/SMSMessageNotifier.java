package com.utaha.designpattern.strategy5.exone.impl;


import com.utaha.designpattern.strategy5.exone.MessageNotifier;
import com.utaha.designpattern.strategy5.exone.pojo.User;

/**
 * 短信发送Api
 */
public class SMSMessageNotifier implements MessageNotifier {
    @Override
    public boolean support(int notifyType) {
        return notifyType == 0;
    }

    @Override
    public void notify(User user, String content) {
        //调用短信通知的api发送短信
        System.out.println(user.getName() + "发送了短信" + content);
    }
}