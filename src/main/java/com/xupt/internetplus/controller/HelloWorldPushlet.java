package com.xupt.internetplus.controller;

import nl.justobjects.pushlet.core.Event;
import nl.justobjects.pushlet.core.EventPullSource;

/**
 * Created by 张涛 on 2017/4/15.
 */
public class HelloWorldPushlet {
    static public class HwPlushlet extends EventPullSource {

        private static Integer count = 1;

        // 休眠五秒
        @Override
        protected long getSleepTime() {
            return 1000;
        }

        @Override
        protected Event pullEvent() {
            if(count>8){
                count = 1;
            }
            String pre = "/img/a";
            String suf = ".jpg";
            String path = pre+count+suf;
            Event event = Event.createDataEvent("/picture/change");
            event.setField("path", path);
            count++;
            return event;
        }
    }
}
