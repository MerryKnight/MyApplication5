package com.example.myapplication5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Intent intent = getIntent();
        String value = intent.getStringExtra("selectedItem");
        TextView textView = findViewById(R.id.textView3);
        textView.setText(value);
    }
}