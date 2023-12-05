package com.example.designpattern.utaha.strategy5;

import com.utaha.strategy5.pojo.User;

public interface MessageNotifier {

    /**
     * 是否支持该类型的通知的方式
     *
     * @param notifyType 0:短信 1:app
     * @return 是否支持
     */
    boolean support(int notifyType);

    /**
     * 通知
     *
     * @param user User对象
     * @param content 内容
     */
    void notify(User user, String content);

}
