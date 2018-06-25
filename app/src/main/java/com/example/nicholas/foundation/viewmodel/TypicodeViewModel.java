package com.example.nicholas.foundation.viewmodel;

import com.example.nicholas.foundation.model.Todo;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by Nicholas on 6/24/2018.
 */

public interface TypicodeViewModel {
    Observable<List<Todo>> getTodosList();
}
