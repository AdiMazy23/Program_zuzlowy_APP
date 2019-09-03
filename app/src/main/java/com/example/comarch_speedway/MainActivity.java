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

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();

    TextView temporaryTxt;
    ListView listViewTeams;
    public String string_test;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("dupahehe");
    DatabaseReference myRef2 = database.getReference("teams");

    public List<Teams> teams = new ArrayList<>();
    public ArrayAdapter<Teams> teamsArrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temporaryTxt = (TextView) findViewById(R.id.textView5);
        listViewTeams = (ListView) findViewById(R.id.ListView);

        //test
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                teams.clear();

                String value = dataSnapshot.getValue(String.class);
                //Log.d("dupa udalo sie", "Value is: " + value);
                string_test = value;
                Log.d("Yeah udalo sie", "Value is: " + string_test);
                temporaryTxt.setText(string_test);
                for (DataSnapshot ds:dataSnapshot.getChildren())
                {


                }


            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("dupa nie udalo sie", "Failed to read value.", error.toException());
            }
        });
    }
}