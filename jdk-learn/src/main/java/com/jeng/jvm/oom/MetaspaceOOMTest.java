package com.jeng.jvm.oom;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MetaspaceOOMTest {

    public static void main(String[] args) {
        /*
        -XX:MetaspaceSize=10M -XX:+PrintGCDetails -XX:MaxMetaspaceSize=20M
         */
        int i = 0;

        try {
            while (true) {
                i++;
                Enhancer enhancer = new Enhancer();
                enhancer.setSuperclass(MetaspaceOOMTest.class);
                enhancer.setUseCache(false);
                enhancer.setCallback(new MethodInterceptor() {
                    @Override
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        return methodProxy.invokeSuper(o,args);
                    }
                });
                enhancer.create();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("=============多少次之后发生异常：" + i);
        }
    }
}
