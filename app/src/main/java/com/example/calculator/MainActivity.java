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
            Integer syllable1 = Integer.parseInt(number1.getText().toString());
            Integer syllable2 = Integer.parseInt(number2.getText().toString());
            Integer result = syllable1 + syllable2;
            Intent intent = new Intent(this, ResultActivity.class);
        if (syllable2<0){
            intent.putExtra("answer", syllable1+" + "+"("+syllable2+")"+" = "+ result);
            startActivity(intent);}
        else{
            intent.putExtra("answer", syllable1+" + "+syllable2+" = "+ result);
            startActivity(intent);}
        }
        catch (Exception ex){
            Intent intent = new Intent(this, ResultActivity.class);
            String Error ="Введено неверное значение";
            intent.putExtra("answer", Error);
            startActivity(intent);
        }
    }
}