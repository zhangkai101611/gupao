package com.zk.gupao.delegate_pattern.simple;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-03 21:25
 **/
public class EmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我擅长加密，现在开始工作！");
    }
}
