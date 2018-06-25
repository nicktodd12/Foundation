package com.example.nicholas.foundation.application;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Nicholas on 6/24/2018.
 */
@Singleton
@Component(
        modules = {AndroidSupportInjectionModule.class, AppModule.class, ActivityAndFragmentModule.class}
)
interface AppComponent extends AndroidInjector<FoundationApplication> {
    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<FoundationApplication> {
    }
}
