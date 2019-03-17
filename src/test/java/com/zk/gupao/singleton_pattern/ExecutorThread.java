package com.zk.gupao.singleton_pattern;

import com.zk.gupao.singleton_pattern.lazy.LazyDoubleCheckSingleton;

/**
 * @program: gupao_pattern_mode
 * @description:测试懒汉式单例的线程不安全
 * @author: zk
 * @create: 2019-03-14 22:33
 **/
public class ExecutorThread implements Runnable {
    public void run() {
        LazyDoubleCheckSingleton singleton=LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}
