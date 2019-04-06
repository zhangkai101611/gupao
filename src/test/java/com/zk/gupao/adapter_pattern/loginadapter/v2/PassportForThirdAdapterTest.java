package com.zk.gupao.adapter_pattern.loginadapter.v2;


public class PassportForThirdAdapterTest {
    public static void main(String[] args) {

        IPassportForThird passportForThird = new PassportForThirdAdapter();

        passportForThird.loginForQQ("");

    }
}