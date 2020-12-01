package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView email,username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        email = (TextView)findViewById(R.id.email);
        username = (TextView) findViewById(R.id.name);


        Intent intent =getIntent();


        email.setText(intent.getStringExtra("Email_id"));


    }
}
