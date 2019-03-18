package com.zk.gupao.Prototype_pattern.simple;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-03-18 22:01
 **/
public class Client {
    public Prototype startClone(Prototype prototype) {
        return prototype.clone();
    }
}
