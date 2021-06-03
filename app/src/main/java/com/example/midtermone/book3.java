package com.example.midtermone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class book3 extends AppCompatActivity implements View.OnClickListener {

    public Button buttonMenu;
    public Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book3);

        buttonMenu = findViewById(R.id.button3);
        buttonOrder = findViewById(R.id.button3_1);

        buttonMenu.setOnClickListener(this);
        buttonOrder.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        Log.d("CIS 3334", "In onClick");
        switch (v.getId()) {
            case R.id.button3:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case R.id.button3_1:
                i = new Intent(this, orderBook.class);
                startActivity(i);
                break;

        }
    }
}