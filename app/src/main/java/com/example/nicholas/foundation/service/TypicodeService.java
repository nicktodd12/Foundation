package com.example.nicholas.foundation.service;

import com.example.nicholas.foundation.model.Todo;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by Nicholas on 6/24/2018.
 */

public interface TypicodeService {
    @GET("todos")
    Observable<List<Todo>> getTodosList();
}
