package com.example.myapplication5;

import android.os.Bundle;
import android.content.Intent;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String value = intent.getStringExtra("selectedItem");
        TextView textView = findViewById(R.id.textView1);
        textView.setText(value);

        EditText editText = findViewById(R.id.editTextText);
        ListView listView = findViewById(R.id.listView);
        Button button = findViewById(R.id.button1);

        String[] appleNames = getResources().getStringArray(R.array.appleNames);

        ArrayList<String>dataList = new ArrayList<>(Arrays.asList(appleNames));
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_multiple_choice, dataList);

        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = editText.getText().toString();
                dataList.add(text);
                adapter.notifyDataSetChanged();
                editText.getText().clear();
            }
        });
        Button deleteButton = findViewById(R.id.button2);
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SparseBooleanArray selectedItems = listView.getCheckedItemPositions();
                for (int i = selectedItems.size() - 1; i >= 0; i--) {
                    if (selectedItems.valueAt(i)) {
                        int position = selectedItems.keyAt(i);
                        dataList.remove(position);
                    }
                }
                adapter.notifyDataSetChanged();
                listView.clearChoices();
            }
        });
    }
}