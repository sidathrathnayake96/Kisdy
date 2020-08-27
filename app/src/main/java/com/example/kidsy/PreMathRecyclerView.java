package com.example.kidsy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PreMathRecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_math_recycler_view);

        RecyclerView recyclerView=findViewById(R.id.PreMathRecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));


        PreMathsData[] preMathsData=new PreMathsData[]{

                new PreMathsData("Preschool Math Workbook","Jhone Michel","Rs.600.00",R.drawable.premaths),
                new PreMathsData("Starting Maths"," Michel Andrew","Rs.400.00",R.drawable.mathus),
                new PreMathsData(" Math Workbook","Robert Jackson","Rs.450.00",R.drawable.mathss),
                new PreMathsData("Fundamental Maths","jemis Anderson","Rs.350.00",R.drawable.mathl),
        };


        //PreMathAdapter preMathAdapter=new PreMathAdapter(preMathsData,PreMathRecyclerView.this);
        // recyclerView.setAdapter(preMathAdapter);

    }



}