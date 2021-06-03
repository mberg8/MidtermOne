package com.example.midtermone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class book1 extends AppCompatActivity implements View.OnClickListener {

    public Button buttonMenu;
    public Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);

        buttonMenu = findViewById(R.id.button1);
        buttonOrder = findViewById(R.id.button1_1);

        buttonMenu.setOnClickListener(this);
        buttonOrder.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Intent i;
        Log.d("CIS 3334", "In onClick");
        switch (v.getId()) {
            case R.id.button1:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case R.id.button1_1:
                i = new Intent(this, orderbook.class);
                startActivity(i);
                break;

        }
    }
}