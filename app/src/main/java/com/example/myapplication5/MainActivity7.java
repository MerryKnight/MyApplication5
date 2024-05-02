package com.example.myapplication5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        Spinner spinner = findViewById(R.id.spinner);

        // Создаем список элементов для Spinner
        List<String> categories = new ArrayList<>();
        categories.add("Категория 1");
        categories.add("Категория 2");
        categories.add("Категория 3");

        // Создаем адаптер для Spinner с использованием списка категорий
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, categories);

        // Устанавливаем стиль выпадающего списка
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Устанавливаем адаптер для Spinner
        spinner.setAdapter(adapter);
    }
}
