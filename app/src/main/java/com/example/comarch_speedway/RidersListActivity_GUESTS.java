package com.example.comarch_speedway;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RidersListActivity_GUESTS extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    //DatabaseReference myRef2 = database.getInstance().getReference().child("teams");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final String guestTeamName;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            //Log.d("Sprawdzam button,  ", extras);
            if (extras == null) {
                guestTeamName = null;
            } else {
                guestTeamName = extras.getString("GUEST_STRING");
                Log.d("Przeslany string:  ", guestTeamName);
            }
        } else {
            guestTeamName = (String) savedInstanceState.getSerializable("NULL...");
        }

        DatabaseReference myRef2 = database.getInstance().getReference().child("teams").child(guestTeamName);
        //DatabaseReference myRefjuniorzy = database.getInstance().getReference().child("teams").child(hostTeamName);
        setContentView(R.layout.activity_wybor_zawodnikow_gosci);

        final TextView NazwaZespolu = (TextView) findViewById(R.id.textView9);
        final ImageView teamlogo2 = (ImageView) findViewById(R.id.imageView2);

        final List<String> riders_name_seniorzyijuniorzy = new ArrayList();
        final List<String> riders_name_juniorzy = new ArrayList();

        final Spinner SpinnerRiderNr1 = (Spinner) findViewById(R.id.spinnerNr1);
        final Spinner SpinnerRiderNr2 = (Spinner) findViewById(R.id.spinnerNr2);
        final Spinner SpinnerRiderNr3 = (Spinner) findViewById(R.id.spinnerNr3);
        final Spinner SpinnerRiderNr4 = (Spinner) findViewById(R.id.spinnerNr4);
        final Spinner SpinnerRiderNr5 = (Spinner) findViewById(R.id.spinnerNr5);
        final Spinner SpinnerRiderNr6 = (Spinner) findViewById(R.id.spinnerNr6);
        final Spinner SpinnerRiderNr7 = (Spinner) findViewById(R.id.spinnerNr7);

        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("nie udalo sie, ", "Failed to read value.", error.toException());
            }

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                NazwaZespolu.setText(guestTeamName);
                ///////////////////ustawienie logo druzyny//////////////////
                if (guestTeamName.contains("Ostrów"))
                    teamlogo2.setImageResource(R.drawable.ostrow);
                if (guestTeamName.contains("Rybnik"))
                    teamlogo2.setImageResource(R.drawable.rybnik);
                if (guestTeamName.contains("Gniezno"))
                    teamlogo2.setImageResource(R.drawable.gniezno);
                if (guestTeamName.contains("Gdańsk"))
                    teamlogo2.setImageResource(R.drawable.gdansk);
                if (guestTeamName.contains("Łódź"))
                    teamlogo2.setImageResource(R.drawable.lodz);
                if (guestTeamName.contains("Daugavpils"))
                    teamlogo2.setImageResource(R.drawable.daugavpils);
                if (guestTeamName.contains("Tarnów"))
                    teamlogo2.setImageResource(R.drawable.tarnow);

                //////////////////////////////////////////

                Map<String, Object> map = (Map<String, Object>) dataSnapshot.getValue();
                List<String> riders_name = new ArrayList(map.keySet());
                final List<String> tmp_string = new ArrayList<>(map.keySet());
                for (int i=0; i<riders_name.size(); i++) {
                    System.out.println(riders_name.get(i));
                    //riders_name_seniorzyijuniorzy.add(riders_name.get(i));
                    if (riders_name.get(i).contains("*jr") == true ){
                        tmp_string.add(riders_name.get(i).substring(0, (riders_name.get(i).length()-3)));
                        riders_name_seniorzyijuniorzy.add(tmp_string.get(i).substring(0, (riders_name.get(i).length()-3)));
                        riders_name_juniorzy.add(tmp_string.get(i).substring(0, (riders_name.get(i).length()-3)));
                    }
                    if (riders_name.get(i).contains("*jr") == false ) {
                        riders_name_seniorzyijuniorzy.add(tmp_string.get(i));
                        if (riders_name.get(i).contains("Brak zawodnika") == true )
                            riders_name_juniorzy.add(tmp_string.get(i));
                    }
                }

                ArrayAdapter<String> areasAdapter = new ArrayAdapter<String>(RidersListActivity_GUESTS.this, android.R.layout.simple_spinner_item, riders_name_seniorzyijuniorzy);
                areasAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                SpinnerRiderNr1.setAdapter(areasAdapter);
                SpinnerRiderNr1.setSelection(riders_name_seniorzyijuniorzy.indexOf("Brak zawodnika"));
                SpinnerRiderNr2.setAdapter(areasAdapter);
                SpinnerRiderNr2.setSelection(riders_name_seniorzyijuniorzy.indexOf("Brak zawodnika"));
                SpinnerRiderNr3.setAdapter(areasAdapter);
                SpinnerRiderNr3.setSelection(riders_name_seniorzyijuniorzy.indexOf("Brak zawodnika"));
                SpinnerRiderNr4.setAdapter(areasAdapter);
                SpinnerRiderNr4.setSelection(riders_name_seniorzyijuniorzy.indexOf("Brak zawodnika"));
                SpinnerRiderNr5.setAdapter(areasAdapter);
                SpinnerRiderNr5.setSelection(riders_name_seniorzyijuniorzy.indexOf("Brak zawodnika"));

                ArrayAdapter<String> areasAdapter_jr = new ArrayAdapter<String>(RidersListActivity_GUESTS.this, android.R.layout.simple_spinner_item, riders_name_juniorzy);
                areasAdapter_jr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                SpinnerRiderNr6.setAdapter(areasAdapter_jr);
                SpinnerRiderNr6.setSelection(riders_name_juniorzy.indexOf("Brak zawodnika"));
                SpinnerRiderNr7.setAdapter(areasAdapter_jr);
                SpinnerRiderNr7.setSelection(riders_name_juniorzy.indexOf("Brak zawodnika"));


                SpinnerRiderNr1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        DataContainer.Zawodnik1 = index;
                        Log.d("SpinnerGuest ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
                SpinnerRiderNr2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        DataContainer.Zawodnik2 = index;
                        Log.d("SpinnerGuest ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
                SpinnerRiderNr3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        DataContainer.Zawodnik3 = index;
                        Log.d("SpinnerGuest ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
                SpinnerRiderNr4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        DataContainer.Zawodnik4 = index;
                        Log.d("SpinnerGuest ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
                SpinnerRiderNr5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        DataContainer.Zawodnik5 = index;
                        Log.d("SpinnerGuest ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
                SpinnerRiderNr6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        DataContainer.Zawodnik6 = index;
                        Log.d("SpinnerGuest ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
                SpinnerRiderNr7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        DataContainer.Zawodnik7 = index;
                        Log.d("SpinnerGuest ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
                setButtonClickListener();
            }
            public void myClickHandler (View view){
                switch (view.getId()){
                    case R.id.button:
                        Log.d("Sprawdzam button,  ", "KLIKNIĘTO NEXT"); //w tym miejscu dopisać save i otworzyc nowy widok z wyborem zawodnikow
                        //startActivity(new Intent(MainActivity.this, RidersListActivity.class));
                        openRidersActivity();
                        break;
                    default:
                }
            }

            public void setButtonClickListener(){
                Button mainNext = (Button) findViewById(R.id.button);

                View.OnClickListener myClickListener = new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        myClickHandler(view);
                    }
                };
                mainNext.setOnClickListener(myClickListener);
            }



            public void openRidersActivity(){
                Intent intent = new Intent(RidersListActivity_GUESTS.this, Choose_1or2.class);
                String host_tmp = DataContainer.GuestString;
                intent.putExtra("GUEST_STRING", host_tmp);
                startActivity(intent);
            }
        });
    }
}