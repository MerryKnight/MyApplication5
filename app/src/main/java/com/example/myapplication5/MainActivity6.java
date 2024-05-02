package com.example.myapplication5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);


        ScrollView scrollView = new ScrollView(this);
        scrollView.addView(linearLayout);


        setContentView(scrollView);


        for (int i = 0; i < 50; i++) {
            TextView textView = new TextView(this);
            textView.setTextSize(20);
            textView.setText("Text " + i);
            linearLayout.addView(textView);
        }

        EditText editText = new EditText(this);
        editText.setHint("Введите текст");
        linearLayout.addView(editText);
    }
}
