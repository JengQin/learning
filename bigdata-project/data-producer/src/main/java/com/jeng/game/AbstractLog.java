package com.jeng.game;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * The AbstractLog
 *
 * @author JiaZheng
 * @create 2020-05-17 17:31
 */
public class AbstractLog {
    @JSONField(name = "device_id")
    private String deviceId;
    @JSONField(name = "server_ts")
    private String serverTs;
    @JSONField(name = "game_id")
    private String gameId;
    @JSONField(name = "channel_id")
    private String channelId;
    @JSONField(name = "game_channel_id")
    private String gameChannelId;
    @JSONField(name = "client_ip")
    private String clientIP;
    @JSONField(name = "event")
    private String event;

    public AbstractLog() {
    }

    public AbstractLog(String deviceId, String serverTs, String gameId, String channelId, String gameChannelId, String clientIP, String event) {
        this.deviceId = deviceId;
        this.serverTs = serverTs;
        this.gameId = gameId;
        this.channelId = channelId;
        this.gameChannelId = gameChannelId;
        this.clientIP = clientIP;
        this.event = event;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getServerTs() {
        return serverTs;
    }

    public void setServerTs(String serverTs) {
        this.serverTs = serverTs;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    public String getGameChannelId() {
        return gameChannelId;
    }

    public void setGameChannelId(String gameChannelId) {
        this.gameChannelId = gameChannelId;
    }

    public String getClientIP() {
        return clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
}
