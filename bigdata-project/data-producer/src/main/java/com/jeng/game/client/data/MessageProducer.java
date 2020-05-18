package com.jeng.game.client.data;

import com.alibaba.fastjson.JSON;
import com.jeng.game.ActiveLog;
import com.jeng.game.LoginLog;
import com.jeng.game.OrderLog;
import com.jeng.game.client.utils.Generator;
import com.jeng.game.client.utils.LogType;
import com.jeng.game.client.utils.RandonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * The MessageProducer
 *
 * @author JiaZheng
 * @create 2020-05-17 18:51
 */
public class MessageProducer implements Callable<Boolean> {
    private static final Logger LOGGER = LoggerFactory.getLogger(MessageProducer.class);
    private BlockingQueue<String> msgQueue;
    private volatile boolean isTerminated = false;
    private String logType;
    private int count;
    private long interval;
    private Generator generator;

    public MessageProducer(BlockingQueue<String> msgQueue, String logType, int count, long interval) {
        this.msgQueue = msgQueue;
        this.logType = logType;
        this.count = count;
        this.interval = interval;
        this.generator = new Generator();
    }

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Boolean call() throws Exception {
        try {
            switch (logType) {
                case LogType
                        .ALL:
                    doAll();
                    break;
                case LogType
                        .LOGIN_AND_ORDER:
                    doLoginAndOrder();
                    break;
                case LogType.ACTIVE: // active log
                    for (int i = 0; i < count; i++) {
                        ActiveLog acitveLog = generator.createAcitveLog();
                        msgQueue.put(JSON.toJSONString(acitveLog));
                        TimeUnit.MILLISECONDS.sleep(interval);
                    }
                    break;
                case LogType.LOGIN: // login log
                    for (int i = 0; i < count; i++) {
                        LoginLog loginLog = generator.createLoginLog();
                        msgQueue.put(JSON.toJSONString(loginLog));
                        TimeUnit.MILLISECONDS.sleep(interval);
                    }
                    break;
                case LogType.ORDER: //order log
                    for (int i = 0; i < count; i++) {
                        OrderLog orderLog = generator.createOrderLog();
                        msgQueue.put(JSON.toJSONString(orderLog));
                        TimeUnit.MILLISECONDS.sleep(interval);
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Can not match the log_type: " + logType);
            }
        } catch (IllegalArgumentException | InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.isTerminated = true;
            LOGGER.info("Message produce thread finish.");
        }
        return this.isTerminated;
    }

    private void doLoginAndOrder() throws InterruptedException {
        for (int i = 0; i < count; i++) {
            LoginLog loginLog = generator.createLoginLog();
            msgQueue.put(JSON.toJSONString(loginLog));

            if (RandonUtil.randonInt(count) % 5 == 0) {
                OrderLog orderLog = generator.createOrderLog(loginLog);
                msgQueue.put(JSON.toJSONString(orderLog));
            }

            TimeUnit.MILLISECONDS.sleep(interval);
        }
    }

    private void doAll() throws InterruptedException {
        for (int i = 0; i < count; i+=3) {
            ActiveLog activeLog = generator.createAcitveLog();
            msgQueue.put(JSON.toJSONString(activeLog));

            LoginLog loginLog = generator.createLoginLog(activeLog);
            msgQueue.put(JSON.toJSONString(loginLog));

            OrderLog orderLog = generator.createOrderLog(loginLog);
            msgQueue.put(JSON.toJSONString(orderLog));
        }

        TimeUnit.MILLISECONDS.sleep(interval);

}

    public boolean isTerminated() {
        return isTerminated;
    }

    public void setTerminated(boolean terminated) {
        isTerminated = terminated;
    }

}
