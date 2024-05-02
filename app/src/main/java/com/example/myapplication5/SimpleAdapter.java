package com.example.myapplication5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.ViewHolder> {
    private final ArrayList<HashMap<String, Object>> dataList;
    public SimpleAdapter(ArrayList<HashMap<String, Object>> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public SimpleAdapter.ViewHolder onCreateViewHolder(@NonNull
                                                       ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate
                (R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView1;
        ViewHolder(View view) {
            super(view);
            imageView1 = view.findViewById(R.id.imageView);
            textView = view.findViewById(R.id.textView4);

        }
    }
    @Override
    public void onBindViewHolder(@NonNull SimpleAdapter.ViewHolder
                                         holder, int position) {
        HashMap<String, Object> item = dataList.get(position);
        holder.imageView1.setImageResource((Integer) item.get("image"));
        holder.textView.setText((String) item.get("text"));
    }
}

