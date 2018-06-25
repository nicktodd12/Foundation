package com.example.nicholas.foundation.viewmodel.impl;

import com.example.nicholas.foundation.service.ServiceModule;
import com.example.nicholas.foundation.service.TypicodeService;
import com.example.nicholas.foundation.viewmodel.TypicodeViewModel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Nicholas on 6/24/2018.
 */
@Module(
        includes = {ServiceModule.class}
)
public class ViewModelModule {
    @Provides
    @Singleton
    TypicodeViewModel provideTypicodeViewModel(TypicodeService typicodeService) {
        return new TypicodeViewModelImpl(typicodeService);
    }
}
