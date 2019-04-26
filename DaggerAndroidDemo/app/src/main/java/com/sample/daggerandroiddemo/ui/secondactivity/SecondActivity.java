package com.sample.daggerandroiddemo.ui.secondactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.sample.daggerandroiddemo.R;
import com.sample.daggerandroiddemo.ui.mainactivity.MainActivity;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.support.DaggerAppCompatActivity;

public class SecondActivity extends DaggerAppCompatActivity {

    @Inject
    @Named("global")
    String globalString;

    @Inject
    @Named("second")
    String secondString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        updateTextView();

        findViewById(R.id.bt_launch_main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });
    }

    private void updateTextView() {
        String concatString = globalString + "/" + secondString;
        ((TextView) findViewById(R.id.tv_activity_info)).setText(concatString);
    }
}
