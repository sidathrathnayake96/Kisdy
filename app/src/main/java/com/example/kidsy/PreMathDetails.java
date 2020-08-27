package com.example.kidsy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PreMathDetails extends AppCompatActivity {

    TextView PreMathsTextTitle1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_math_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        PreMathsTextTitle1 = findViewById(R.id.PreMathBName1);

        Intent i=getIntent();
        String title = i.getStringExtra("title");

        PreMathsTextTitle1.setText(title);
    }
}