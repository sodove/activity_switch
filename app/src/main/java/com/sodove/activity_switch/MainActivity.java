package com.sodove.activity_switch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){
        EditText editText = findViewById(R.id.editor);
        String text = editText.getText().toString();

        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra("message", text);
        startActivity(i);
    }
}