package com.example.kidsy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BookCatMainActivity extends AppCompatActivity {
    Button btnOpen1,btnOpen2,btnOpen3,btnOpen4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_cat_main);

        btnOpen1=(Button)findViewById(R.id.btnPre);
        btnOpen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PreSchool = new Intent(BookCatMainActivity.this,PreSchoolMain.class);
                startActivity(PreSchool);
            }
        });

        btnOpen2=(Button)findViewById(R.id.btn1);
        btnOpen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Grd1 = new Intent(BookCatMainActivity.this,Grade1.class);
                startActivity(Grd1);
            }
        });

        btnOpen3=(Button)findViewById(R.id.btn6);
        btnOpen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Grd6 = new Intent(BookCatMainActivity.this,Grade6.class);
                startActivity(Grd6);
            }
        });

        btnOpen4=(Button)findViewById(R.id.btnOther);
        btnOpen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Other = new Intent(BookCatMainActivity.this,Other.class);
                startActivity(Other);
            }
        });




    }
}