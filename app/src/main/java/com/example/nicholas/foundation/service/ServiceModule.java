package com.example.nicholas.foundation.service;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Nicholas on 6/24/2018.
 */
@Module
public class ServiceModule {
    @Provides
    @Singleton
    TypicodeService provideTypicodeService() {
        return ServiceFactory.createService(TypicodeService.class);
    }
}
