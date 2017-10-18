package com.example.android.guiprototype;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class list extends AppCompatActivity {

    public static final String Activity_tag = "WhichAct";
    public static final String primary = null;
    public static final String secondary = null;

    public static String actTag = null;
    public static String primNum = null;
    public static String secNum = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);



        if(getIntent().getExtras() != null)
        {
            actTag = getIntent().getStringExtra(Activity_tag);
        }

        if(actTag.equals("1"))
        {
            primNum = getIntent().getStringExtra(primary);
            primNum += "\n";

        }

        else if(actTag.equals("2"))
        {
            secNum = getIntent().getStringExtra(secondary);
            secNum += "\n";
        }

        TextView textPrimary = (TextView) findViewById(R.id.primary);
        textPrimary.setText(primNum);

        if(secNum != null)
        {
            TextView textSecondary = (TextView) findViewById(R.id.secondary);
            textSecondary.setText(secNum);
        }
    }






    public void editP(View view)
    {
        Intent i = new Intent(this,editp.class);
        startActivity(i);
    }

    public void editS(View view)
    {
        Intent i = new Intent(this,enter2.class);
        startActivity(i);
    }
}
