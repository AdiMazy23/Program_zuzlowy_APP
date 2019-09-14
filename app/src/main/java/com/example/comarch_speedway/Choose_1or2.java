package com.example.comarch_speedway;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Choose_1or2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef2 = database.getInstance().getReference().child("teams");
        setContentView(R.layout.activity_nr_zestawu);

        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        setButtonClickListener2();
        setButtonClickListener3();
    }
        public void myClickHandler (View view){
            switch (view.getId()){
                case R.id.button_zestaw1:
                    DataContainer.zestaw1or2 = true;
                    openNextActivity();
                    break;
                case R.id.button_zestaw2:
                    DataContainer.zestaw1or2 = false;
                    openNextActivity();
                    break;
                default:
            }
        }

        public void setButtonClickListener2() {
            Button mainNext = (Button) findViewById(R.id.button_zestaw1);

            View.OnClickListener myClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    myClickHandler(view);
                }
            };
            mainNext.setOnClickListener(myClickListener);
        }
        public void setButtonClickListener3() {
            Button mainNext2 = (Button) findViewById(R.id.button_zestaw2);

            View.OnClickListener myClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    myClickHandler(view);
                }
            };
            mainNext2.setOnClickListener(myClickListener);
        }


        public void openNextActivity(){
            Intent intent = new Intent(Choose_1or2.this, SimpleHeat.class);
            startActivity(intent);
        }
    }

