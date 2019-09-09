package com.example.comarch_speedway;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SimpleHeat extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
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

        //if (DataContainer.zestaw1or2 == true){  //zestaw 1 bieg 1
            poleA_button.setBackgroundResource(R.color.Yellow);
            poleB_button.setBackgroundResource(R.color.Red);
            poleC_button.setBackgroundResource(R.color.White);
            poleD_button.setBackgroundResource(R.color.Blue);


        //}
        if (DataContainer.zestaw1or2 == false){ //zestaw 2 bieg 1
            poleA_button.setBackgroundResource(R.color.Red);
            poleB_button.setBackgroundResource(R.color.Yellow);
            poleC_button.setBackgroundResource(R.color.Blue);
            poleD_button.setBackgroundResource(R.color.White);

        }



    }
}
