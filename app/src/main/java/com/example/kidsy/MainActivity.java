package com.example.kidsy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btn ,btnBook;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnBook=(Button)findViewById(R.id.homebtnbooks);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent CatBook=new Intent(MainActivity.this,BookCatMainActivity.class);
                startActivity(CatBook);
            }
        });

        textView = findViewById(R.id.home);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        btn = findViewById(R.id.homebtnorders);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTo();
            }
        });

    }
    private void moveTo(){
        Intent intent=new Intent(MainActivity.this,Myorders.class);
        startActivity(intent);
    }
}