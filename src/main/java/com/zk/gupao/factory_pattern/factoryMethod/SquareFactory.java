package com.zk.gupao.factory_pattern.factoryMethod;

import com.zk.gupao.factory_pattern.simpleFactory.Shape;
import com.zk.gupao.factory_pattern.simpleFactory.Square;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-03-11 21:52
 **/
public class SquareFactory implements IShapeFactory {
    public Shape create() {
        return new Square();
    }
}
