package com.example.midtermone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;



public class orderbooks extends AppCompatActivity implements View.OnClickListener {

    public Button confirmOrder;
    public CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7, checkBox8, checkBox9, checkBox10, checkBox11, checkBox12;

    FirebaseDatabase database;
    DatabaseReference myRef;
    Order order;
    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderbooks);

        database = FirebaseDatabase.getInstance();
        myRef = database.getReference("bookFirebaseData");

        order = new Order();

        confirmOrder = (Button) findViewById(R.id.buttonConfirmOrder);
        confirmOrder.setOnClickListener(this);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox) findViewById(R.id.checkBox8);
        checkBox9 = (CheckBox) findViewById(R.id.checkBox9);
        checkBox10 = (CheckBox) findViewById(R.id.checkBox10);
        checkBox11 = (CheckBox) findViewById(R.id.checkBox11);
        checkBox12= (CheckBox) findViewById(R.id.checkBox12);

       String check1 = "Anne of Green Gables";
       String check2 = "Black Beauty";
       String check3 = "Hatchet";
       String check4 = "The Lion the Witch and the Wardrobe";
       String check5 = "Little Women";
       String check6 = "Mary Poppins";
       String check7 = "The Wizard of Oz";
       String check8 = "Peter Pan";
       String check9 = "Pippi LongStalking";
       String check10 = "Where the Red Fern Grows";
       String check11 = "The Secret Garden";
       String check12 = "Wild Hearts Can't Be Broken";

       myRef.addValueEventListener(new ValueEventListener() {
           @Override
           public void onDataChange(@NonNull DataSnapshot snapshot) {

               if(snapshot.exists()){
                   i = (int)snapshot.getChildrenCount();
               }
           }

           @Override
           public void onCancelled(@NonNull DatabaseError error) {

           }
       });

        confirmOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox1.isChecked()){

                    order.setAnne(check1);

                    myRef.child(String.valueOf(i+1)).setValue(order);

                }
                else if (checkBox2.isChecked()){

                    order.setBlackBeauty(check2);

                    myRef.child(String.valueOf(i+1)).setValue(order);

                }
                else if (checkBox3.isChecked()){

                    order.setHatchet(check3);

                    myRef.child(String.valueOf(i+1)).setValue(order);

                }
                else if (checkBox4.isChecked()){

                    order.setLionWitchWardrobe(check4);

                    myRef.child(String.valueOf(i+1)).setValue(order);

                }
                else if (checkBox5.isChecked()){

                    order.setLittleWomen(check5);

                    myRef.child(String.valueOf(i+1)).setValue(order);

                }
                else if (checkBox6.isChecked()){

                    order.setMaryPoppins(check6);

                    myRef.child(String.valueOf(i+1)).setValue(order);

                }
                else if (checkBox7.isChecked()){

                    order.setWizardOfOz(check7);

                    myRef.child(String.valueOf(i+1)).setValue(order);

                }
                else if (checkBox8.isChecked()){

                    order.setPeterPan(check8);

                    myRef.child(String.valueOf(i+1)).setValue(order);

                }
                else if (checkBox9.isChecked()){

                    order.setPippiLongStalking(check9);

                    myRef.child(String.valueOf(i+1)).setValue(order);

                }
                else if (checkBox10.isChecked()){

                    order.setWhereTheRedFernGrows(check10);

                    myRef.child(String.valueOf(i+1)).setValue(order);

                }
                else if (checkBox11.isChecked()){

                    order.setTheSecretGarden(check11);

                    myRef.child(String.valueOf(i+1)).setValue(order);

                }
                else{
                    order.setWildHeartsCantBeBroken(check12);

                    myRef.child(String.valueOf(i+1)).setValue(order);
                }
            }
        });

    }


    @Override
    public void onClick(View v) {

    }
}