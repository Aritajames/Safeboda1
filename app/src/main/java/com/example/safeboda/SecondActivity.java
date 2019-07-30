package com.example.safeboda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView myfname, mylname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

    //Grabbing views
        myfname = findViewById(R.id.textFirstname);
        mylname = findViewById(R.id.textLastname);

    //Grabbing intent and storing data in Vars
        Intent intent = getIntent();

    //Grabbing data from intent
        String nameone = ((Intent) intent).getStringExtra("fname");
        String nametwo = ((Intent) intent).getStringExtra("lname");

    //Setting data to the view
        myfname.setText(nameone);
        mylname.setText(nametwo);
    }
}
