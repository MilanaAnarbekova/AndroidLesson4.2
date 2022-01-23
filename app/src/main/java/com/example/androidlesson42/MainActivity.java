package com.example.androidlesson42;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);
        loadData();
        adapter = new Adapter(list);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        list = new ArrayList<>();
        list.add(new Model("C","https://cdn-icons.flaticon.com/png/128/3665/premium/3665923.png?token=exp=1642930255~hmac=15332dced15ae967a44d3560300e835c"));
        list.add(new Model("C++","https://cdn-icons-png.flaticon.com/128/919/919841.png"));
        list.add(new Model("HTML","https://cdn-icons-png.flaticon.com/128/5968/5968267.png"));
        list.add(new Model("Kotlin","https://cdn-icons.flaticon.com/png/128/4300/premium/4300493.png?token=exp=1642930367~hmac=8290e3639e42d4f829f2ac47886a3254"));
        list.add(new Model("Java","https://cdn-icons.flaticon.com/png/128/5433/premium/5433712.png?token=exp=1642930204~hmac=9faaa44a8c194a60507133f68a2ebecb"));
        list.add(new Model("Android","https://cdn-icons-png.flaticon.com/128/226/226770.png"));
    }
}