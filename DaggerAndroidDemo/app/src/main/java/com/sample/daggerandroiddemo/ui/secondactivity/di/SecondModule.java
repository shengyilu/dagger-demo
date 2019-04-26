package com.sample.daggerandroiddemo.ui.secondactivity.di;

import android.content.Context;

import com.sample.daggerandroiddemo.R;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SecondModule {

    @Provides
    @Named("second")
    String providerTestStringForSecondActivity(Context context) {
        return context.getResources().getString(R.string.injection_string_second);
    }

}
