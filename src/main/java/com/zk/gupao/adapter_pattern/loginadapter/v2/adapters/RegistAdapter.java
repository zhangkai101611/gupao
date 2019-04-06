package com.zk.gupao.adapter_pattern.loginadapter.v2.adapters;

import com.zk.gupao.adapter_pattern.loginadapter.ResultMsg;

/**
 * Created by Tom on 2019/3/16.
 */
public interface RegistAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
