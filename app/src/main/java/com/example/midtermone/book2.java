package com.example.midtermone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class book2 extends AppCompatActivity implements View.OnClickListener {

    public Button buttonMenu;
    public Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book2);

        buttonMenu = findViewById(R.id.button2_1);
        buttonOrder = findViewById(R.id.button2);

        buttonMenu.setOnClickListener(this);
        buttonOrder.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        Log.d("CIS 3334", "In onClick");
        switch (v.getId()) {
            case R.id.button2_1:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                break;
            case R.id.button2:
                i = new Intent(this, orderbooks.class);
                startActivity(i);
                break;

        }
    }
}