package com.zk.gupao.factory_pattern.abstractFactory;

import com.zk.gupao.factory_pattern.simpleFactory.Rectangle;
import com.zk.gupao.factory_pattern.simpleFactory.Shape;
import com.zk.gupao.factory_pattern.simpleFactory.Square;
import javafx.scene.shape.Circle;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-03-11 22:12
 **/
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
       if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }

}
