package com.weijiaxing.logcatviewer.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.weijiaxing.logcatviewer.R;
import com.weijiaxing.logviewer.LogcatActivity;


public class UseLogcatActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_use_logcat);

        LogcatActivity.launch(UseLogcatActivity.this);

    }
}
