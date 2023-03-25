package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonclick(View view) {
        try {
            number1 = (EditText) findViewById(R.id.editText);
            number2 = (EditText) findViewById(R.id.editText2);
            double syllable1 = Double.parseDouble(number1.getText().toString());
            double syllable2 = Double.parseDouble(number2.getText().toString());
            double result = syllable1 + syllable2;
            Intent intent = new Intent(this, ResultActivity.class);
        if (syllable2<0){
            intent.putExtra("answer", syllable1+" + "+"("+syllable2+")"+" = "+ result);
            startActivity(intent);
        }}
        catch (Exception ex){
            Intent intent = new Intent(this, ResultActivity.class);
            String Error ="Введено неверное значение";
            intent.putExtra("answer", Error);
            startActivity(intent);
        }
    }
}