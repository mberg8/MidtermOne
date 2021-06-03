package com.example.midtermone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class book12 extends AppCompatActivity implements OnClickListener {

    Button buy12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book12);

        buy12=findViewById(R.id.button12);

        buy12.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

    }
}