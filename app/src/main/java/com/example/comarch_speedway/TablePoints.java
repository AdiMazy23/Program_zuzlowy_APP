package com.example.comarch_speedway;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TablePoints extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabelawynikow);

        TextView Nazwisko1 = (TextView) findViewById(R.id.nazwisko1_t);
        TextView Nazwisko2 = (TextView) findViewById(R.id.nazwisko2_t);
        TextView Nazwisko3 = (TextView) findViewById(R.id.nazwisko3_t);
        TextView Nazwisko4 = (TextView) findViewById(R.id.nazwisko4_t);
        TextView Nazwisko5 = (TextView) findViewById(R.id.nazwisko5_t);
        TextView Nazwisko6 = (TextView) findViewById(R.id.nazwisko6_t);
        TextView Nazwisko7 = (TextView) findViewById(R.id.nazwisko7_t);

        TextView Nazwisko9 = (TextView) findViewById(R.id.nazwisko9_t);
        TextView Nazwisko10 = (TextView) findViewById(R.id.nazwisko10_t);
        TextView Nazwisko11 = (TextView) findViewById(R.id.nazwisko11_t);
        TextView Nazwisko12 = (TextView) findViewById(R.id.nazwisko12_t);
        TextView Nazwisko13 = (TextView) findViewById(R.id.nazwisko13_t);
        TextView Nazwisko14 = (TextView) findViewById(R.id.nazwisko14_t);
        TextView Nazwisko15 = (TextView) findViewById(R.id.nazwisko15_t);

        //set nezwiska
        Nazwisko1.setText(String.valueOf(DataContainer.Zawodnik1));
        Nazwisko2.setText(String.valueOf(DataContainer.Zawodnik2));
        Nazwisko3.setText(String.valueOf(DataContainer.Zawodnik3));
        Nazwisko4.setText(String.valueOf(DataContainer.Zawodnik4));
        Nazwisko5.setText(String.valueOf(DataContainer.Zawodnik5));
        Nazwisko6.setText(String.valueOf(DataContainer.Zawodnik6));
        Nazwisko7.setText(String.valueOf(DataContainer.Zawodnik7));

        Nazwisko9.setText(String.valueOf(DataContainer.Zawodnik9));
        Nazwisko10.setText(String.valueOf(DataContainer.Zawodnik10));
        Nazwisko11.setText(String.valueOf(DataContainer.Zawodnik11));
        Nazwisko12.setText(String.valueOf(DataContainer.Zawodnik12));
        Nazwisko13.setText(String.valueOf(DataContainer.Zawodnik13));
        Nazwisko14.setText(String.valueOf(DataContainer.Zawodnik14));
        Nazwisko15.setText(String.valueOf(DataContainer.Zawodnik15));

    }

}
