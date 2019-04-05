package com.zk.gupao.strategy_pattern.pay.payport;


import com.zk.gupao.strategy_pattern.pay.MsgResult;
import com.zk.gupao.strategy_pattern.pay.Order;

public class PayStrategyTest {
    public static void main(String[] args) {
        Order order=new Order("1","20123813",120);

        MsgResult msgResult=order.pay(PayStrategy.PromotionKey.UNIONPAY);
        System.out.println(msgResult);
    }

}