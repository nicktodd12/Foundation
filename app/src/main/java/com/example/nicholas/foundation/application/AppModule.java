package com.example.nicholas.foundation.application;

import android.content.Context;

import com.example.nicholas.foundation.BuildConfig;
import com.example.nicholas.foundation.viewmodel.impl.ViewModelModule;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Nicholas on 6/24/2018.
 */
@Module(includes = ViewModelModule.class)
class AppModule {
    @Provides
    @Singleton
    Context context() {
        return FoundationApplication.getApplicationContextInstance();
    }

    @Provides
    @Singleton
    Picasso picasso(Context context) {
        Picasso.Builder builder = new Picasso.Builder(context);
        builder.downloader(new OkHttpDownloader(context, 25));
        Picasso built = builder.build();
        if (BuildConfig.DEBUG) {
            built.setIndicatorsEnabled(true);
            built.setLoggingEnabled(true);
        }
        return built;
    }
}
