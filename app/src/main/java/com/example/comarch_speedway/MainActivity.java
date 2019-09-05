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
import android.widget.ListView;
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
    //private static final String TAG = MainActivity.class.getName();

    TextView temporaryTxt;
    ListView listViewTeams;
    public String string_test;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("dupahehe");
    DatabaseReference myRef2 = database.getInstance().getReference().child("teams");

    public List<Teams> teams = new ArrayList<>();
    public ArrayAdapter<Teams> teamsArrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temporaryTxt = (TextView) findViewById(R.id.textView5);

        final Spinner hostSpinner = (Spinner) findViewById(R.id.gospodarz_spinner); //zapelnianie spinnerow w main widoku
        final Spinner guestSpinner = (Spinner) findViewById(R.id.gosc_spinner);

        final String host_selected;
        final String guest_selected;

        //test
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
                Log.d("Parents, ", "Values are: " + teams);

                ArrayAdapter<String> areasAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, teams_name_seniorzy);
                areasAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                hostSpinner.setAdapter(areasAdapter);
                guestSpinner.setAdapter(areasAdapter);

                hostSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                        String index = arg0.getSelectedItem().toString();
                        //Toast.makeText(getBaseContext(), "You have selected item : " + presidents[index], Toast.LENGTH_SHORT).show();
                        Log.d("Spinner ", "Wybrales sobie na spinnerze:  " + index);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {
                    }
                });
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("dupa nie udalo sie", "Failed to read value.", error.toException());
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
        switch (view.getId()){
            case R.id.main_button_next:
                Log.d("Sprawdzam button,  ", "KLIKNIĘTO NEXT"); //w tym miejscu dopisać save i otworzyc nowy widok z wyborem zawodnikow
                //startActivity(new Intent(MainActivity.this, RidersListActivity.class));
                openRidersActivity();
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
        //intent.putExtra()
        startActivity(intent);
    }

}
