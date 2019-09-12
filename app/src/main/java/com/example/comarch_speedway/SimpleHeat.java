package com.example.comarch_speedway;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SimpleHeat extends AppCompatActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_heat_view);

        TextView Bieg = (TextView) findViewById(R.id.text_bieg);
        final TextView Numer = (TextView) findViewById(R.id.text_numer);

        String tmp = String.valueOf(DataContainer.nr_biegu);
        Numer.setText(tmp);

        final EditText editText_A = (EditText) findViewById(R.id.editText_A);
        final EditText editText_B = (EditText) findViewById(R.id.editText_B);
        final EditText editText_C = (EditText) findViewById(R.id.editText_C);
        final EditText editText_D = (EditText) findViewById(R.id.editText_D);

        editText_A.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                // you can call or do what you want with your EditText here
                // yourEditText...
                if (DataContainer.zestaw1or2 == true) {
                    switch (DataContainer.nr_biegu) {
                        case 1:
                            DataContainer.wynik1_1 = editText_A.getText().toString();
                            break;
                        case 2:
                            DataContainer.wynik15_1 = editText_A.getText().toString();
                            break;
                        case 3:
                            DataContainer.wynik11_1 = editText_A.getText().toString();
                            break;
                        case 4:
                            DataContainer.wynik5_1 = editText_A.getText().toString();
                            break;
                        case 5:
                            DataContainer.wynik12_2 = editText_A.getText().toString();
                            break;
                        case 6:
                            DataContainer.wynik3_2 = editText_A.getText().toString();
                            break;
                        case 7:
                            DataContainer.wynik9_2 = editText_A.getText().toString();
                            break;
                        case 8:
                            DataContainer.wynik13_3 = editText_A.getText().toString();
                            break;
                        case 9:
                            DataContainer.wynik4_3 = editText_A.getText().toString();
                            break;
                        case 10:
                            DataContainer.wynik7_3 = editText_A.getText().toString();
                            break;
                        case 11:
                            DataContainer.wynik10_4 = editText_A.getText().toString();
                            break;
                        case 12:
                            DataContainer.wynik6_3 = editText_A.getText().toString();
                            break;
                        case 13:
                            DataContainer.wynik12_4 = editText_A.getText().toString();
                            break;
                    }
                }
                if (DataContainer.zestaw1or2 == false) {
                    switch (DataContainer.nr_biegu) {
                        case 1:
                            DataContainer.wynik9_1 = editText_A.getText().toString();
                            break;
                        case 2:
                            DataContainer.wynik6_1 = editText_A.getText().toString();
                            break;
                        case 3:
                            DataContainer.wynik3_1 = editText_A.getText().toString();
                            break;
                        case 4:
                            DataContainer.wynik15_2 = editText_A.getText().toString();
                            break;
                        case 5:
                            DataContainer.wynik2_2 = editText_A.getText().toString();
                            break;
                        case 6:
                            DataContainer.wynik13_2 = editText_A.getText().toString();
                            break;
                        case 7:
                            DataContainer.wynik5_2 = editText_A.getText().toString();
                            break;
                        case 8:
                            DataContainer.wynik2_3 = editText_A.getText().toString();
                            break;
                        case 9:
                            DataContainer.wynik10_3 = editText_A.getText().toString();
                            break;
                        case 10:
                            DataContainer.wynik11_3 = editText_A.getText().toString();
                            break;
                        case 11:
                            DataContainer.wynik2_4 = editText_A.getText().toString();
                            break;
                        case 12:
                            DataContainer.wynik14_3 = editText_A.getText().toString();
                            break;
                        case 13:
                            DataContainer.wynik4_4 = editText_A.getText().toString();
                            break;
                    }
                }
                Log.d("Sprawdzam keys, ", "Zmieniono tekst"); //działa elegancko
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });
        editText_B.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                // you can call or do what you want with your EditText here
                // yourEditText...
                if (DataContainer.zestaw1or2 == true) {
                    switch (DataContainer.nr_biegu) {
                        case 1:
                            DataContainer.wynik9_1 = editText_B.getText().toString();
                            break;
                        case 2:
                            DataContainer.wynik6_1 = editText_B.getText().toString();
                            break;
                        case 3:
                            DataContainer.wynik3_1 = editText_B.getText().toString();
                            break;
                        case 4:
                            DataContainer.wynik15_2 = editText_B.getText().toString();
                            break;
                        case 5:
                            DataContainer.wynik2_2 = editText_B.getText().toString();
                            break;
                        case 6:
                            DataContainer.wynik13_2 = editText_B.getText().toString();
                            break;
                        case 7:
                            DataContainer.wynik5_2 = editText_B.getText().toString();
                            break;
                        case 8:
                            DataContainer.wynik2_3 = editText_B.getText().toString();
                            break;
                        case 9:
                            DataContainer.wynik10_3 = editText_B.getText().toString();
                            break;
                        case 10:
                            DataContainer.wynik11_3 = editText_B.getText().toString();
                            break;
                        case 11:
                            DataContainer.wynik2_4 = editText_B.getText().toString();
                            break;
                        case 12:
                            DataContainer.wynik14_3 = editText_B.getText().toString();
                            break;
                        case 13:
                            DataContainer.wynik4_4 = editText_B.getText().toString();
                            break;
                    }
                }
                if (DataContainer.zestaw1or2 == false) {
                    switch (DataContainer.nr_biegu) {
                        case 1:
                            DataContainer.wynik1_1 = editText_B.getText().toString();
                            break;
                        case 2:
                            DataContainer.wynik15_1 = editText_B.getText().toString();
                            break;
                        case 3:
                            DataContainer.wynik11_1 = editText_B.getText().toString();
                            break;
                        case 4:
                            DataContainer.wynik5_1 = editText_B.getText().toString();
                            break;
                        case 5:
                            DataContainer.wynik12_2 = editText_B.getText().toString();
                            break;
                        case 6:
                            DataContainer.wynik3_2 = editText_B.getText().toString();
                            break;
                        case 7:
                            DataContainer.wynik9_2 = editText_B.getText().toString();
                            break;
                        case 8:
                            DataContainer.wynik13_3 = editText_B.getText().toString();
                            break;
                        case 9:
                            DataContainer.wynik4_3 = editText_B.getText().toString();
                            break;
                        case 10:
                            DataContainer.wynik7_3 = editText_B.getText().toString();
                            break;
                        case 11:
                            DataContainer.wynik10_4 = editText_B.getText().toString();
                            break;
                        case 12:
                            DataContainer.wynik6_3 = editText_B.getText().toString();
                            break;
                        case 13:
                            DataContainer.wynik12_4 = editText_B.getText().toString();
                            break;
                    }
                }

            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });
        editText_C.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                // you can call or do what you want with your EditText here
                // yourEditText...
                if (DataContainer.zestaw1or2 == true) {
                    switch (DataContainer.nr_biegu) {
                        case 1:
                            DataContainer.wynik2_1 = editText_C.getText().toString();
                            break;
                        case 2:
                            DataContainer.wynik14_1 = editText_C.getText().toString();
                            break;
                        case 3:
                            DataContainer.wynik12_1 = editText_C.getText().toString();
                            break;
                        case 4:
                            DataContainer.wynik7_2 = editText_C.getText().toString();
                            break;
                        case 5:
                            DataContainer.wynik11_2 = editText_C.getText().toString();
                            break;
                        case 6:
                            DataContainer.wynik4_2 = editText_C.getText().toString();
                            break;
                        case 7:
                            DataContainer.wynik10_2 = editText_C.getText().toString();
                            break;
                        case 8:
                            DataContainer.wynik15_3 = editText_C.getText().toString();
                            break;
                        case 9:
                            DataContainer.wynik3_3 = editText_C.getText().toString();
                            break;
                        case 10:
                            DataContainer.wynik5_3 = editText_C.getText().toString();
                            break;
                        case 11:
                            DataContainer.wynik13_4 = editText_C.getText().toString();
                            break;
                        case 12:
                            DataContainer.wynik1_4 = editText_C.getText().toString();
                            break;
                        case 13:
                            DataContainer.wynik9_4 = editText_C.getText().toString();
                            break;
                    }
                }
                if (DataContainer.zestaw1or2 == false) {
                    switch (DataContainer.nr_biegu) {
                        case 1:
                            DataContainer.wynik10_1 = editText_C.getText().toString();
                            break;
                        case 2:
                            DataContainer.wynik7_1 = editText_C.getText().toString();
                            break;
                        case 3:
                            DataContainer.wynik4_1 = editText_C.getText().toString();
                            break;
                        case 4:
                            DataContainer.wynik5_1 = editText_C.getText().toString();
                            break;
                        case 5:
                            DataContainer.wynik2_2 = editText_C.getText().toString();
                            break;
                        case 6:
                            DataContainer.wynik14_2 = editText_C.getText().toString();
                            break;
                        case 7:
                            DataContainer.wynik6_2 = editText_C.getText().toString();
                            break;
                        case 8:
                            DataContainer.wynik1_3 = editText_C.getText().toString();
                            break;
                        case 9:
                            DataContainer.wynik9_3 = editText_C.getText().toString();
                            break;
                        case 10:
                            DataContainer.wynik12_3 = editText_C.getText().toString();
                            break;
                        case 11:
                            DataContainer.wynik3_4 = editText_C.getText().toString();
                            break;
                        case 12:
                            DataContainer.wynik11_3 = editText_C.getText().toString();
                            break;
                        case 13:
                            DataContainer.wynik5_4 = editText_C.getText().toString();
                            break;
                    }
                }
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });
        editText_D.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                // you can call or do what you want with your EditText here
                // yourEditText...
                if (DataContainer.zestaw1or2 == true) {
                    switch (DataContainer.nr_biegu) {
                        case 1:
                            DataContainer.wynik10_1 = editText_D.getText().toString();
                            break;
                        case 2:
                            DataContainer.wynik7_1 = editText_D.getText().toString();
                            break;
                        case 3:
                            DataContainer.wynik4_1 = editText_D.getText().toString();
                            break;
                        case 4:
                            DataContainer.wynik5_1 = editText_D.getText().toString();
                            break;
                        case 5:
                            DataContainer.wynik2_2 = editText_D.getText().toString();
                            break;
                        case 6:
                            DataContainer.wynik14_2 = editText_D.getText().toString();
                            break;
                        case 7:
                            DataContainer.wynik6_2 = editText_D.getText().toString();
                            break;
                        case 8:
                            DataContainer.wynik1_3 = editText_D.getText().toString();
                            break;
                        case 9:
                            DataContainer.wynik9_3 = editText_D.getText().toString();
                            break;
                        case 10:
                            DataContainer.wynik12_3 = editText_D.getText().toString();
                            break;
                        case 11:
                            DataContainer.wynik3_4 = editText_D.getText().toString();
                            break;
                        case 12:
                            DataContainer.wynik11_3 = editText_D.getText().toString();
                            break;
                        case 13:
                            DataContainer.wynik5_4 = editText_D.getText().toString();
                            break;
                    }
                }
                if (DataContainer.zestaw1or2 == true){
                    switch (DataContainer.nr_biegu) {
                        case 1:
                            DataContainer.wynik2_1 = editText_D.getText().toString();
                            break;
                        case 2:
                            DataContainer.wynik14_1 = editText_D.getText().toString();
                            break;
                        case 3:
                            DataContainer.wynik12_1 = editText_D.getText().toString();
                            break;
                        case 4:
                            DataContainer.wynik7_2 = editText_D.getText().toString();
                            break;
                        case 5:
                            DataContainer.wynik11_2 = editText_D.getText().toString();
                            break;
                        case 6:
                            DataContainer.wynik4_2 = editText_D.getText().toString();
                            break;
                        case 7:
                            DataContainer.wynik10_2 = editText_D.getText().toString();
                            break;
                        case 8:
                            DataContainer.wynik15_3 = editText_D.getText().toString();
                            break;
                        case 9:
                            DataContainer.wynik3_3 = editText_D.getText().toString();
                            break;
                        case 10:
                            DataContainer.wynik5_3 = editText_D.getText().toString();
                            break;
                        case 11:
                            DataContainer.wynik13_4 = editText_D.getText().toString();
                            break;
                        case 12:
                            DataContainer.wynik1_4 = editText_D.getText().toString();
                            break;
                        case 13:
                            DataContainer.wynik9_4 = editText_D.getText().toString();
                            break;
                    }
                }
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });


        final Spinner SpinnerA = (Spinner) findViewById(R.id.spinner_A);
        final Spinner SpinnerB = (Spinner) findViewById(R.id.spinner_B);
        final Spinner SpinnerC = (Spinner) findViewById(R.id.spinner_C);
        final Spinner SpinnerD = (Spinner) findViewById(R.id.spinner_D);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef2 = database.getInstance().getReference().child("teams");

        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

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



        SpinnerD.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                String index = arg0.getSelectedItem().toString();

                Log.d("SpinnerHost ", "Wybrales sobie na spinnerze:  " + index);
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });

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
                ObliczSumePkt();
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
    public void ObliczSumePkt(){
        if (DataContainer.wynik1_1 == "1" || DataContainer.wynik1_1 == "2" || DataContainer.wynik1_1 == "3")
            DataContainer.suma_pkt_zawodnik1 = DataContainer.suma_pkt_zawodnik1+Integer.valueOf(DataContainer.wynik1_1);
        if (DataContainer.wynik1_2 == "1" || DataContainer.wynik1_2 == "2" || DataContainer.wynik1_2 == "3")
            DataContainer.suma_pkt_zawodnik1 = DataContainer.suma_pkt_zawodnik1+Integer.valueOf(DataContainer.wynik1_2);
        if (DataContainer.wynik1_3 == "1" || DataContainer.wynik1_3 == "2" || DataContainer.wynik1_3 == "3")
            DataContainer.suma_pkt_zawodnik1 = DataContainer.suma_pkt_zawodnik1+Integer.valueOf(DataContainer.wynik1_3);
        if (DataContainer.wynik1_4 == "1" || DataContainer.wynik1_4 == "2" || DataContainer.wynik1_4 == "3")
            DataContainer.suma_pkt_zawodnik1 = DataContainer.suma_pkt_zawodnik1+Integer.valueOf(DataContainer.wynik1_4);
        if (DataContainer.wynik1_5 == "1" || DataContainer.wynik1_5 == "2" || DataContainer.wynik1_5 == "3")
            DataContainer.suma_pkt_zawodnik1 = DataContainer.suma_pkt_zawodnik1+Integer.valueOf(DataContainer.wynik1_5);
        if (DataContainer.wynik2_1 == "1" || DataContainer.wynik2_1 == "2" || DataContainer.wynik2_1 == "3")
            DataContainer.suma_pkt_zawodnik2 = DataContainer.suma_pkt_zawodnik2+Integer.valueOf(DataContainer.wynik2_1);
        if (DataContainer.wynik2_2 == "1" || DataContainer.wynik2_2 == "2" || DataContainer.wynik2_2 == "3")
            DataContainer.suma_pkt_zawodnik2 = DataContainer.suma_pkt_zawodnik2+Integer.valueOf(DataContainer.wynik2_2);
        if (DataContainer.wynik2_3 == "1" || DataContainer.wynik2_3 == "2" || DataContainer.wynik2_3 == "3")
            DataContainer.suma_pkt_zawodnik2 = DataContainer.suma_pkt_zawodnik2+Integer.valueOf(DataContainer.wynik2_3);
        if (DataContainer.wynik2_4 == "1" || DataContainer.wynik2_4 == "2" || DataContainer.wynik2_4 == "3")
            DataContainer.suma_pkt_zawodnik2 = DataContainer.suma_pkt_zawodnik2+Integer.valueOf(DataContainer.wynik2_4);
        if (DataContainer.wynik2_5 == "1" || DataContainer.wynik2_5 == "2" || DataContainer.wynik2_5 == "3")
            DataContainer.suma_pkt_zawodnik2 = DataContainer.suma_pkt_zawodnik2+Integer.valueOf(DataContainer.wynik2_5);
        if (DataContainer.wynik3_1 == "1" || DataContainer.wynik3_1 == "2" || DataContainer.wynik3_1 == "3")
            DataContainer.suma_pkt_zawodnik3 = DataContainer.suma_pkt_zawodnik3+Integer.valueOf(DataContainer.wynik3_1);
        if (DataContainer.wynik3_2 == "1" || DataContainer.wynik3_2 == "2" || DataContainer.wynik3_2 == "3")
            DataContainer.suma_pkt_zawodnik3 = DataContainer.suma_pkt_zawodnik3+Integer.valueOf(DataContainer.wynik3_2);
        if (DataContainer.wynik3_3 == "1" || DataContainer.wynik3_3 == "2" || DataContainer.wynik3_3 == "3")
            DataContainer.suma_pkt_zawodnik3 = DataContainer.suma_pkt_zawodnik3+Integer.valueOf(DataContainer.wynik3_3);
        if (DataContainer.wynik3_4 == "1" || DataContainer.wynik3_4 == "2" || DataContainer.wynik3_4 == "3")
            DataContainer.suma_pkt_zawodnik3 = DataContainer.suma_pkt_zawodnik3+Integer.valueOf(DataContainer.wynik3_4);
        if (DataContainer.wynik3_5 == "1" || DataContainer.wynik3_5 == "2" || DataContainer.wynik3_5 == "3")
            DataContainer.suma_pkt_zawodnik3 = DataContainer.suma_pkt_zawodnik3+Integer.valueOf(DataContainer.wynik3_5);
        if (DataContainer.wynik4_1 == "1" || DataContainer.wynik4_1 == "2" || DataContainer.wynik4_1 == "3")
            DataContainer.suma_pkt_zawodnik4 = DataContainer.suma_pkt_zawodnik4+Integer.valueOf(DataContainer.wynik4_1);
        if (DataContainer.wynik4_2 == "1" || DataContainer.wynik4_2 == "2" || DataContainer.wynik4_2 == "3")
            DataContainer.suma_pkt_zawodnik4 = DataContainer.suma_pkt_zawodnik4+Integer.valueOf(DataContainer.wynik4_2);
        if (DataContainer.wynik4_3 == "1" || DataContainer.wynik4_3 == "2" || DataContainer.wynik4_3 == "3")
            DataContainer.suma_pkt_zawodnik4 = DataContainer.suma_pkt_zawodnik4+Integer.valueOf(DataContainer.wynik4_3);
        if (DataContainer.wynik4_4 == "1" || DataContainer.wynik4_4 == "2" || DataContainer.wynik4_4 == "3")
            DataContainer.suma_pkt_zawodnik4 = DataContainer.suma_pkt_zawodnik4+Integer.valueOf(DataContainer.wynik4_4);
        if (DataContainer.wynik4_5 == "1" || DataContainer.wynik4_5 == "2" || DataContainer.wynik4_5 == "3")
            DataContainer.suma_pkt_zawodnik4 = DataContainer.suma_pkt_zawodnik4+Integer.valueOf(DataContainer.wynik4_5);
        if (DataContainer.wynik5_1 == "1" || DataContainer.wynik5_1 == "2" || DataContainer.wynik5_1 == "3")
            DataContainer.suma_pkt_zawodnik5 = DataContainer.suma_pkt_zawodnik5+Integer.valueOf(DataContainer.wynik5_1);
        if (DataContainer.wynik5_2 == "1" || DataContainer.wynik5_2 == "2" || DataContainer.wynik5_2 == "3")
            DataContainer.suma_pkt_zawodnik5 = DataContainer.suma_pkt_zawodnik5+Integer.valueOf(DataContainer.wynik5_2);
        if (DataContainer.wynik5_3 == "1" || DataContainer.wynik5_3 == "2" || DataContainer.wynik5_3 == "3")
            DataContainer.suma_pkt_zawodnik5 = DataContainer.suma_pkt_zawodnik5+Integer.valueOf(DataContainer.wynik5_3);
        if (DataContainer.wynik5_4 == "1" || DataContainer.wynik5_4 == "2" || DataContainer.wynik5_4 == "3")
            DataContainer.suma_pkt_zawodnik5 = DataContainer.suma_pkt_zawodnik5+Integer.valueOf(DataContainer.wynik5_4);
        if (DataContainer.wynik5_5 == "1" || DataContainer.wynik5_5 == "2" || DataContainer.wynik5_5 == "3")
            DataContainer.suma_pkt_zawodnik5 = DataContainer.suma_pkt_zawodnik5+Integer.valueOf(DataContainer.wynik5_5);
        if (DataContainer.wynik6_1 == "1" || DataContainer.wynik6_1 == "2" || DataContainer.wynik6_1 == "3")
            DataContainer.suma_pkt_zawodnik6 = DataContainer.suma_pkt_zawodnik6+Integer.valueOf(DataContainer.wynik6_1);
        if (DataContainer.wynik6_2 == "1" || DataContainer.wynik6_2 == "2" || DataContainer.wynik6_2 == "3")
            DataContainer.suma_pkt_zawodnik6 = DataContainer.suma_pkt_zawodnik6+Integer.valueOf(DataContainer.wynik6_2);
        if (DataContainer.wynik6_3 == "1" || DataContainer.wynik6_3 == "2" || DataContainer.wynik6_3 == "3")
            DataContainer.suma_pkt_zawodnik6 = DataContainer.suma_pkt_zawodnik6+Integer.valueOf(DataContainer.wynik6_3);
        if (DataContainer.wynik7_1 == "1" || DataContainer.wynik7_1 == "2" || DataContainer.wynik7_1 == "3")
            DataContainer.suma_pkt_zawodnik7 = DataContainer.suma_pkt_zawodnik7+Integer.valueOf(DataContainer.wynik7_1);
        if (DataContainer.wynik7_2 == "1" || DataContainer.wynik7_2 == "2" || DataContainer.wynik7_2 == "3")
            DataContainer.suma_pkt_zawodnik7 = DataContainer.suma_pkt_zawodnik7+Integer.valueOf(DataContainer.wynik7_2);
        if (DataContainer.wynik7_3 == "1" || DataContainer.wynik7_3 == "2" || DataContainer.wynik7_3 == "3")
            if (DataContainer.wynik9_1 == "1" || DataContainer.wynik9_1 == "2" || DataContainer.wynik9_1 == "3")
                DataContainer.suma_pkt_zawodnik9 = DataContainer.suma_pkt_zawodnik9+Integer.valueOf(DataContainer.wynik9_1);
        if (DataContainer.wynik9_2 == "1" || DataContainer.wynik9_2 == "2" || DataContainer.wynik9_2 == "3")
            DataContainer.suma_pkt_zawodnik9 = DataContainer.suma_pkt_zawodnik9+Integer.valueOf(DataContainer.wynik9_2);
        if (DataContainer.wynik9_3 == "1" || DataContainer.wynik9_3 == "2" || DataContainer.wynik9_3 == "3")
            DataContainer.suma_pkt_zawodnik9 = DataContainer.suma_pkt_zawodnik9+Integer.valueOf(DataContainer.wynik9_3);
        if (DataContainer.wynik9_4 == "1" || DataContainer.wynik9_4 == "2" || DataContainer.wynik9_4 == "3")
            DataContainer.suma_pkt_zawodnik9 = DataContainer.suma_pkt_zawodnik9+Integer.valueOf(DataContainer.wynik9_4);
        if (DataContainer.wynik9_5 == "1" || DataContainer.wynik9_5 == "2" || DataContainer.wynik9_5 == "3")
            DataContainer.suma_pkt_zawodnik9 = DataContainer.suma_pkt_zawodnik9+Integer.valueOf(DataContainer.wynik9_5);
        if (DataContainer.wynik10_1 == "1" || DataContainer.wynik10_1 == "2" || DataContainer.wynik10_1 == "3")
            DataContainer.suma_pkt_zawodnik10 = DataContainer.suma_pkt_zawodnik10+Integer.valueOf(DataContainer.wynik10_1);
        if (DataContainer.wynik10_2 == "1" || DataContainer.wynik10_2 == "2" || DataContainer.wynik10_2 == "3")
            DataContainer.suma_pkt_zawodnik10 = DataContainer.suma_pkt_zawodnik10+Integer.valueOf(DataContainer.wynik10_2);
        if (DataContainer.wynik10_3 == "1" || DataContainer.wynik10_3 == "2" || DataContainer.wynik10_3 == "3")
            DataContainer.suma_pkt_zawodnik10 = DataContainer.suma_pkt_zawodnik10+Integer.valueOf(DataContainer.wynik10_3);
        if (DataContainer.wynik10_4 == "1" || DataContainer.wynik10_4 == "2" || DataContainer.wynik10_4 == "3")
            DataContainer.suma_pkt_zawodnik10 = DataContainer.suma_pkt_zawodnik10+Integer.valueOf(DataContainer.wynik10_4);
        if (DataContainer.wynik10_5 == "1" || DataContainer.wynik10_5 == "2" || DataContainer.wynik10_5 == "3")
            DataContainer.suma_pkt_zawodnik10 = DataContainer.suma_pkt_zawodnik10+Integer.valueOf(DataContainer.wynik10_5);
        if (DataContainer.wynik11_1 == "1" || DataContainer.wynik11_1 == "2" || DataContainer.wynik11_1 == "3")
            DataContainer.suma_pkt_zawodnik11 = DataContainer.suma_pkt_zawodnik11+Integer.valueOf(DataContainer.wynik11_1);
        if (DataContainer.wynik11_2 == "1" || DataContainer.wynik11_2 == "2" || DataContainer.wynik11_2 == "3")
            DataContainer.suma_pkt_zawodnik11 = DataContainer.suma_pkt_zawodnik11+Integer.valueOf(DataContainer.wynik11_2);
        if (DataContainer.wynik11_3 == "1" || DataContainer.wynik11_3 == "2" || DataContainer.wynik11_3 == "3")
            DataContainer.suma_pkt_zawodnik11 = DataContainer.suma_pkt_zawodnik11+Integer.valueOf(DataContainer.wynik11_3);
        if (DataContainer.wynik11_4 == "1" || DataContainer.wynik11_4 == "2" || DataContainer.wynik11_4 == "3")
            DataContainer.suma_pkt_zawodnik11 = DataContainer.suma_pkt_zawodnik11+Integer.valueOf(DataContainer.wynik11_4);
        if (DataContainer.wynik11_5 == "1" || DataContainer.wynik11_5 == "2" || DataContainer.wynik11_5 == "3")
            DataContainer.suma_pkt_zawodnik11 = DataContainer.suma_pkt_zawodnik11+Integer.valueOf(DataContainer.wynik11_5);
        if (DataContainer.wynik12_1 == "1" || DataContainer.wynik12_1 == "2" || DataContainer.wynik12_1 == "3")
            DataContainer.suma_pkt_zawodnik12 = DataContainer.suma_pkt_zawodnik12+Integer.valueOf(DataContainer.wynik12_1);
        if (DataContainer.wynik12_2 == "1" || DataContainer.wynik12_2 == "2" || DataContainer.wynik12_2 == "3")
            DataContainer.suma_pkt_zawodnik12 = DataContainer.suma_pkt_zawodnik12+Integer.valueOf(DataContainer.wynik12_2);
        if (DataContainer.wynik12_3 == "1" || DataContainer.wynik12_3 == "2" || DataContainer.wynik12_3 == "3")
            DataContainer.suma_pkt_zawodnik12 = DataContainer.suma_pkt_zawodnik12+Integer.valueOf(DataContainer.wynik12_3);
        if (DataContainer.wynik12_4 == "1" || DataContainer.wynik12_4 == "2" || DataContainer.wynik12_4 == "3")
            DataContainer.suma_pkt_zawodnik12 = DataContainer.suma_pkt_zawodnik12+Integer.valueOf(DataContainer.wynik12_4);
        if (DataContainer.wynik12_5 == "1" || DataContainer.wynik12_5 == "2" || DataContainer.wynik12_5 == "3")
            DataContainer.suma_pkt_zawodnik12 = DataContainer.suma_pkt_zawodnik12+Integer.valueOf(DataContainer.wynik12_5);
        if (DataContainer.wynik13_1 == "1" || DataContainer.wynik13_1 == "2" || DataContainer.wynik13_1 == "3")
            DataContainer.suma_pkt_zawodnik13 = DataContainer.suma_pkt_zawodnik13+Integer.valueOf(DataContainer.wynik13_1);
        if (DataContainer.wynik13_2 == "1" || DataContainer.wynik13_2 == "2" || DataContainer.wynik13_2 == "3")
            DataContainer.suma_pkt_zawodnik13 = DataContainer.suma_pkt_zawodnik13+Integer.valueOf(DataContainer.wynik13_2);
        if (DataContainer.wynik13_3 == "1" || DataContainer.wynik13_3 == "2" || DataContainer.wynik13_3 == "3")
            DataContainer.suma_pkt_zawodnik13 = DataContainer.suma_pkt_zawodnik13+Integer.valueOf(DataContainer.wynik13_3);
        if (DataContainer.wynik13_4 == "1" || DataContainer.wynik13_4 == "2" || DataContainer.wynik13_4 == "3")
            DataContainer.suma_pkt_zawodnik13 = DataContainer.suma_pkt_zawodnik13+Integer.valueOf(DataContainer.wynik13_4);
        if (DataContainer.wynik13_5 == "1" || DataContainer.wynik13_5 == "2" || DataContainer.wynik13_5 == "3")
            DataContainer.suma_pkt_zawodnik13 = DataContainer.suma_pkt_zawodnik13+Integer.valueOf(DataContainer.wynik13_5);
        if (DataContainer.wynik14_1 == "1" || DataContainer.wynik14_1 == "2" || DataContainer.wynik14_1 == "3")
            DataContainer.suma_pkt_zawodnik14 = DataContainer.suma_pkt_zawodnik14+Integer.valueOf(DataContainer.wynik14_1);
        if (DataContainer.wynik14_2 == "1" || DataContainer.wynik14_2 == "2" || DataContainer.wynik14_2 == "3")
            DataContainer.suma_pkt_zawodnik14 = DataContainer.suma_pkt_zawodnik14+Integer.valueOf(DataContainer.wynik14_2);
        if (DataContainer.wynik14_3 == "1" || DataContainer.wynik14_3 == "2" || DataContainer.wynik14_3 == "3")
            DataContainer.suma_pkt_zawodnik14 = DataContainer.suma_pkt_zawodnik14+Integer.valueOf(DataContainer.wynik14_3);
        if (DataContainer.wynik15_1 == "1" || DataContainer.wynik15_1 == "2" || DataContainer.wynik15_1 == "3")
            DataContainer.suma_pkt_zawodnik15 = DataContainer.suma_pkt_zawodnik15+Integer.valueOf(DataContainer.wynik15_1);
        if (DataContainer.wynik15_2 == "1" || DataContainer.wynik15_2 == "2" || DataContainer.wynik15_2 == "3")
            DataContainer.suma_pkt_zawodnik15 = DataContainer.suma_pkt_zawodnik15+Integer.valueOf(DataContainer.wynik15_2);
        if (DataContainer.wynik15_3 == "1" || DataContainer.wynik15_3 == "2" || DataContainer.wynik15_3 == "3")
            DataContainer.suma_pkt_zawodnik15 = DataContainer.suma_pkt_zawodnik15+Integer.valueOf(DataContainer.wynik15_3);

        Log.d("Sprawdzam keys, ", "punkty 15: " + DataContainer.suma_pkt_zawodnik15); //działa elegancko (nazwy klubów)
    }
}

