package com.example.xweather_v2.base;

import android.app.Application;

import com.example.xweather_v2.db.DatabaseManager;

import org.xutils.x;

public class UniteApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        DatabaseManager.initDB(this);
    }
}
