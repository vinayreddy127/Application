package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerActivity extends AppCompatActivity {
    String[] countries = new String[]{"india","usa","uk","australia", "japan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        RecyclerView countriesRecyclerView = findViewById(R.id.recyclerViewCountries);

        CountriesAdapter adapter = new CountriesAdapter(countries,this);

        countriesRecyclerView.setAdapter(adapter);
        countriesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //layout manager --- he's suppose to arrange the layout of list either horizontally or vertically or staggered
    }
}