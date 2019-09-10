package com.example.comarch_speedway;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SimpleHeat extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_heat_view);

        TextView Bieg = (TextView) findViewById(R.id.text_bieg);
        TextView Numer = (TextView) findViewById(R.id.text_numer);

        String tmp = String.valueOf(DataContainer.nr_biegu);
        Numer.setText(tmp);

        TextView ZawodnikA = (TextView) findViewById(R.id.id_zawodnikA);
        TextView ZawodnikB = (TextView) findViewById(R.id.id_zawodnikB);
        TextView ZawodnikC = (TextView) findViewById(R.id.id_zawodnikC);
        TextView ZawodnikD = (TextView) findViewById(R.id.id_zawodnikD);
        TextView nrA = (TextView) findViewById(R.id.nrA_txt);
        TextView nrB = (TextView) findViewById(R.id.nrB_txt);
        TextView nrC = (TextView) findViewById(R.id.nrC_txt);
        TextView nrD = (TextView) findViewById(R.id.nrD_txt);

        String A = ""; String B = ""; String C = ""; String D = "";

        Button poleA_button = (Button) findViewById(R.id.button5);
        Button poleB_button = (Button) findViewById(R.id.button6);
        Button poleC_button = (Button) findViewById(R.id.button7);
        Button poleD_button = (Button) findViewById(R.id.button8);

        if (DataContainer.zestaw1or2 == true){  //zestaw 1 bieg 1
            if (DataContainer.nr_biegu == 1) {
                poleA_button.setBackgroundResource(R.color.Yellow);
                poleB_button.setBackgroundResource(R.color.Red);
                poleC_button.setBackgroundResource(R.color.White);
                poleD_button.setBackgroundResource(R.color.Blue);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik1));nrA.setText("1");
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik9));nrB.setText("9");
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik2));nrC.setText("2");
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik10));nrD.setText("10");
            }
            if (DataContainer.nr_biegu == 2) {
                poleA_button.setBackgroundResource(R.color.Blue);
                poleB_button.setBackgroundResource(R.color.Yellow);
                poleC_button.setBackgroundResource(R.color.Red);
                poleD_button.setBackgroundResource(R.color.White);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik15));nrA.setText("15");
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik6));nrB.setText("6");
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik14));nrC.setText("14");
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik7));nrD.setText("7");
            }
            if (DataContainer.nr_biegu == 3) {
                poleA_button.setBackgroundResource(R.color.Red);
                poleB_button.setBackgroundResource(R.color.Yellow);
                poleC_button.setBackgroundResource(R.color.Blue);
                poleD_button.setBackgroundResource(R.color.White);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik11));nrA.setText("11");
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik3));nrB.setText("3");
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik12));nrC.setText("12");
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik4));nrD.setText("4");
            }
            if (DataContainer.nr_biegu == 4) {
                poleA_button.setBackgroundResource(R.color.Yellow);
                poleB_button.setBackgroundResource(R.color.Blue);
                poleC_button.setBackgroundResource(R.color.White);
                poleD_button.setBackgroundResource(R.color.Red);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik5));nrA.setText("5");
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik15));nrB.setText("15");
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik7));nrC.setText("7");
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik13));nrD.setText("13");
            }
            if (DataContainer.nr_biegu == 5) {
                poleA_button.setBackgroundResource(R.color.Blue);
                poleB_button.setBackgroundResource(R.color.Yellow);
                poleC_button.setBackgroundResource(R.color.Red);
                poleD_button.setBackgroundResource(R.color.White);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik12));nrA.setText("12");
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik1));nrB.setText("1");
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik11));nrC.setText("11");
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik2));nrD.setText("2");
            }
            if (DataContainer.nr_biegu == 6) {
                poleA_button.setBackgroundResource(R.color.Yellow);
                poleB_button.setBackgroundResource(R.color.Blue);
                poleC_button.setBackgroundResource(R.color.White);
                poleD_button.setBackgroundResource(R.color.Red);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik3));nrA.setText("3");
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik13));nrB.setText("13");
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik4));nrC.setText("4");
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik14));nrD.setText("14");
            }
            if (DataContainer.nr_biegu == 7) {
                poleA_button.setBackgroundResource(R.color.Red);
                poleB_button.setBackgroundResource(R.color.Yellow);
                poleC_button.setBackgroundResource(R.color.Blue);
                poleD_button.setBackgroundResource(R.color.White);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik9));nrA.setText("9");
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik5));nrB.setText("5");
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik10));nrC.setText("10");
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik6));nrD.setText("6");
            }
            if (DataContainer.nr_biegu == 8) {
                poleA_button.setBackgroundResource(R.color.Red);
                poleB_button.setBackgroundResource(R.color.White);
                poleC_button.setBackgroundResource(R.color.Blue);
                poleD_button.setBackgroundResource(R.color.Yellow);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik13));nrA.setText("13");
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik2));nrB.setText("2");
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik15));nrC.setText("15");
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik1));nrD.setText("1");
            }
            if (DataContainer.nr_biegu == 9) {
                poleA_button.setBackgroundResource(R.color.White);
                poleB_button.setBackgroundResource(R.color.Blue);
                poleC_button.setBackgroundResource(R.color.Yellow);
                poleD_button.setBackgroundResource(R.color.Red);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik4));nrA.setText("4");
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik10));nrB.setText("10");
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik3));nrC.setText("3");
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik9));nrD.setText("9");
            }
            if (DataContainer.nr_biegu == 10) {
                poleA_button.setBackgroundResource(R.color.White);
                poleB_button.setBackgroundResource(R.color.Red);
                poleC_button.setBackgroundResource(R.color.Yellow);
                poleD_button.setBackgroundResource(R.color.Blue);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik7));nrA.setText("7");
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik11));nrB.setText("11");
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik5));nrC.setText("5");
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik12));nrD.setText("12");
            }
            if (DataContainer.nr_biegu == 11) {
                poleA_button.setBackgroundResource(R.color.Blue);
                poleB_button.setBackgroundResource(R.color.White);
                poleC_button.setBackgroundResource(R.color.Red);
                poleD_button.setBackgroundResource(R.color.Yellow);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik10));nrA.setText("10");
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik2));nrB.setText("2");
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik13));nrC.setText("13");
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik3));nrD.setText("3");
            }
            if (DataContainer.nr_biegu == 12) {
                poleA_button.setBackgroundResource(R.color.White);
                poleB_button.setBackgroundResource(R.color.Blue);
                poleC_button.setBackgroundResource(R.color.Yellow);
                poleD_button.setBackgroundResource(R.color.Red);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik6));nrA.setText("6");
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik14));nrB.setText("14");
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik1));nrC.setText("1");
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik11));nrD.setText("11");
            }
            if (DataContainer.nr_biegu == 13) {
                poleA_button.setBackgroundResource(R.color.Blue);
                poleB_button.setBackgroundResource(R.color.Yellow);
                poleC_button.setBackgroundResource(R.color.Red);
                poleD_button.setBackgroundResource(R.color.White);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik12));nrA.setText("12");
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik4));nrB.setText("4");
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik9));nrC.setText("9");
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik5));nrD.setText("5");
            }
            if (DataContainer.nr_biegu == 14) {
                poleA_button.setBackgroundResource(R.color.Yellow);
                poleB_button.setBackgroundResource(R.color.Red);
                poleC_button.setBackgroundResource(R.color.White);
                poleD_button.setBackgroundResource(R.color.Blue);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik1));nrA.setText(" ");
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik9));nrB.setText(" ");
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik1));nrC.setText(" ");
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik9));nrD.setText(" ");
            }
            if (DataContainer.nr_biegu == 15) {
                poleA_button.setBackgroundResource(R.color.Red);
                poleB_button.setBackgroundResource(R.color.Yellow);
                poleC_button.setBackgroundResource(R.color.Blue);
                poleD_button.setBackgroundResource(R.color.White);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik9));nrA.setText(" ");
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik1));nrB.setText(" ");
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik9));nrC.setText(" ");
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik1));nrD.setText(" ");
            }
        }
        if (DataContainer.zestaw1or2 == false){ //zestaw 2 bieg 1

            if (DataContainer.nr_biegu == 1) {
                poleA_button.setBackgroundResource(R.color.Red);
                poleB_button.setBackgroundResource(R.color.Yellow);
                poleC_button.setBackgroundResource(R.color.Blue);
                poleD_button.setBackgroundResource(R.color.White);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik9));
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik1));
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik10));
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik2));
            }

            if (DataContainer.nr_biegu == 2) {
                poleA_button.setBackgroundResource(R.color.Yellow);
                poleB_button.setBackgroundResource(R.color.Blue);
                poleC_button.setBackgroundResource(R.color.White);
                poleD_button.setBackgroundResource(R.color.Red);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik6));
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik15));
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik7));
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik14));
            }
            if (DataContainer.nr_biegu == 3) {
                poleA_button.setBackgroundResource(R.color.Yellow);
                poleB_button.setBackgroundResource(R.color.Red);
                poleC_button.setBackgroundResource(R.color.White);
                poleD_button.setBackgroundResource(R.color.Blue);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik3));
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik11));
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik4));
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik12));
            }
            if (DataContainer.nr_biegu == 4) {
                poleA_button.setBackgroundResource(R.color.Blue);
                poleB_button.setBackgroundResource(R.color.Yellow);
                poleC_button.setBackgroundResource(R.color.Red);
                poleD_button.setBackgroundResource(R.color.White);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik15));
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik5));
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik13));
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik7));
            }
            if (DataContainer.nr_biegu == 5) {
                poleA_button.setBackgroundResource(R.color.Yellow);
                poleB_button.setBackgroundResource(R.color.Blue);
                poleC_button.setBackgroundResource(R.color.White);
                poleD_button.setBackgroundResource(R.color.Red);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik1));
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik12));
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik2));
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik11));
            }
            if (DataContainer.nr_biegu == 6) {
                poleA_button.setBackgroundResource(R.color.Red);
                poleB_button.setBackgroundResource(R.color.Yellow);
                poleC_button.setBackgroundResource(R.color.Blue);
                poleD_button.setBackgroundResource(R.color.White);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik13));
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik3));
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik14));
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik4));
            }
            if (DataContainer.nr_biegu == 7) {
                poleA_button.setBackgroundResource(R.color.Yellow);
                poleB_button.setBackgroundResource(R.color.Red);
                poleC_button.setBackgroundResource(R.color.White);
                poleD_button.setBackgroundResource(R.color.Blue);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik5));
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik9));
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik6));
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik10));
            }
            if (DataContainer.nr_biegu == 8) {
                poleA_button.setBackgroundResource(R.color.White);
                poleB_button.setBackgroundResource(R.color.Red);
                poleC_button.setBackgroundResource(R.color.Yellow);
                poleD_button.setBackgroundResource(R.color.Blue);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik2));
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik13));
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik1));
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik15));
            }
            if (DataContainer.nr_biegu == 9) {
                poleA_button.setBackgroundResource(R.color.Blue);
                poleB_button.setBackgroundResource(R.color.White);
                poleC_button.setBackgroundResource(R.color.Red);
                poleD_button.setBackgroundResource(R.color.Yellow);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik10));
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik4));
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik9));
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik3));
            }
            if (DataContainer.nr_biegu == 10) {
                poleA_button.setBackgroundResource(R.color.Red);
                poleB_button.setBackgroundResource(R.color.White);
                poleC_button.setBackgroundResource(R.color.Blue);
                poleD_button.setBackgroundResource(R.color.Yellow);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik11));
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik7));
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik12));
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik5));
            }
            if (DataContainer.nr_biegu == 11) {
                poleA_button.setBackgroundResource(R.color.White);
                poleB_button.setBackgroundResource(R.color.Blue);
                poleC_button.setBackgroundResource(R.color.Yellow);
                poleD_button.setBackgroundResource(R.color.Red);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik2));
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik10));
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik3));
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik13));
            }
            if (DataContainer.nr_biegu == 12) {
                poleA_button.setBackgroundResource(R.color.Blue);
                poleB_button.setBackgroundResource(R.color.White);
                poleC_button.setBackgroundResource(R.color.Red);
                poleD_button.setBackgroundResource(R.color.Yellow);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik14));
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik6));
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik11));
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik1));
            }
            if (DataContainer.nr_biegu == 13) {
                poleA_button.setBackgroundResource(R.color.White);
                poleB_button.setBackgroundResource(R.color.Blue);
                poleC_button.setBackgroundResource(R.color.Yellow);
                poleD_button.setBackgroundResource(R.color.Red);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik4));
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik12));
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik5));
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik9));
            }
            if (DataContainer.nr_biegu == 14) {
                poleA_button.setBackgroundResource(R.color.Red);
                poleB_button.setBackgroundResource(R.color.Yellow);
                poleC_button.setBackgroundResource(R.color.Blue);
                poleD_button.setBackgroundResource(R.color.White);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik9));
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik1));
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik9));
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik1));
            }
            if (DataContainer.nr_biegu == 15) {
                poleA_button.setBackgroundResource(R.color.Yellow);
                poleB_button.setBackgroundResource(R.color.Red);
                poleC_button.setBackgroundResource(R.color.White);
                poleD_button.setBackgroundResource(R.color.Blue);
                ZawodnikA.setText(String.valueOf(DataContainer.Zawodnik1));
                ZawodnikB.setText(String.valueOf(DataContainer.Zawodnik9));
                ZawodnikC.setText(String.valueOf(DataContainer.Zawodnik1));
                ZawodnikD.setText(String.valueOf(DataContainer.Zawodnik9));
            }
        }
        setButtonClickListener_next();
        setButtonClickListener_previous();
        setButtonClickListener_summary();
    }

    public void myClickHandler (View view){
        switch (view.getId()){
            case R.id.button_previousheat:
                if (DataContainer.nr_biegu>1) {
                    DataContainer.nr_biegu = DataContainer.nr_biegu - 1;
                    Log.d("Sprawdza previous,  ", Integer.toString(DataContainer.nr_biegu));
                    Intent intent = new Intent(SimpleHeat.this, SimpleHeat.class);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.button_nextheat:
                if (DataContainer.nr_biegu<15) {
                    DataContainer.nr_biegu = DataContainer.nr_biegu + 1;
                    Log.d("Sprawdzam next,  ", Integer.toString(DataContainer.nr_biegu));
                    Intent intent = new Intent(SimpleHeat.this, SimpleHeat.class);
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.imageButton2:
                Intent intent = new Intent(SimpleHeat.this, TablePoints.class);
                startActivity(intent);
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
    public void setButtonClickListener_summary() {
        ImageButton mainNext_xd = (ImageButton) findViewById(R.id.imageButton2);

        View.OnClickListener myClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myClickHandler(view);
            }
        };
        mainNext_xd.setOnClickListener(myClickListener);
    }
}
