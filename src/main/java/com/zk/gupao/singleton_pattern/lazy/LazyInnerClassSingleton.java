package com.zk.gupao.singleton_pattern.lazy;

/**
 * @program: gupao_pattern_mode
 * @description:内部类单例
 * @author: zk
 * @create: 2019-03-14 23:16
 **/
//未使用 synchronized 关键字，效率较高,使用的是jvm的类加载的属性
//通过反射获取对象时，破坏了单例
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if(LazyHold.LAZY!=null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }
    //等到外部方法调用时才执行，应用了内部类的特征
    public  static final LazyInnerClassSingleton getInstance(){
        return LazyHold.LAZY;
    }
   private  static class LazyHold{
        private static final LazyInnerClassSingleton LAZY=new LazyInnerClassSingleton();
   }
}
