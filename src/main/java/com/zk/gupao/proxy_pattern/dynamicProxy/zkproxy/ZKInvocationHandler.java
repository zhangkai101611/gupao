package com.zk.gupao.proxy_pattern.dynamicProxy.zkproxy;

import java.lang.reflect.Method;

/**
 * @program: gupao_pattern_mode
 * @description: 手写的handler
 * @author: zk
 * @create: 2019-03-23 15:31
 **/
public interface ZKInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
