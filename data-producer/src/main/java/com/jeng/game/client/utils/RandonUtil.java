package com.jeng.game.client.utils;

import java.util.concurrent.ThreadLocalRandom;

/**
 * The RandonUtil
 *
 * @author JiaZheng
 * @create 2020-05-17 16:11
 */
public class RandonUtil {

    public static int randonInt(int bound) {
        return ThreadLocalRandom.current().nextInt(bound);
    }

}
