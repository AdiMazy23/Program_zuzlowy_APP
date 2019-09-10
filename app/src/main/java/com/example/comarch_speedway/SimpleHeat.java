package com.example.comarch_speedway;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SimpleHeat extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_heat_view);

        TextView Bieg = (TextView) findViewById(R.id.text_bieg);

        TextView ZawodnikA = (TextView) findViewById(R.id.id_zawodnikA);
        TextView ZawodnikB = (TextView) findViewById(R.id.id_zawodnikB);
        TextView ZawodnikC = (TextView) findViewById(R.id.id_zawodnikC);
        TextView ZawodnikD = (TextView) findViewById(R.id.id_zawodnikD);

        Button poleA_button = (Button) findViewById(R.id.button5);
        Button poleB_button = (Button) findViewById(R.id.button6);
        Button poleC_button = (Button) findViewById(R.id.button7);
        Button poleD_button = (Button) findViewById(R.id.button8);

        DataContainer.nr_biegu = 1;

        if (DataContainer.zestaw1or2 == true){  //zestaw 1 bieg 1
            poleA_button.setBackgroundResource(R.color.Yellow);
            poleB_button.setBackgroundResource(R.color.Red);
            poleC_button.setBackgroundResource(R.color.White);
            poleD_button.setBackgroundResource(R.color.Blue);

        }
        if (DataContainer.zestaw1or2 == false){ //zestaw 2 bieg 1
            poleA_button.setBackgroundResource(R.color.Red);
            poleB_button.setBackgroundResource(R.color.Yellow);
            poleC_button.setBackgroundResource(R.color.Blue);
            poleD_button.setBackgroundResource(R.color.White);

        }



    }


    public void myClickHandler (View view){
        switch (view.getId()){
            case R.id.button_previousheat:
                Log.d("Sprawdzam button 2,  ", "KLIKNIĘTO NEXT"); //w tym miejscu dopisać save i otworzyc nowy widok z wyborem zawodnikow
                //startActivity(new Intent(MainActivity.this, RidersListActivity.class));

                //openNextActivity();
                break;
            case R.id.button_nextheat:
                Log.d("Sprawdzam button 3,  ", "KLIKNIĘTO NEXT"); //w tym miejscu dopisać save i otworzyc nowy widok z wyborem zawodnikow
                //startActivity(new Intent(MainActivity.this, RidersListActivity.class));

                //openNextActivity();
                break;
            default:
        }
    }

    public void setButtonClickListener_previous() {
        Button mainNext = (Button) findViewById(R.id.button_previousheat);

        View.OnClickListener myClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClickHandler(view);
            }
        };
        mainNext.setOnClickListener(myClickListener);
    }
    public void setButtonClickListener_next() {
        Button mainNext2 = (Button) findViewById(R.id.button_nextheat);

        View.OnClickListener myClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClickHandler(view);
            }
        };
        mainNext2.setOnClickListener(myClickListener);
    }
}
