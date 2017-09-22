package com.yltx.apparr;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 功能描述:
 * Created by ixzus on 2017/9/22.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.openLog();     // 打印日志
        ARouter.openDebug();
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
    }
}
