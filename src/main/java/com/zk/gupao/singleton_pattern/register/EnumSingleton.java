package com.zk.gupao.singleton_pattern.register;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-03-17 21:00
 **/
public enum EnumSingleton {
    INSTANCE;
    private Object data;

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {

        return data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
