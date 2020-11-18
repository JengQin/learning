package com.jeng.design.pattern.creational.builder;

import com.google.common.base.Strings;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResourcePoolConfig {
    private String name;
    private int maxTotal;
    private int maxIdle;
    private int minIdle;

    private ResourcePoolConfig(Builder builder) {
        this.name = builder.name;
        this.maxTotal = builder.maxTotal;
        this.maxIdle = builder.maxIdle;
        this.minIdle = builder.minIdle;
    }


    public static class Builder{
        private static final int default_max_total = 8;
        private static final int default_max_idle = 8;
        private static final int default_min_idle = 0;

        private String name;
        private int maxTotal;
        private int maxIdle;
        private int minIdle;

        public ResourcePoolConfig build(){
            // 进行参数校验
            if (Strings.isNullOrEmpty(name)) {
                throw new IllegalArgumentException("name is not set");
            }
            if (maxTotal <= 0) {
                throw new IllegalArgumentException("maxTotal is not set");
            }
            if (maxIdle > maxTotal) {
                throw new IllegalArgumentException("maxIdle can not greater then maxTotal");
            }
            if (minIdle > maxIdle) {
                throw new IllegalArgumentException("minIdle can not greater then maxIdle");
            }

            // 创建对象
            return new ResourcePoolConfig(this);
        }

        public Builder setName(String name) {
            if (Strings.isNullOrEmpty(name)) {
                throw new IllegalArgumentException("name can not be null");
            }
            this.name = name;
            return this;
        }

        public Builder setMaxTotal(int maxTotal) {
            if (maxTotal < 0) {
                throw new IllegalArgumentException("maxTotal can not less then 0");
            }
            this.maxTotal = maxTotal;
            return this;
        }

        public Builder setMaxIdle(int maxIdle) {
            if (maxIdle < 0) {
                throw new IllegalArgumentException("maxIdle can not less then 0");
            }
            this.maxIdle = maxIdle;
            return this;
        }

        public Builder setMinIdle(int minIdle) {
            if (minIdle < 0) {
                throw new IllegalArgumentException("minIdle can not less then 0");
            }
            this.minIdle = minIdle;
            return this;
        }
    }
}
