package com.example.android.guiprototype;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class connected extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connected);

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {

            @Override
            public void run() {
                toEnter1();
            }

        }, 1000L);

    }

    public void toEnter1() {
        Intent i = new Intent(this, enter1.class);
        startActivity(i);
    }
}
