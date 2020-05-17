package com.jeng.game.client.utils;

import com.jeng.game.ActiveLog;
import com.jeng.game.LoginLog;
import com.jeng.game.OrderLog;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * The Generator
 *
 * @author JiaZheng
 * @create 2020-05-17 16:44
 */
public class Generator {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmSS");

    public ActiveLog createAcitveLog(){
        ActiveLog activeLog = new ActiveLog();
        activeLog.setDeviceId(GameDataConstant.getRandonDevice());
        activeLog.setClientIP(GameDataConstant.getRandonIp());
        activeLog.setGameId(GameDataConstant.getRandonGame());
        activeLog.setChannelId(GameDataConstant.getRandonChannel());
        activeLog.setGameChannelId(GameDataConstant.getRandonGameChannel());
        activeLog.setServerTs(System.currentTimeMillis() + "");
        activeLog.setEvent(LogType.ACTIVE);

        return activeLog;
    }

    public LoginLog createLoginLog(){
        LoginLog loginLog = new LoginLog();
        loginLog.setDeviceId(GameDataConstant.getRandonDevice());
        loginLog.setClientIP(GameDataConstant.getRandonIp());
        loginLog.setGameId(GameDataConstant.getRandonGame());
        loginLog.setChannelId(GameDataConstant.getRandonChannel());
        loginLog.setGameChannelId(GameDataConstant.getRandonGameChannel());
        loginLog.setServerTs(System.currentTimeMillis() + "");
        loginLog.setUserId(GameDataConstant.getRandonUser());
        loginLog.setEvent(LogType.LOGIN);
        return loginLog;
    }
    public LoginLog createLoginLog(ActiveLog activeLog){
        LoginLog loginLog = new LoginLog();
        loginLog.setDeviceId(activeLog.getDeviceId());
        loginLog.setClientIP(activeLog.getClientIP());
        loginLog.setGameId(activeLog.getGameId());
        loginLog.setChannelId(activeLog.getChannelId());
        loginLog.setGameChannelId(activeLog.getGameChannelId());
        loginLog.setServerTs(Long.valueOf(activeLog.getServerTs())+1000 + "");

        loginLog.setUserId(GameDataConstant.getRandonUser());
        loginLog.setEvent(LogType.LOGIN);
        return loginLog;
    }

    public OrderLog createOrderLog(){
        OrderLog orderLog = new OrderLog();
        orderLog.setDeviceId(GameDataConstant.getRandonDevice());
        orderLog.setClientIP(GameDataConstant.getRandonIp());
        orderLog.setGameId(GameDataConstant.getRandonGame());
        orderLog.setChannelId(GameDataConstant.getRandonChannel());
        orderLog.setGameChannelId(GameDataConstant.getRandonGameChannel());
        orderLog.setServerTs(System.currentTimeMillis() + "");
        orderLog.setUserId(GameDataConstant.getRandonUser());
        orderLog.setOrderSn(createOrderSn());
        orderLog.setMoney(RandonUtil.randonInt(100));

        orderLog.setEvent(LogType.ORDER);
        return orderLog;
    }

    public OrderLog createOrderLog(LoginLog loginLog){
        OrderLog orderLog = new OrderLog();
        orderLog.setDeviceId(loginLog.getDeviceId());
        orderLog.setClientIP(loginLog.getClientIP());
        orderLog.setGameId(loginLog.getGameId());
        orderLog.setChannelId(loginLog.getChannelId());
        orderLog.setGameChannelId(loginLog.getGameChannelId());
        orderLog.setServerTs(Long.valueOf(loginLog.getServerTs())+1000 + "");
        orderLog.setUserId(loginLog.getUserId());

        orderLog.setOrderSn(createOrderSn());
        orderLog.setMoney(RandonUtil.randonInt(10000));
        orderLog.setEvent(LogType.ORDER);
        return orderLog;
    }

    public String createOrderSn(){
        String format = formatter.format(ZonedDateTime.now());
        return format+String.format("%04d",RandonUtil.randonInt(1000));
    }

//    public static void main(String[] args) {
//        Generator generator = new Generator();
//        System.out.println(generator.createOrderSn());
//    }
}
