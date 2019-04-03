package com.zk.gupao.delegate_pattern.simple;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-03 21:24
 **/
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
