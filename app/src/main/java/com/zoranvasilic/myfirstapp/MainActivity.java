package com.zoranvasilic.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener((view) -> {
            EditText num1 = (EditText) findViewById(R.id.firstTextField);
            EditText num2 = (EditText) findViewById(R.id.secondTextField);
            TextView result = (TextView) findViewById(R.id.result);

            int number1 = Integer.parseInt(num1.getText().toString());
            int number2 = Integer.parseInt(num2.getText().toString());

            int resultSum = number1 + number2;
            result.setText(resultSum + "");
        });
    }
}
