package com.example.myapplication5;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        RecyclerView recyclerView = findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<HashMap<String, Object>> dataList = new ArrayList<>();
        HashMap<String, Object> item1 = new HashMap<>();
        HashMap<String, Object> item2 = new HashMap<>();
        HashMap<String, Object> item3 = new HashMap<>();
        item1.put("text", "Item 1");
        item1.put("image", R.drawable.faye);
        dataList.add(item1);

        item2.put("text", "Item 2");
        item2.put("image", R.drawable.ic_launcher_background);
        dataList.add(item2);

        item3.put("text", "Item 3");
        item3.put("image", R.drawable.ic_launcher_background);
        dataList.add(item3);


        SimpleAdapter adapter = new SimpleAdapter(dataList);

        recyclerView.setAdapter(adapter);
    }
}
