package com.example.nicholas.foundation.application;

import com.example.nicholas.foundation.activity.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Nicholas on 6/24/2018.
 */
@Module
abstract class ActivityAndFragmentModule {
    @ContributesAndroidInjector
    abstract MainActivity mainActivity();
}
