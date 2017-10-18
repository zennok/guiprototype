package com.example.android.guiprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class enter2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter2);
    }

    public void click(View view)
    {
        EditText text = (EditText)findViewById(R.id.edit_message);
        String str = text.getText().toString();

        Intent i = new Intent(this,list.class);
        i.putExtra(list.Activity_tag, "2");
        i.putExtra(list.secondary, str);

        startActivity(i);
    }
}
