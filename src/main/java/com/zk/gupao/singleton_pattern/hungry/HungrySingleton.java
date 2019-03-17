package com.zk.gupao.singleton_pattern.hungry;

/**
 * @program: gupao_pattern_mode
 * @description: 饿汉式单例
 * @author: zk
 * @create: 2019-03-14 21:24
 **/
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton ;
    static{
        hungrySingleton =new HungrySingleton();
    }
    //构造器私有化
    private HungrySingleton(){}
    //全局访问点
    public  static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}

//缺点：类加载的时候就要创建对象，浪费内存空间
