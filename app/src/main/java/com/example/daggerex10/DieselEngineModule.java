package com.example.daggerex10;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;
    private int engineCapacity;

    public DieselEngineModule(int horsePower, int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Provides
    Engine ProvidesDieselEngine(){
        return new DieselEngine(horsePower,engineCapacity);

    }
}
