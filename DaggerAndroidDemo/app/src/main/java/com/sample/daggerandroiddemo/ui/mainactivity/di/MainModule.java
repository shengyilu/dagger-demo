package com.sample.daggerandroiddemo.ui.mainactivity.di;

import android.content.Context;

import com.sample.daggerandroiddemo.R;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {

    @Provides
    @Named("main")
    String providerTestStringForMainActivity(Context context) {
        return context.getResources().getString(R.string.injection_string_main);
    }


}
