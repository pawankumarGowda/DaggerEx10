package com.example.daggerex10;

import javax.inject.Singleton;

import dagger.Component;

@Component (modules = DriverModule.class)
@Singleton
public interface AppComponent {
    //factory method
    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);

}
