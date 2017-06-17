package com.figengungor.helloworldhockeyapp;

import android.app.Application;

import net.hockeyapp.android.CrashManager;

/**
 * Created by figengungor on 6/17/2017.
 */

public class CustomApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashManager.register(this);
    }
}
