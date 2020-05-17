package com.jeng.game.client.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * The GameDataConstant
 *
 * @author JiaZheng
 * @create 2020-05-17 16:09
 */
public class GameDataConstant {
    static final List<String> deviceList = new ArrayList<>(1000);
    static final List<String> gameList = new ArrayList<>(20);
    static final List<String> channelList = new ArrayList<>(30);
    static final List<String> gameChannelList = new ArrayList<>(100);
    static final List<String> userList = new ArrayList<>(1000);
    static final List<String> ipList = new ArrayList<>(1000);

    static {
        for (int i = 1; i <= 1000; i++) {
            deviceList.add("d_" + String.format("%04d", i));
        }
        for (int i = 1; i <= 20; i++) {
            gameList.add("" + i);
        }
        for (int i = 1; i <= 30; i++) {
            channelList.add("" + i);
        }
        for (int i = 101; i <= 200; i++) {
            gameChannelList.add("" + i);
        }
        for (int i = 1; i <= 1000; i++) {
            userList.add("u_" + String.format("%04d", i));
        }
        for (int i = 1; i <= 1000; i++) {
            ipList.add(RandonUtil.randonInt(255) + "." + RandonUtil.randonInt(255) + "." + RandonUtil.randonInt(255) + "." + RandonUtil.randonInt(255));
        }
    }

    public static String getRandonDevice() {
        return deviceList.get(RandonUtil.randonInt(deviceList.size()));
    }

    public static String getDeviceByIndex(int index) {
        return deviceList.get(index);
    }

    public static String getRandonGame() {
        return gameList.get(RandonUtil.randonInt(gameList.size()));
    }

    public static String getGameByIndex(int index) {
        return gameList.get(index);
    }

    public static String getRandonChannel() {
        return channelList.get(RandonUtil.randonInt(channelList.size()));
    }

    public static String getChannelByIndex(int index) {
        return channelList.get(index);
    }

    public static String getRandonGameChannel() {
        return gameChannelList.get(RandonUtil.randonInt(gameChannelList.size()));
    }

    public static String getGameChannelByIndex(int index) {
        return gameChannelList.get(index);
    }

    public static String getRandonUser() {
        return userList.get(RandonUtil.randonInt(userList.size()));
    }

    public static String getUserByIndex(int index) {
        return userList.get(index);
    }

    public static String getRandonIp() {
        return ipList.get(RandonUtil.randonInt(ipList.size()));
    }

    public static String getIpByIndex(int index) {
        return ipList.get(index);
    }
}
