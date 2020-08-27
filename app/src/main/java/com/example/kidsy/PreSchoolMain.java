package com.example.kidsy;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreSchoolMain extends AppCompatActivity {

    Button btnOpenPreMaths,btnOpenPreEnglish,btnOpenPrePaint,btnOpenPreSocial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_school_main);

        btnOpenPreMaths=(Button)findViewById(R.id.btnPreMath);
        btnOpenPreMaths.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent PreMathSecond=new Intent(PreSchoolMain.this,PreMathRecyclerView.class);
                startActivity(PreMathSecond);


            }
        });
    }
    }
