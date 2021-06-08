package com.jeng.tool.hutool.crypto;

import cn.hutool.crypto.symmetric.AES;

public class Test {

    public static void main(String[] args) {
        String content="13588912354";
        byte[] key = new byte[16];
        System.arraycopy("yinpai".getBytes(),0, key,0,"yinpai".getBytes().length);

        AES aes = new AES("CBC", "PKCS5Padding",
                // 密钥，可以自定义
                key,
                // iv加盐，按照实际需求添加
                key);
        // 加密为16进制表
        String encryptHex = aes.encryptHex(content);
        // 解密
        String decryptStr = aes.decryptStr(encryptHex);


        System.out.println(encryptHex);
        System.out.println(decryptStr);

        String decryptStr2 = aes.decryptStr("EDBF3CF6C24C87C4FCA200F0768AF455");
        System.out.println(decryptStr2);


    }

    private static void testThread(AES aes, byte[] key) {
        Runnable runnable = ()-> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(String.format("%s: Start", Thread.currentThread().getName()));
            for (int i = 0; i < 10000; i++) {
            String content = "content_" + i;
            String encryptHex = aes.encryptHex(content);
            String decryptStr = aes.decryptStr(encryptHex);
            if (!content.equals(decryptStr)) {
                System.out.println(String.format("%s: %s, %s, %s", Thread.currentThread().getName(), content, encryptHex, decryptStr));
            }
        }};
        new Thread(runnable, "thread-1").start();

        new Thread(runnable, "thread-2").start();


    }
}
