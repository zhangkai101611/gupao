package com.zk.gupao.factory_pattern.simpleFactory;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-03-11 21:29
 **/
public class ShapeFactory {
    //违背开闭原则
    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }

//    public Shape create(Class clazz) {
//        try {
//            if (null != clazz) {
//                return (Shape) clazz.newInstance();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
}
