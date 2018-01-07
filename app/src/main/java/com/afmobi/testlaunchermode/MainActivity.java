package com.afmobi.testlaunchermode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String testStr = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text);
        //write something from github
        textView.setText("Main:"+getTaskId());


        //update something else for test
        
        
        //write something

        //clone from github

        TextView textView2 = (TextView) findViewById(R.id.text);
        //write something from github
        textView.setText("Main:"+getTaskId());


        //update something else for test


        //write something

        //clone from github


        TextView textView3 = (TextView) findViewById(R.id.text);
        //write something from github
        textView.setText("Main:"+getTaskId());


        //update something else for test

        TextView textView5 = (TextView) findViewById(R.id.text);
        //write something from github
        textView.setText("Main:"+getTaskId());

        //write something

        //clone from github
    }


    public void setOnclick(View view){

        Intent intent = new Intent(this,SingleInstanceActivity.class);
        startActivity(intent);

    }


    public void onclick(View view){

        Intent intent = new Intent(this,SingleInstanceActivity.class);
        startActivity(intent);

    }

    public void onclick2(View view){

        Intent intent = new Intent(this,SingleInstanceActivity.class);
        startActivity(intent);

    }

    public void onclick3(View view){

        Intent intent = new Intent(this,SingleInstanceActivity.class);
        startActivity(intent);

    }
}
