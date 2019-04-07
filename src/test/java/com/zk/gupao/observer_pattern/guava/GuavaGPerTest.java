package com.zk.gupao.observer_pattern.guava;

import com.google.common.eventbus.EventBus;
import com.zk.gupao.observer_pattern.gperadvice.Question;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-07 16:03
 **/
public class GuavaGPerTest {
    public static void main(String[] args) {
        Question question = new Question();
        question.setUserName("zk");
        question.setContent("asdaasd");
        Teacher tom = new Teacher("tom");

        EventBus bus = new EventBus();
        bus.register(tom);
        bus.post(question);
    }
}
