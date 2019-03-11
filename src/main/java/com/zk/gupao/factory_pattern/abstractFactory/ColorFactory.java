package com.zk.gupao.factory_pattern.abstractFactory;

import com.zk.gupao.factory_pattern.simpleFactory.Shape;

/**
 * @program: gupao_pattern_mode
 * @description:颜色工厂
 * @author: zk
 * @create: 2019-03-11 22:15
 **/
public class ColorFactory  extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        }  else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
