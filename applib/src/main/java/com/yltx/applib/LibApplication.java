package com.yltx.applib;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

public class LibApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
    }
}