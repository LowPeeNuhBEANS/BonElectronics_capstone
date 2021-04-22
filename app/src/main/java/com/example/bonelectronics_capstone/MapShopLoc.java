package com.example.bonelectronics_capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MapShopLoc extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_shop_loc);

        Button shopButton;

        shopButton = findViewById(R.id.shopButton);

        shopButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(MapShopLoc.this, ShopProfile.class);
        startActivity(i);

        switch (v.getId()) {
            case R.id.shopButton:
                startActivity(i);

                break;


        }
    }
}