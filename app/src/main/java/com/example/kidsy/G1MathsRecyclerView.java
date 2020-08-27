package com.example.kidsy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class G1MathsRecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g1_maths_recycler_view);

        RecyclerView recyclerView=findViewById(R.id.G1MathRecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));


        G1MathsData[] g1MathsData=new G1MathsData[]{

                new G1MathsData("Grade 1","SATHARA DISTRIBUTION","Rs.800.00",R.drawable.grade1maths),
                new G1MathsData("Grade 2"," SATHARA DISTRIBUTION","Rs.700.00",R.drawable.grade2maths),
                new G1MathsData(" Grade 3","Reza nazari and Ava Ross","Rs.550.00",R.drawable.grade3maths),
                new G1MathsData("Grade 4","Anura Jayasingha","Rs.350.00",R.drawable.grade4maths),
                new G1MathsData("Grade 5","Anura Jayasingha","Rs.350.00",R.drawable.grade5maths),
        };


        //G1MathAdapter g1MathAdapter=new G1MathAdapter(g1MathsData,G1MathsRecyclerView.this);
        //recyclerView.setAdapter(g1MathAdapter);
    }
}