package com.zk.gupao.proxy_pattern.cglibproxy;

import com.zk.gupao.proxy_pattern.dynamicProxy.jdkproxy.Girl;

public class CGlibMeipoTest {
    public static void main(String[] args) {
        Girl obj = null;
        try {
            obj = (Girl) new CGlibMeipo().getInstance(Girl.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(obj);
        obj.findLove();
    }
}