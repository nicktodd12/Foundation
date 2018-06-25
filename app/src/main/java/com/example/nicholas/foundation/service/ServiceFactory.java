package com.example.nicholas.foundation.service;

import com.example.nicholas.foundation.BuildConfig;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Nicholas on 6/24/2018.
 */

public class ServiceFactory {

    static <T> T createService(Class<T> service){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        if (BuildConfig.DEBUG) {
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        } else {
            logging.setLevel(HttpLoggingInterceptor.Level.NONE);
        }

        OkHttpClient.Builder clientBuilder = new OkHttpClient.Builder().addInterceptor(logging);
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.client(clientBuilder.build());
        builder.baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.createAsync());
        return builder.build().create(service);
    }
}
