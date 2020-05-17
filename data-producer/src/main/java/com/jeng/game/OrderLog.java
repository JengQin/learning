package com.jeng.game;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * The OrderLog
 *
 * @author JiaZheng
 * @create 2020-05-17 15:56
 */
public class OrderLog extends AbstractLog {
    @JSONField(name = "user_id")
    private String userId;
    @JSONField(name = "order_sn")
    private String orderSn;
    @JSONField(name = "money")
    private long money;

    public OrderLog() {
    }

    public OrderLog(String deviceId, String serverTs, String gameId, String channelId, String gameChannelId, String clientIP, String event, String userId, String orderSn, long money) {
        super(deviceId,serverTs,gameId,channelId,gameChannelId,clientIP,event);
        this.userId = userId;
        this.orderSn = orderSn;
        this.money = money;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }
}
