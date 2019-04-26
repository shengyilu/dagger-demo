package com.sample.daggerandroiddemo;


import com.sample.daggerandroiddemo.di.AppComponent;
import com.sample.daggerandroiddemo.di.DaggerAppComponent;


import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MainApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }
}
