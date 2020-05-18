package com.jeng.game;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * The LoginLog
 *
 * @author JiaZheng
 * @create 2020-05-17 15:56
 */
public class LoginLog extends AbstractLog {
    @JSONField(name = "user_id")
    private String userId;

    public LoginLog() {
    }

    public LoginLog(String deviceId, String serverTs, String gameId, String channelId, String gameChannelId, String clientIP, String event, String userId) {
        super(deviceId,serverTs,gameId,channelId,gameChannelId,clientIP,event);
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
