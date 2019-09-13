package com.example.comarch_speedway;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TablePoints extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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


        ////////////////////////

        TextView wynik9_1 = (TextView) findViewById(R.id.wynik9_1);
        TextView wynik9_2 = (TextView) findViewById(R.id.wynik9_2);
        TextView wynik9_3 = (TextView) findViewById(R.id.wynik9_3);
        TextView wynik9_4 = (TextView) findViewById(R.id.wynik9_4);
        TextView wynik9_5 = (TextView) findViewById(R.id.wynik9_5);

        TextView wynik10_1 = (TextView) findViewById(R.id.wynik10_1);
        TextView wynik10_2 = (TextView) findViewById(R.id.wynik10_2);
        TextView wynik10_3 = (TextView) findViewById(R.id.wynik10_3);
        TextView wynik10_4 = (TextView) findViewById(R.id.wynik10_4);
        TextView wynik10_5 = (TextView) findViewById(R.id.wynik10_5);

        TextView wynik11_1 = (TextView) findViewById(R.id.wynik11_1);
        TextView wynik11_2 = (TextView) findViewById(R.id.wynik11_2);
        TextView wynik11_3 = (TextView) findViewById(R.id.wynik11_3);
        TextView wynik11_4 = (TextView) findViewById(R.id.wynik11_4);
        TextView wynik11_5 = (TextView) findViewById(R.id.wynik11_5);

        TextView wynik12_1 = (TextView) findViewById(R.id.wynik12_1);
        TextView wynik12_2 = (TextView) findViewById(R.id.wynik12_2);
        TextView wynik12_3 = (TextView) findViewById(R.id.wynik12_3);
        TextView wynik12_4 = (TextView) findViewById(R.id.wynik12_4);
        TextView wynik12_5 = (TextView) findViewById(R.id.wynik12_5);

        TextView wynik13_1 = (TextView) findViewById(R.id.wynik13_1);
        TextView wynik13_2 = (TextView) findViewById(R.id.wynik13_2);
        TextView wynik13_3 = (TextView) findViewById(R.id.wynik13_3);
        TextView wynik13_4 = (TextView) findViewById(R.id.wynik13_4);
        TextView wynik13_5 = (TextView) findViewById(R.id.wynik13_5);

        TextView wynik14_1 = (TextView) findViewById(R.id.wynik14_1);
        TextView wynik14_2 = (TextView) findViewById(R.id.wynik14_2);
        TextView wynik14_3 = (TextView) findViewById(R.id.wynik14_3);

        TextView wynik15_1 = (TextView) findViewById(R.id.wynik15_1);
        TextView wynik15_2 = (TextView) findViewById(R.id.wynik15_2);
        TextView wynik15_3 = (TextView) findViewById(R.id.wynik15_3);

        //druzyna gosci ponizej

        TextView wynik1_1 = (TextView) findViewById(R.id.wynik1_1);
        TextView wynik1_2 = (TextView) findViewById(R.id.wynik1_2);
        TextView wynik1_3 = (TextView) findViewById(R.id.wynik1_3);
        TextView wynik1_4 = (TextView) findViewById(R.id.wynik1_4);
        TextView wynik1_5 = (TextView) findViewById(R.id.wynik1_5);

        TextView wynik2_1 = (TextView) findViewById(R.id.wynik2_1);
        TextView wynik2_2 = (TextView) findViewById(R.id.wynik2_2);
        TextView wynik2_3 = (TextView) findViewById(R.id.wynik2_3);
        TextView wynik2_4 = (TextView) findViewById(R.id.wynik2_4);
        TextView wynik2_5 = (TextView) findViewById(R.id.wynik2_5);

        TextView wynik3_1 = (TextView) findViewById(R.id.wynik3_1);
        TextView wynik3_2 = (TextView) findViewById(R.id.wynik3_2);
        TextView wynik3_3 = (TextView) findViewById(R.id.wynik3_3);
        TextView wynik3_4 = (TextView) findViewById(R.id.wynik3_4);
        TextView wynik3_5 = (TextView) findViewById(R.id.wynik3_5);

        TextView wynik4_1 = (TextView) findViewById(R.id.wynik4_1);
        TextView wynik4_2 = (TextView) findViewById(R.id.wynik4_2);
        TextView wynik4_3 = (TextView) findViewById(R.id.wynik4_3);
        TextView wynik4_4 = (TextView) findViewById(R.id.wynik4_4);
        TextView wynik4_5 = (TextView) findViewById(R.id.wynik4_5);

        TextView wynik5_1 = (TextView) findViewById(R.id.wynik5_1);
        TextView wynik5_2 = (TextView) findViewById(R.id.wynik5_2);
        TextView wynik5_3 = (TextView) findViewById(R.id.wynik5_3);
        TextView wynik5_4 = (TextView) findViewById(R.id.wynik5_4);
        TextView wynik5_5 = (TextView) findViewById(R.id.wynik5_5);

        TextView wynik6_1 = (TextView) findViewById(R.id.wynik6_1);
        TextView wynik6_2 = (TextView) findViewById(R.id.wynik6_2);
        TextView wynik6_3 = (TextView) findViewById(R.id.wynik6_3);

        TextView wynik7_1 = (TextView) findViewById(R.id.wynik7_1);
        TextView wynik7_2 = (TextView) findViewById(R.id.wynik7_2);
        TextView wynik7_3 = (TextView) findViewById(R.id.wynik7_3);

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

        /////ustaw wartosc punktow

        wynik1_1.setText(DataContainer.wynik1_1);
        wynik1_2.setText(DataContainer.wynik1_2);
        wynik1_3.setText(DataContainer.wynik1_3);
        wynik1_4.setText(DataContainer.wynik1_4);
        wynik1_5.setText(DataContainer.wynik1_5);

        wynik2_1.setText(DataContainer.wynik2_1);
        wynik2_2.setText(DataContainer.wynik2_2);
        wynik2_3.setText(DataContainer.wynik2_3);
        wynik2_4.setText(DataContainer.wynik2_4);
        wynik2_5.setText(DataContainer.wynik2_5);

        wynik3_1.setText(DataContainer.wynik3_1);
        wynik3_2.setText(DataContainer.wynik3_2);
        wynik3_3.setText(DataContainer.wynik3_3);
        wynik3_4.setText(DataContainer.wynik3_4);
        wynik3_5.setText(DataContainer.wynik3_5);

        wynik4_1.setText(DataContainer.wynik4_1);
        wynik4_2.setText(DataContainer.wynik4_2);
        wynik4_3.setText(DataContainer.wynik4_3);
        wynik4_4.setText(DataContainer.wynik4_4);
        wynik4_5.setText(DataContainer.wynik4_5);

        wynik5_1.setText(DataContainer.wynik5_1);
        wynik5_2.setText(DataContainer.wynik5_2);
        wynik5_3.setText(DataContainer.wynik5_3);
        wynik5_4.setText(DataContainer.wynik5_4);
        wynik5_5.setText(DataContainer.wynik5_5);

        wynik6_1.setText(DataContainer.wynik6_1);
        wynik6_2.setText(DataContainer.wynik6_2);
        wynik6_3.setText(DataContainer.wynik6_3);

        wynik7_1.setText(DataContainer.wynik7_1);
        wynik7_2.setText(DataContainer.wynik7_2);
        wynik7_3.setText(DataContainer.wynik7_3);

        ////////////gospodarze pobierz wyniki poszczegolnych biegow
        wynik9_1.setText(DataContainer.wynik9_1);
        wynik9_2.setText(DataContainer.wynik9_2);
        wynik9_3.setText(DataContainer.wynik9_3);
        wynik9_4.setText(DataContainer.wynik9_4);
        wynik9_5.setText(DataContainer.wynik9_5);

        wynik10_1.setText(DataContainer.wynik10_1);
        wynik10_2.setText(DataContainer.wynik10_2);
        wynik10_3.setText(DataContainer.wynik10_3);
        wynik10_4.setText(DataContainer.wynik10_4);
        wynik10_5.setText(DataContainer.wynik10_5);

        wynik11_1.setText(DataContainer.wynik11_1);
        wynik11_2.setText(DataContainer.wynik11_2);
        wynik11_3.setText(DataContainer.wynik11_3);
        wynik11_4.setText(DataContainer.wynik11_4);
        wynik11_5.setText(DataContainer.wynik11_5);

        wynik12_1.setText(DataContainer.wynik12_1);
        wynik12_2.setText(DataContainer.wynik12_2);
        wynik12_3.setText(DataContainer.wynik12_3);
        wynik12_4.setText(DataContainer.wynik12_4);
        wynik12_5.setText(DataContainer.wynik12_5);

        wynik13_1.setText(DataContainer.wynik13_1);
        wynik13_2.setText(DataContainer.wynik13_2);
        wynik13_3.setText(DataContainer.wynik13_3);
        wynik13_4.setText(DataContainer.wynik13_4);
        wynik13_5.setText(DataContainer.wynik13_5);

        wynik14_1.setText(DataContainer.wynik14_1);
        wynik14_2.setText(DataContainer.wynik14_2);
        wynik14_3.setText(DataContainer.wynik14_3);

        wynik15_1.setText(DataContainer.wynik15_1);
        wynik15_2.setText(DataContainer.wynik15_2);
        wynik15_3.setText(DataContainer.wynik15_3);

    }
}
