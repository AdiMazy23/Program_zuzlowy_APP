package com.example.comarch_speedway;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

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

        String hostTeamName;
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

        final List<String> riders_name_seniorzyijuniorzy = new ArrayList();
        final List<String> riders_name_juniorzy = new ArrayList();

        final Spinner SpinnerRiderNr9 = (Spinner) findViewById(R.id.spinnerNr9);
        final Spinner SpinnerRiderNr10 = (Spinner) findViewById(R.id.spinnerNr10);
        final Spinner SpinnerRiderNr11 = (Spinner) findViewById(R.id.spinnerNr11);
        final Spinner SpinnerRiderNr12 = (Spinner) findViewById(R.id.spinnerNr12);
        final Spinner SpinnerRiderNr13 = (Spinner) findViewById(R.id.spinnerNr13);
        final Spinner SpinnerRiderNr14 = (Spinner) findViewById(R.id.spinnerNr14);
        final Spinner SpinnerRiderNr15 = (Spinner) findViewById(R.id.spinnerNr15);

        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("nie udalo sie, ", "Failed to read value.", error.toException());
            }

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                Map<String, Object> map = (Map<String, Object>) dataSnapshot.getValue();
                List<String> riders_name = new ArrayList(map.keySet());
                for (int i=0; i<riders_name.size(); i++) {
                    System.out.println(riders_name.get(i));
                    riders_name_seniorzyijuniorzy.add(riders_name.get(i));
                    if (riders_name.get(i).contains("*jr") == true){
                        riders_name_juniorzy.add(riders_name.get(i));
                    }
                }

                ArrayAdapter<String> areasAdapter = new ArrayAdapter<String>(RidersListActivity.this, android.R.layout.simple_spinner_item, riders_name_seniorzyijuniorzy);
                areasAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                SpinnerRiderNr9.setAdapter(areasAdapter);
                SpinnerRiderNr10.setAdapter(areasAdapter);
                SpinnerRiderNr11.setAdapter(areasAdapter);
                SpinnerRiderNr12.setAdapter(areasAdapter);
                SpinnerRiderNr13.setAdapter(areasAdapter);

                ArrayAdapter<String> areasAdapter_jr = new ArrayAdapter<String>(RidersListActivity.this, android.R.layout.simple_spinner_item, riders_name_juniorzy);
                areasAdapter_jr.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                SpinnerRiderNr14.setAdapter(areasAdapter_jr);
                SpinnerRiderNr15.setAdapter(areasAdapter_jr);


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
            }
        });
    }
}