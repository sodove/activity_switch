package com.sodove.activity_switch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle arg = getIntent().getExtras();
        String text = arg.getString("message");
        TextView textView = findViewById(R.id.text);
        textView.setText(text);
    }
}