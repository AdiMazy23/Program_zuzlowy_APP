package com.example.comarch_speedway;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.FirebaseDatabase;

public class Choose_1or2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nr_zestawu);

    }
        public void myClickHandler (View view){
            switch (view.getId()){
                case R.id.button:
                    Log.d("Sprawdzam button 2,  ", "KLIKNIĘTO NEXT"); //w tym miejscu dopisać save i otworzyc nowy widok z wyborem zawodnikow
                    //startActivity(new Intent(MainActivity.this, RidersListActivity.class));
                    break;
                case R.id.button2:
                    Log.d("Sprawdzam button 3,  ", "KLIKNIĘTO NEXT"); //w tym miejscu dopisać save i otworzyc nowy widok z wyborem zawodnikow
                    //startActivity(new Intent(MainActivity.this, RidersListActivity.class));
                    break;
                default:
            }
        }

        public void setButtonClickListener2() {
            Button mainNext = (Button) findViewById(R.id.button2);

            View.OnClickListener myClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    myClickHandler(view);
                }
            };
            mainNext.setOnClickListener(myClickListener);
        }
        public void setButtonClickListener3(){
            Button mainNext = (Button) findViewById(R.id.button3);

            View.OnClickListener myClickListener = new View.OnClickListener() {
                @Override
                public void onClick(View view){
                    myClickHandler(view);
                }
            };
            mainNext.setOnClickListener(myClickListener);

        }

    }
