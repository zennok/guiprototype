package com.example.android.guiprototype;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends Activity {

    /**
     * Called when the activity is first created.
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void toOne(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
