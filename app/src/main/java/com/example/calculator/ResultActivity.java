package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle arguments = getIntent().getExtras();
        String res = arguments.get("answer").toString();
        TextView counterView = findViewById(R.id.txt_counter);
        counterView.setText(res);
    }
}

