package com.zk.gupao.proxy_pattern.staticProxy;

public class FatherTest {
    public static void main(String[] args) {
        Father father=new Father(new Son());
        father.findLove();
    }

}