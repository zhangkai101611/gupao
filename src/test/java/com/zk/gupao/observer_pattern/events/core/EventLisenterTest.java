package com.zk.gupao.observer_pattern.events.core;

import com.zk.gupao.observer_pattern.events.mouseevent.Mouse;
import com.zk.gupao.observer_pattern.events.mouseevent.MouseEventCallback;
import com.zk.gupao.observer_pattern.events.mouseevent.MouseEventType;

public class EventLisenterTest {
    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        //@谁？  @回调方法
        mouse.addLisenter(MouseEventType.ON_CLICK,callback);
        mouse.addLisenter(MouseEventType.ON_FOCUS,callback);

        mouse.click();

        mouse.focus();
    }
}