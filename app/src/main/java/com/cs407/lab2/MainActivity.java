package com.cs407.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(double answer, boolean error){
        Intent intent = new Intent(this, Result.class);
        intent.putExtra("answer", answer);
        intent.putExtra("error", error);
        startActivity(intent);
    }

    public void addition(View view){
        EditText X = (EditText) findViewById(R.id.X);
        EditText Y = (EditText) findViewById(R.id.Y);

        double answer = Integer.parseInt(X.getText().toString()) + Integer.parseInt(Y.getText().toString());
        goToActivity(answer, false);
    }

    public void subtraction(View view){
        EditText X = (EditText) findViewById(R.id.X);
        EditText Y = (EditText) findViewById(R.id.Y);

        double answer = Integer.parseInt(X.getText().toString()) - Integer.parseInt(Y.getText().toString());
        goToActivity(answer, false);
    }

    public void multiplication(View view){
        EditText X = (EditText) findViewById(R.id.X);
        EditText Y = (EditText) findViewById(R.id.Y);

        double answer = Integer.parseInt(X.getText().toString()) * Integer.parseInt(Y.getText().toString());
        goToActivity(answer, false);
    }

    public void division(View view){
        EditText X = (EditText) findViewById(R.id.X);
        EditText Y = (EditText) findViewById(R.id.Y);

        double x = Double.parseDouble(X.getText().toString());
        double y = Double.parseDouble(Y.getText().toString());

        if(y != 0.0){
            double answer = x/y;
            goToActivity(answer, false);
        } else {
            goToActivity(0, true);
        }
    }
}