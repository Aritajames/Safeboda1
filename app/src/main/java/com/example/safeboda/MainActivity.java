package com.example.safeboda;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
EditText fname,lname;
Button saveBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Receiving data that the user has entered
        fname = findViewById(R.id.textFirstname);
        lname = findViewById(R.id.textLastname);
        saveBtn = findViewById(R.id.buttonSubmit);

        Button saveBtn = (Button)findViewById(R.id.buttonSubmit);
        saveBtn.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               String firstname = fname.getText().toString();
               String lastname = lname.getText().toString();

           //Check if user has entered data

               if(firstname.isEmpty()){
                   Toast.makeText(MainActivity.this, "First name is required", Toast.LENGTH_SHORT).show();
               }
               else if(lastname.isEmpty()){
                   Toast.makeText(MainActivity.this, "Last name is required", Toast.LENGTH_SHORT).show();
               }
               else{
                  Intent nextPage = new Intent(MainActivity.this, SecondActivity.class);
                  startActivity(nextPage);
           }
           }
        });

    //Grab the textview in the xml file using an ID
    TextView endaAct2 = (TextView)findViewById(R.id.textviewhome);

    //Create/set a listener for a click on the view
    endaAct2.setOnClickListener(new View.OnClickListener(){
        //When the view is clicked!!!
        @Override
        public void onClick(View view){
            Intent twendeSecondActivity = new Intent(MainActivity.this,SecondActivity.class);
            startActivity(twendeSecondActivity);
        }
    });

        Button googlebtn = (Button)findViewById(R.id.btngoogle);
        googlebtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //Action to take place after setting up a listener
                //Create a string variable to store the URL for Google
                String url = "http://www.google.com";

                //Validate URL to confirm if its ok
                Uri webaddress = Uri.parse(url);

                //Create an intent
                //ACTION_VIEW: Checks if there is an application to open the url
                Intent goToGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if(goToGoogle.resolveActivity(getPackageManager())!= null){
                    startActivity(goToGoogle);
                }
            }

        });





}
}
