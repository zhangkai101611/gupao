package com.zk.gupao.factory_pattern.simpleFactory;

import org.junit.Test;

public class ShapeFactoryTest {

    @Test
    public void getShape(){
        ShapeFactory sf=new ShapeFactory();
        Rectangle r=(Rectangle)sf.getShape("RECTANGLE");
        r.draw();
    }
}