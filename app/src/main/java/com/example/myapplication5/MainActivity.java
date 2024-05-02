package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView myListView = (ListView) findViewById(R.id.mylistview);

        myListView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent;
            String selectedItem = (String) parent.getItemAtPosition(position);
            switch (position) {
                case 0:
                    intent = new Intent(MainActivity.this, MainActivity2.class);
                    intent.putExtra("selectedItem", selectedItem);
                    break;
                case 1:
                    intent = new Intent(MainActivity.this, MainActivity3.class);
                    intent.putExtra("selectedItem", selectedItem);
                    break;
                case 2:
                    intent = new Intent(MainActivity.this, MainActivity4.class);
                    intent.putExtra("selectedItem", selectedItem);
                    break;
                case 3:
                    intent = new Intent(MainActivity.this, MainActivity5.class);
                    intent.putExtra("selectedItem", selectedItem);
                    break;
                case 4:
                    intent = new Intent(MainActivity.this, MainActivity6.class);
                    intent.putExtra("selectedItem", selectedItem);
                    break;
                case 5:
                    intent = new Intent(MainActivity.this, MainActivity7.class);
                    intent.putExtra("selectedItem", selectedItem);
                    break;
                default:
                    return;
            }
            startActivity(intent);
         });
    }
}
