package com.example.daggerex10;

import android.app.Application;

public class DaggerApp extends Application {
    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    AppComponent getComponent(){
        return component;
    }
}
