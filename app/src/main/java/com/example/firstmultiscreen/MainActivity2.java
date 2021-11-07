package com.example.firstmultiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name=findViewById(R.id.textView);
        //get intent here which we created in first activity
        Intent in = getIntent();
        //get that string using getStringExtra method
        String name2 = in.getStringExtra(MainActivity.Extra_name);
        name.setText("your name is : "+ name2);

    }
}