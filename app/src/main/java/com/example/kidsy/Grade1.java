package com.example.kidsy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Grade1 extends AppCompatActivity {

    Button btMaths,btEnglish,btnSocial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade1);

        btMaths=(Button)findViewById(R.id.btnGrd1Maths);

        btMaths.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent Grd1MathSecond=new Intent(Grade1.this,G1MathsRecyclerView.class);
                startActivity(Grd1MathSecond);

            }
        });
    }
}