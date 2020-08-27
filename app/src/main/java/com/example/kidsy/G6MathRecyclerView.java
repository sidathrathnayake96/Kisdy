package com.example.kidsy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;

public class G6MathRecyclerView extends AppCompatActivity {

    G6MathAdapter g6MathAdapter;
    ArrayList<String>items;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g6_math_recycler_view);

        items=new ArrayList<>();
        items.add("Grade 6 Maths");
        items.add("Grade 6 Maths workbook");
        items.add(" Maths workbook");
        items.add(" Maths");
        items.add("Grade 6 Mathematics");



        recyclerView=findViewById(R.id.G6MathRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        g6MathAdapter=new G6MathAdapter(this,items);
        recyclerView.setAdapter(g6MathAdapter);
    }
}