package com.zk.gupao.factory_pattern.abstractFactory;

import com.zk.gupao.factory_pattern.simpleFactory.Shape;

/**
 * @program: gupao_pattern_mode
 * @description:顶层抽象类
 * @author: zk
 * @create: 2019-03-11 22:10
 **/
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
