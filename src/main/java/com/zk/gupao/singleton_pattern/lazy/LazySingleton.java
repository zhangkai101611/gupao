package com.zk.gupao.singleton_pattern.lazy;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-03-14 22:29
 **/
public class LazySingleton {
    private static LazySingleton lazySingleton=null;
    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton =new LazySingleton();
        }
        System.out.println(lazySingleton);
        return lazySingleton;
    }
}
