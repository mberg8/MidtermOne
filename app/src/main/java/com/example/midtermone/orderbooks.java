package com.example.midtermone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class orderbooks extends AppCompatActivity implements View.OnClickListener {

    public Button confirmOrder;

    FirebaseDatabase database;
    DatabaseReference myRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderbooks);

        confirmOrder= (Button) findViewById(R.id.buttonConfirmOrder);

        confirmOrder.setOnClickListener(this);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("bookFirebaseData");
    }


    @Override
    public void onClick(View v) {

    }
}