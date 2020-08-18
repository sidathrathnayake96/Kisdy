package com.example.kidsy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;

import android.view.Gravity;
import android.view.View;

import android.view.View;


import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button btn, btn5, button;


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.home);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        button = findViewById(R.id.homebtnentertainment);
        btn = findViewById(R.id.homebtnorders);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTo();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Entertainment.class);
                startActivity(intent);
            }
        });


    }

    private void moveTo() {
        Intent intent = new Intent(MainActivity.this, Myorders.class);
        startActivity(intent);
    }
}