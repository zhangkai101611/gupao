package com.zk.gupao.proxy_pattern.dynamicProxy.jdkproxy;

import com.zk.gupao.proxy_pattern.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-03-23 15:21
 **/
public class JDKMeipo implements InvocationHandler {
    private Object target;
    public Object getInstance(Object target){
        this.target=target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj= method.invoke(this.target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    private void after(){
        System.out.println("OK的话，准备办事");
    }
}
