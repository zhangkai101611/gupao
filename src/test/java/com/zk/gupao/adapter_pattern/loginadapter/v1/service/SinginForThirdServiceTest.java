package com.zk.gupao.adapter_pattern.loginadapter.v1.service;

public class SinginForThirdServiceTest {
    public static void main(String[] args) {
        SinginForThirdService service = new SinginForThirdService();
        service.login("tom","123456");
        service.loginForQQ("sdfasdfasf");
        service.loginForWechat("sdfasfsa");
    }
}