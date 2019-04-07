package com.zk.gupao.decorator_pattern.battercake;

public class BattercakeDecoratorTest {
    public static void main(String[] args) {
        Battercake battercake;
        battercake =new BaseBattercake();
        battercake =new EggDecorator(battercake);

        battercake =new SausageDecorator(battercake);

        System.out.println(battercake.getMsg()+"总价为："+battercake.getPrice());

    }

}