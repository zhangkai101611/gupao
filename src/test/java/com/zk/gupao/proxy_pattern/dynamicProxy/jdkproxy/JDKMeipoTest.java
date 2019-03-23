package com.zk.gupao.proxy_pattern.dynamicProxy.jdkproxy;

import com.zk.gupao.proxy_pattern.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

public class JDKMeipoTest {

    public static void main(String[] args) {
        Object obj = new JDKMeipo().getInstance(new Girl());
        try {
            Method method=obj.getClass().getMethod("findLove",null);
            method.invoke(obj);

            byte [] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("D://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}