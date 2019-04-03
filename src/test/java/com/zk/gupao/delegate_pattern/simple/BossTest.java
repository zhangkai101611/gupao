package com.zk.gupao.delegate_pattern.simple;

public class BossTest {
    public static void main(String[] args) {
        new Boss().command("加密",new Leader());
    }
}