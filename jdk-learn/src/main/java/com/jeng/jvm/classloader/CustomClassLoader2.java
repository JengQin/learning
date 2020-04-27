package com.jeng.jvm.classloader;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class CustomClassLoader2 extends URLClassLoader {


    public CustomClassLoader2(String path, ClassLoader parent) throws MalformedURLException {
        super(new URL[]{new URL(path)}, parent);
    }
}
