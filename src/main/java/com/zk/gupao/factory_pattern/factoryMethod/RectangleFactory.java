package com.zk.gupao.factory_pattern.factoryMethod;

import com.zk.gupao.factory_pattern.simpleFactory.Rectangle;
import com.zk.gupao.factory_pattern.simpleFactory.Shape;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-03-11 21:50
 **/
public class RectangleFactory implements IShapeFactory {
    public Shape create() {
        return new Rectangle();
//        ILoggerFactory
    }
}
