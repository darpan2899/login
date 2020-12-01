package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText uname,pword;
    String username,emailid,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = (EditText)findViewById(R.id.name);

        pword = (EditText) findViewById(R.id.Password);
    }

    public void show(View view) {


        username = uname.getText().toString();

        password = pword.getText().toString();

        if(username.equals("darpan")&&password.equals("drv"))
        {
            emailid = "Welcome " + username;
        }
        else
        {
            emailid = "wrong credentials";
            if(!username.equals("darpan"))
            {
                emailid = emailid + "\nInvalid Username";
            }
            else
            {
                emailid = emailid + "\nInvalid password";
            }
        }

        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);


        intent.putExtra("Email_id",emailid);

        startActivity(intent);

    }
}
