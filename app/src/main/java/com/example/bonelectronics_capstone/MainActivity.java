package com.example.bonelectronics_capstone;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        Button buttonbegin;

        buttonbegin = findViewById(R.id.buttonbegin);

        buttonbegin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {


        Intent i = new Intent(com.example.bonelectronics_capstone.MainActivity.this, LoginScreen.class);
        startActivity(i);




        switch (v.getId()) {
            case R.id.buttonbegin:
                startActivity(i);


                break;
        }
    }
}