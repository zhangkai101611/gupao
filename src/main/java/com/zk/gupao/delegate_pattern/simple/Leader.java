package com.zk.gupao.delegate_pattern.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-03 21:24
 **/
public class Leader implements IEmployee{
    private Map<String,IEmployee> targets = new HashMap<String,IEmployee>();
    public Leader() {
        targets.put("加密",new EmployeeA());
        targets.put("架构",new EmployeeB());
    }

    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
