package com.example.bonelectronics_capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterScreen extends AppCompatActivity implements View.OnClickListener {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            setContentView(R.layout.activity_register_screen);
            super.onCreate(savedInstanceState);

            Button registerButton;

            registerButton = findViewById(R.id.registerButton);

            registerButton.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {


            Intent i = new Intent(RegisterScreen.this, MapShopLoc.class);
            startActivity(i);




            switch (v.getId()) {
                case R.id.registerButton:
                    startActivity(i);


                    break;
            }
        }
    }