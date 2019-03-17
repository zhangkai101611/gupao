package com.zk.gupao.singleton_pattern.lazy;

/**
 * @program: gupao_pattern_mode
 * @description:双重检查锁
 * @author: zk
 * @create: 2019-03-14 22:51
 **/
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton=null;//volatile 解决指令重排序的问题 参考资料：https://www.cnblogs.com/NaLanZiYi-LinEr/p/7492571.html
    private LazyDoubleCheckSingleton(){}

    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton==null){//若不加此行代码，很有可能出现new两次对象的情况，后一次会覆盖之前一次
                    lazyDoubleCheckSingleton =new LazyDoubleCheckSingleton();
                }
            }
        }
        System.out.println(lazyDoubleCheckSingleton);
        return lazyDoubleCheckSingleton;
    }

}
