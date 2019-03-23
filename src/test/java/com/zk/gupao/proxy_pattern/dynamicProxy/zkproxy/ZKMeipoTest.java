package com.zk.gupao.proxy_pattern.dynamicProxy.zkproxy;

import com.zk.gupao.proxy_pattern.Person;
import com.zk.gupao.proxy_pattern.dynamicProxy.jdkproxy.Girl;

public class ZKMeipoTest {
    public static void main(String[] args) {
        try {

            //JDK动态代理的实现原理
            Person obj = (Person) new ZKMeipo().getInstance(new Girl());
            System.out.println(obj.getClass());
            obj.findLove();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}