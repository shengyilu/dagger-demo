package com.sample.daggerandroiddemo.di;

import android.app.Application;
import android.content.Context;

import com.sample.daggerandroiddemo.R;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    Context provideContext(Application application) {
        return application;
    }

    @Provides
    @Named("global")
    String providerTestStringGlobal(Context context) {
        return context.getResources().getString(R.string.injection_string_global);
    }
}
