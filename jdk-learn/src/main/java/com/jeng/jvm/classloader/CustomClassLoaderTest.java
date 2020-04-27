package com.jeng.jvm.classloader;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;

public class CustomClassLoaderTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, MalformedURLException {
        //jar:file:///opt/classloader-test.jar!/
        CustomClassLoader2 customClassLoader = new CustomClassLoader2("jar:file:///e/work/jar/jeng-lc-1.0.jar!/",Thread.currentThread().getContextClassLoader());
//        Class<?> customClass = customClassLoader.loadClass("com.jeng.jvm.classloader.CustomClass");
        Class<?> customClass = customClassLoader.loadClass("CustomClass");
        Object customObj = customClass.newInstance();
        Method myMethod = customClass.getMethod("myMethod", String.class);
        myMethod.invoke(customObj, "hello");

    }
}
