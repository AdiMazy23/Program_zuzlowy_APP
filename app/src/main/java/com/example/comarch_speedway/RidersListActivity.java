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

public class RidersListActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    //DatabaseReference myRef2 = database.getInstance().getReference().child("teams");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final String hostTeamName;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            //Log.d("Sprawdzam button,  ", extras);
            if (extras == null) {
                hostTeamName = null;
            } else {
                hostTeamName = extras.getString("HOST_STRING");
                Log.d("Przeslany string:  ", hostTeamName);
            }
        } else {
            hostTeamName = (String) savedInstanceState.getSerializable("NULL...");
        }
        DatabaseReference myRef2 = database.getInstance().getReference().child("teams").child(hostTeamName);
        //DatabaseReference myRefjuniorzy = database.getInstance().getReference().child("teams").child(hostTeamName);
        setContentView(R.layout.activity_wybor_zawodnikow_gospodarzy);

        final TextView NazwaZespolu = (TextView) findViewById(R.id.textView9);
        final ImageView teamlogo = (ImageView) findViewById(R.id.imageView);
        final List<String> riders_name_seniorzyijuniorzy = new ArrayList();
        final List<String> riders_name_juniorzy = new ArrayList();

        final Spinner SpinnerRiderNr9 = (Spinner) findViewById(R.id.spinnerNr1);
        final Spinner SpinnerRiderNr10 = (Spinner) findViewById(R.id.spinnerNr2);
        final Spinner SpinnerRiderNr11 = (Spinner) findViewById(R.id.spinnerNr3);
        final Spinner SpinnerRiderNr12 = (Spinner) findViewById(R.id.spinnerNr4);
        final Spinner SpinnerRiderNr13 = (Spinner) findViewById(R.id.spinnerNr5);
        final Spinner SpinnerRiderNr14 = (Spinner) findViewById(R.id.spinnerNr6);
        final Spinner SpinnerRiderNr15 = (Spinner) findViewById(R.id.spinnerNr7);

        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("nie udalo sie, ", "Failed to read value.", error.toException());
            }

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                NazwaZespolu.setText(hostTeamName);
                ///////////////////ustawienie logo druzyny//////////////////
                if (hostTeamName.contains("Ostrów"))
                    teamlogo.setImageResource(R.drawable.ostrow);
                if (hostTeamName.contains("Rybnki"))
                    teamlogo.setImageResource(R.drawable.rybnik);
                if (hostTeamName.contains("Gniezno"))
                    teamlogo.setImageResource(R.drawable.gniezno);
                if (hostTeamName.contains("Gdańsk"))
                    teamlogo.setImageResource(R.drawable.gdansk);
                if (hostTeamName.contains("Łódź"))
                    teamlogo.setImageResource(R.drawable.lodz);
                if (hostTeamName.contains("Daugavpils"))
                    teamlogo.setImageResource(R.drawable.daugavpils);
                if (hostTeamName.contains("Tarnów"))
                    teamlogo.setImageResource(R.drawable.tarnow);

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

                ArrayAdapter<String> areasAdapter = new ArrayAdapter<String>(RidersListActivity.this, android.R.layout.simple_spinner_item, riders_name_seniorzyijuniorzy);
                areasAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                SpinnerRiderNr9.setAdapter(areasAdapter);
                SpinnerRiderNr9.setSelection(riders_name_seniorzyijuniorzy.indexOf("Brak zawodnika"));
                SpinnerRiderNr10.setAdapter(areasAdapter);
                SpinnerRiderNr10.setSelection(riders_name_seniorzyijuniorzy.indexOf("Brak zawodnika"));
                SpinnerRiderNr11.setAdapter(areasAdapter);
                SpinnerRiderNr11.setSelection(riders_name_seniorzyijuniorzy.indexOf("Brak zawodnika"));
                SpinnerRiderNr12.setAdapter(areasAdapter);
                SpinnerRiderNr12.setSelection(riders_name_seniorzyijuniorzy.indexOf("Brak zawodnika"));
                SpinnerRiderNr13.setAdapter(areasAdapter);
                SpinnerRiderNr13.setSelection(riders_name_seniorzyijuniorzy.indexOf("Brak zawodnika"));

                ArrayAdapter<String> areasAdapter_jr = new ArrayAdapter<String>(RidersListActivity.this, android.R.layout.simple_spinner_item, riders_name_juniorzy);
                areasAdapter_jr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                SpinnerRiderNr14.setAdapter(areasAdapter_jr);
                SpinnerRiderNr14.setSelection(riders_name_juniorzy.indexOf("Brak zawodnika"));
                SpinnerRiderNr15.setAdapter(areasAdapter_jr);
                SpinnerRiderNr15.setSelection(riders_name_juniorzy.indexOf("Brak zawodnika"));


                SpinnerRiderNr9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        StringHelper.Zawodnik9 = index;
                        Log.d("SpinnerGuest ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
                SpinnerRiderNr10.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        StringHelper.Zawodnik10 = index;
                        Log.d("SpinnerGuest ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
                SpinnerRiderNr11.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        StringHelper.Zawodnik11 = index;
                        Log.d("SpinnerGuest ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
                SpinnerRiderNr12.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        StringHelper.Zawodnik12 = index;
                        Log.d("SpinnerGuest ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
                SpinnerRiderNr13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        StringHelper.Zawodnik13 = index;
                        Log.d("SpinnerGuest ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
                SpinnerRiderNr14.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        StringHelper.Zawodnik14 = index;
                        Log.d("SpinnerGuest ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
                SpinnerRiderNr15.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        StringHelper.Zawodnik15 = index;
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
                Intent intent = new Intent(RidersListActivity.this, RidersListActivity_GUESTS.class);
                String host_tmp = StringHelper.GuestString;
                intent.putExtra("GUEST_STRING", host_tmp);
                startActivity(intent);
            }
        });
    }
}