package com.example.daggerex10;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {

    private static final String TAG = "DieselEngine";
    private int horsePower;
    private int engineCapacity;

    @Inject
    public DieselEngine(int horsePower,int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "DieselEngine started .... HorsePower:"+horsePower);
    }
}
