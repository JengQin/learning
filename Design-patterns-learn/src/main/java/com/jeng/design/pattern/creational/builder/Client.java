package com.jeng.design.pattern.creational.builder;

public class Client {

    public static void main(String[] args) {
        ResourcePoolConfig.Builder builder = new ResourcePoolConfig.Builder();
        builder.setName("ConnectPoolConfig")
                .setMaxTotal(10)
                .setMaxIdle(10)
                .setMinIdle(0);
        ResourcePoolConfig config = builder.build();
        System.out.println(config);
    }
}
