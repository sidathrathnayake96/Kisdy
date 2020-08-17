package com.example.kidsy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Paymentinfo extends AppCompatActivity {

    private Button btn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentinfo);

        textView = findViewById(R.id.paymentinfo);
        textView.setPaintFlags(textView.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        btn = findViewById(R.id.paymentbtncontinue);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveToShipping();
            }
        });
    }
    private void moveToShipping(){
        Intent intent=new Intent(Paymentinfo.this,Shipping.class);
        startActivity(intent);
    }

}