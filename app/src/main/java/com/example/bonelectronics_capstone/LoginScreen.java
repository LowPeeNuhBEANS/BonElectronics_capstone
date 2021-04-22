package com.example.bonelectronics_capstone;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LoginScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        boolean condition;

        Button loginButton;
        loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(this);
        Intent i = getIntent();

        Button signup;
        signup = findViewById(R.id.signupButton);
        signup.setOnClickListener(this);
        Intent b = getIntent();
    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(LoginScreen.this, MapShopLoc.class);
        startActivity(i);


        switch (v.getId()) {
            case R.id.loginButton:
                startActivity(i);
        Intent b = new Intent(LoginScreen.this, RegisterScreen.class);
        startActivity(b);
        switch (v.getId()) {
            case R.id.signupButton:
                startActivity(b);

                break;
                }
        }
    }
}