package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);
        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        double ans = intent.getDoubleExtra("answer", 0);
        boolean error = intent.getBooleanExtra("error", false);
        if(!error) {
            textView.setText(new Double(ans).toString());
        } else {
            textView.setText("Can Not Divide By Zero!");
        }
    }
}