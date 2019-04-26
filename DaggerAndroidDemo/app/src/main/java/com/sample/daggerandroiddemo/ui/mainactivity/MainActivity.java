package com.sample.daggerandroiddemo.ui.mainactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.sample.daggerandroiddemo.R;
import com.sample.daggerandroiddemo.ui.secondactivity.SecondActivity;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    @Named("global")
    String globalString;

    @Inject
    @Named("main")
    String mainString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateTextView();

        findViewById(R.id.bt_launch_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }

    private void updateTextView() {
        String concatString = globalString + "/" + mainString;
        ((TextView) findViewById(R.id.tv_hellow_world)).setText(concatString);
    }


}
