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
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getName();

    TextView temporaryTxt;
    public String string_test;

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("dupahehe");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temporaryTxt = (TextView) findViewById(R.id.textView5);

        //test
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                //Log.d("dupa udalo sie", "Value is: " + value);
                string_test = value;
                Log.d("dupa udalo sie", "Value is: " + string_test);
                temporaryTxt.setText(string_test);

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("dupa nie udalo sie", "Failed to read value.", error.toException());
            }
        });
    }
}