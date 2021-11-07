package com.example.firstmultiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;

    //we want to send date from one activity to another activity
    //so that we use key-value method
    // this is a key we created. this works like a variable
    public static final String Extra_name = "com.example.firstmultiscreen.extra.NAME";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }
    public void open(View v)
    {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
        //intent Create
        Intent in = new Intent(this,MainActivity2.class);
        //get text
        name = findViewById(R.id.editTextTextPersonName);
        //convert to string
        String str = name.getText().toString();
        //make key-value pair using putextra method
        in.putExtra(Extra_name,str);//putExtra(key,value)

        startActivity(in);
    }


}