package com.example.xweather_v2.Base;

import android.app.Application;
import org.xutils.x;

public class UniteApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
//        DBManager.initDB(this);
    }
}
