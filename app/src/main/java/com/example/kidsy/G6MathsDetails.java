package com.example.kidsy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class G6MathsDetails extends AppCompatActivity {

    TextView textBookName1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g6_maths_details);

        textBookName1=findViewById(R.id.G6MathBookName1);

        Intent i=getIntent();
        String title=i.getStringExtra("title");
        textBookName1.setText(title);
    }
}