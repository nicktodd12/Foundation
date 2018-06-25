package com.example.nicholas.foundation.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.nicholas.foundation.R;
import com.example.nicholas.foundation.model.Todo;
import com.example.nicholas.foundation.viewmodel.TypicodeViewModel;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.support.DaggerAppCompatActivity;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by Nicholas on 6/24/2018.
 */

public class MainActivity extends DaggerAppCompatActivity {

    @BindView(R.id.body_text)
    TextView bodyText;

    @Inject
    TypicodeViewModel viewModel;

    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        compositeDisposable.add(viewModel.getTodosList().subscribe(
                response -> {
                    String output = "";
                    for(Todo t : response){
                        output += t.getTitle() + "\n";
                    }
                    bodyText.setText(output);
                }
        ));
    }

    @Override
    protected void onPause() {
        super.onPause();
        compositeDisposable.clear();
    }
}
