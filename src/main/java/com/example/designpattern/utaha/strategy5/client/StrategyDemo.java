package com.example.designpattern.utaha.strategy5.client;

import com.utaha.strategy5.MessageNotifier;
import com.utaha.strategy5.impl.AppMessageNotifier;
import com.utaha.strategy5.impl.SMSMessageNotifier;
import com.utaha.strategy5.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class StrategyDemo {

    //@Resource
    //实际会用注解自动注入
    private List<MessageNotifier> messageNotifiers;

    public void notifyMessage(User user, String content, int notifyType) {
        for (MessageNotifier messageNotifier : messageNotifiers) {
            if (messageNotifier.support(notifyType)) {
                messageNotifier.notify(user, content);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<MessageNotifier> list = new ArrayList<>();
        list.add(new SMSMessageNotifier());
        list.add(new AppMessageNotifier());
        StrategyDemo strategyDemo = new StrategyDemo();
        strategyDemo.setMessageNotifiers(list);
        User user = new User();
        user.setName("Utaha");
        //发送内容Message
        strategyDemo.notifyMessage(user , "发送内容" , 1);
        //控制台：Utaha发送了app通知发送内容
    }
    /**
     * 使用策略默认，就把下面“if else判断” 变得可拓展了
     * public void notifyMessage(User user, String content, int notifyType) {
     *             if (notifyType == 0) {
     *                 //调用短信通知的api发送短信
     *             } else if (notifyType == 1) {
     *                 //调用app通知的api发送消息
     *             }
     *         }
     */
    public List<MessageNotifier> getMessageNotifiers() {
        return messageNotifiers;
    }

    public void setMessageNotifiers(List<MessageNotifier> messageNotifiers) {
        this.messageNotifiers = messageNotifiers;
    }
}
