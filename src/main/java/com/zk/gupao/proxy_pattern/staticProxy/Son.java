package com.zk.gupao.proxy_pattern.staticProxy;

import com.zk.gupao.proxy_pattern.Person;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-03-23 15:13
 **/
public class Son implements Person {
    public void findLove() {
        System.out.println("要求：肤白貌美大长腿");
    }
}
