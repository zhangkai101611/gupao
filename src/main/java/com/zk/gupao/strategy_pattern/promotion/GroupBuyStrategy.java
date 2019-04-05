package com.zk.gupao.strategy_pattern.promotion;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-05 15:58
 **/
public class GroupBuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("团购优惠策略");
    }
}
