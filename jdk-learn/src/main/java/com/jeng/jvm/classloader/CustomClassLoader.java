package com.jeng.jvm.classloader;

import java.io.*;

public class CustomClassLoader extends ClassLoader {

    private String jarFilePath;

    public CustomClassLoader(String jarFilePath) throws IOException {
        this.jarFilePath = jarFilePath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File file = new File(jarFilePath ,name.replaceAll("\\.","/").concat(".class"));
        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int b=0;
            while ((b = fis.read()) != 0) {
                bos.write(b);
            }
            byte[] bytes = bos.toByteArray();
            bos.close();
            fis.close();
            return defineClass(name, bytes, 0, bytes.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.findClass(name);
    }
}
