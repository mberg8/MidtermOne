package com.example.midtermone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;




public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView card1, card2, card3, card4, card5, card6, card7, card8, card9, card10, card11, card12;

    FirebaseDatabase database;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card1 = (CardView) findViewById(R.id.cardView1);
        card2 = (CardView) findViewById(R.id.cardView2);
        card3 = (CardView) findViewById(R.id.cardView3);
        card4 = (CardView) findViewById(R.id.cardView4);
        card5 = (CardView) findViewById(R.id.cardView5);
        card6 = (CardView) findViewById(R.id.cardView6);
        card7 = (CardView) findViewById(R.id.cardView7);
        card8 = (CardView) findViewById(R.id.cardView8);
        card9 = (CardView) findViewById(R.id.cardView9);
        card10 = (CardView) findViewById(R.id.cardView10);
        card11 = (CardView) findViewById(R.id.cardView11);
        card12 = (CardView) findViewById(R.id.cardView12);

        card1.setOnClickListener(this);
        card2.setOnClickListener(this);
        card3.setOnClickListener(this);
        card4.setOnClickListener(this);
        card5.setOnClickListener(this);
        card6.setOnClickListener(this);
        card7.setOnClickListener(this);
        card8.setOnClickListener(this);
        card9.setOnClickListener(this);
        card10.setOnClickListener(this);
        card11.setOnClickListener(this);
        card12.setOnClickListener(this);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("bookFirebaseData");

    }




    @Override
    public void onClick(View v) {
        Intent i;
        Log.d("CIS 3334", "In onClick");
        switch (v.getId()) {
            case R.id.cardView1 :
                i = new Intent(this,book1.class);
                startActivity(i);
                break;
            case R.id.cardView2 :
                 i = new Intent(this,book2.class);
                 startActivity(i);
                 break;

            case R.id.cardView3:
                i= new Intent(this,book3.class);
                startActivity(i);
                break;

            case R.id.cardView4:
                i= new Intent(this,book4.class);
                startActivity(i);
                break;

            case R.id.cardView5:
                i= new Intent(this,book5.class);
                startActivity(i);
                break;

            case R.id.cardView6:
                i= new Intent(this,book6.class);
                startActivity(i);
                break;

            case R.id.cardView7:
                i= new Intent(this,book7.class);
                startActivity(i);
                break;

            case R.id.cardView8:
                i= new Intent(this,book8.class);
                startActivity(i);
                break;

            case R.id.cardView9:
                i= new Intent(this,book9.class);
                startActivity(i);
                break;

            case R.id.cardView10:
                i= new Intent(this,book10.class);
                startActivity(i);
                break;

            case R.id.cardView11:
                i= new Intent(this,book11.class);
                startActivity(i);
                break;

            case R.id.cardView12:
                i= new Intent(this,book12.class);
                startActivity(i);
                break;
        }

    }
}