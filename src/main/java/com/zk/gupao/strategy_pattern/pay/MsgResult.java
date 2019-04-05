package com.zk.gupao.strategy_pattern.pay;

/**
 * @program: gupao_pattern_mode
 * @description:
 * @author: zk
 * @create: 2019-04-05 16:20
 **/
public class MsgResult {

    private int code;
    private String msg;
    private Object data;

    public MsgResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "支付状态：[" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                ']';
    }
}
