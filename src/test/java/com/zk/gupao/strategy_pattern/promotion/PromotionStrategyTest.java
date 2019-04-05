package com.zk.gupao.strategy_pattern.promotion;

public class PromotionStrategyTest {
    public static void main(String[] args) {
        String promotionKey="GROUPBUY";
        PromotionActivity promotionActivity=new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }

}