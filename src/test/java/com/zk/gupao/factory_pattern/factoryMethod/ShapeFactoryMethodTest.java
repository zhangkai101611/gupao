package com.zk.gupao.factory_pattern.factoryMethod;

import com.zk.gupao.factory_pattern.simpleFactory.Shape;
import org.junit.Test;

public class ShapeFactoryMethodTest {
    @Test
    public void getShape(){
        IShapeFactory sf=new RectangleFactory();
        Shape r=sf.create();
//      Rectangle r=(Rectangle)sf.create();
        r.draw();
    }
}