package com.zk.gupao.factory_pattern.abstractFactory;

import com.zk.gupao.factory_pattern.simpleFactory.Shape;
import org.junit.Test;


public class AbstractFactoryTest {
    @Test
    public void getProduct(){
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        //获取形状为 Circle 的对象
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        //调用 Circle 的 draw 方法
        shape1.draw();
        //获取颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        //获取颜色为 Red 的对象
        Color color1 = colorFactory.getColor("RED");
        color1.fill();
    }
}