package com.sample.daggerandroiddemo.di;

import com.sample.daggerandroiddemo.ui.mainactivity.MainActivity;
import com.sample.daggerandroiddemo.ui.mainactivity.di.MainModule;
import com.sample.daggerandroiddemo.ui.secondactivity.SecondActivity;
import com.sample.daggerandroiddemo.ui.secondactivity.di.SecondModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector(modules = SecondModule.class)
    abstract SecondActivity bindSecondActivity();

}
