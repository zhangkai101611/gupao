package com.zk.gupao.singleton_pattern;

import com.zk.gupao.singleton_pattern.lazy.LazyInnerClassSingleton;

import java.lang.reflect.Constructor;

public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {
        Class<?> clazz=LazyInnerClassSingleton.class;
        try {
            Constructor c=clazz.getDeclaredConstructor();
            c.setAccessible(true);
            Object o1= c.newInstance();
            Object o2= LazyInnerClassSingleton.getInstance();
            System.out.println(o1==o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
//        LazyInnerClassSingleton lazyInnerClassSingleton=LazyInnerClassSingleton.getInstance();
//        System.out.println(lazyInnerClassSingleton);
    }

}