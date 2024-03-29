/*package com.example.comarch_speedway;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("dupahehe");

        myRef.setValue("Hello, World!");

    }

}*/

package com.example.comarch_speedway;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef2 = database.getInstance().getReference().child("teams");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Spinner hostSpinner = (Spinner) findViewById(R.id.gospodarz_spinner);
        final Spinner guestSpinner = (Spinner) findViewById(R.id.gosc_spinner);


        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Teams teams = dataSnapshot.getValue(Teams.class);
                Map<String, Object> map = (Map<String, Object>) dataSnapshot.getValue();
                List<String> teams_name = new ArrayList(map.keySet());
                Log.d("Sprawdzam keys, ", "Value is: " + teams_name); //działa elegancko (nazwy klubów)
                List<String> teams_name_seniorzy = new ArrayList();
                for (int i=0; i<teams_name.size(); i++) {
                    if (teams_name.get(i).contains("juniorzy") != true) {
                        System.out.println(teams_name.get(i));
                        teams_name_seniorzy.add(teams_name.get(i));
                    }
                } //wyświetla tylko nazwy klubów bez "juniorzy w nazwie


                Log.d("Sprawdzam, ", "Value is: " + map);
                //Log.d("Parents, ", "Values are: " + teams);

                ArrayAdapter<String> areasAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, teams_name_seniorzy);
                areasAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                hostSpinner.setAdapter(areasAdapter);
                guestSpinner.setAdapter(areasAdapter);
                guestSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        DataContainer.GuestString = index;
                        Log.d("SpinnerGuest ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                    });

                hostSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        DataContainer.HostString = index;
                        Log.d("SpinnerHost ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("nie udalo sie, ", "Failed to read value.", error.toException());
            }
        }        );
        myRef2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        setButtonClickListener();
    }

    public void myClickHandler (View view){
        final TextView txt_error = (TextView) findViewById(R.id.textView_errorteams);
        switch (view.getId()){
            case R.id.main_button_next:
                Log.d("Sprawdzam button,  ", "KLIKNIĘTO NEXT");
                if (DataContainer.HostString != DataContainer.GuestString)
                    openRidersActivity();
                else{
                    txt_error.setText("Wybierz różne zespoły!");
                }
                break;

            default:
        }
    }

    public void setButtonClickListener(){
        Button mainNext = (Button) findViewById(R.id.main_button_next);

        View.OnClickListener myClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view){
                myClickHandler(view);
            }
        };
            mainNext.setOnClickListener(myClickListener);
    }



    public void openRidersActivity(){
        Intent intent = new Intent(MainActivity.this, RidersListActivity.class);
        String host_tmp = DataContainer.HostString;
        intent.putExtra("HOST_STRING", host_tmp);
        startActivity(intent);
    }

}
