package com.zk.gupao.delegate_pattern.simple;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-03 21:25
 **/
public class EmployeeB implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我擅长架构，现在开始架构设计！");
    }
}
