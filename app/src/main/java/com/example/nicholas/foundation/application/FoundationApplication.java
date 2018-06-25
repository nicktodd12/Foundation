package com.example.nicholas.foundation.application;

import android.content.Context;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;


/**
 * Created by Nicholas on 6/24/2018.
 */

public class FoundationApplication extends DaggerApplication {

    private static Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = this.getApplicationContext();
    }

    @Override
    public AndroidInjector<FoundationApplication> applicationInjector() {
        return DaggerAppComponent.builder().create(this);
    }

    public static Context getApplicationContextInstance() {
        return applicationContext;
    }
}
