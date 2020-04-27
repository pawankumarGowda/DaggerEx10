package com.example.daggerex10;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PreActivity
@Subcomponent(modules = {WheelModule.class, DieselEngineModule.class})

public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    /*@Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();

    }*/
}
