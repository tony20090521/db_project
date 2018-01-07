package com.afmobi.testlaunchermode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SingleInstanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText("Single:"+getTaskId());

    }

    public void onclick(View view){

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
//        finish();
    }

    public void onclick3(View view){

        Intent intent = new Intent(this,SingleInstanceActivity.class);
        startActivity(intent);

    }
}
