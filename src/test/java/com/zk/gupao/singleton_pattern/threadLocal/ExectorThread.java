package com.zk.gupao.singleton_pattern.threadLocal;

import com.zk.gupao.singleton_pattern.lazy.LazySingleton;

/**
 * Created by Tom.
 */
public class ExectorThread implements Runnable{
    public void run() {
        LazySingleton singleton = LazySingleton.getInstance();
//        ThreadLocalSingleton singleton = ThreadLocalSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }
}
