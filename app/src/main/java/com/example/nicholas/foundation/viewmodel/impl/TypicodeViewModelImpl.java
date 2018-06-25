package com.example.nicholas.foundation.viewmodel.impl;

import com.example.nicholas.foundation.model.Todo;
import com.example.nicholas.foundation.service.TypicodeService;
import com.example.nicholas.foundation.viewmodel.TypicodeViewModel;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * Created by Nicholas on 6/24/2018.
 */

public class TypicodeViewModelImpl implements TypicodeViewModel{

    private TypicodeService typicodeService;

    TypicodeViewModelImpl(TypicodeService typicodeService) {
        this.typicodeService = typicodeService;
    }

    @Override
    public Observable<List<Todo>> getTodosList() {
        return typicodeService.getTodosList().compose(tObservable -> tObservable.observeOn(AndroidSchedulers.mainThread()));
    }
}
