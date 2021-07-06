package com.example.diamond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class WeaponInfo extends AppCompatActivity {

    LinearLayout weaponLayout;
    ImageView arraw_weaponinfo;
    int weaponValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weapon_info);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        weaponValue = getIntent().getIntExtra("weaponValue",0);

        arraw_weaponinfo = findViewById(R.id.arraw_weaponinfo);
        weaponLayout = findViewById(R.id.weaponlayout);

        arraw_weaponinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WeaponInfo.this,Weapons.class);
                startActivity(intent);
            }
        });

        if(weaponValue == 1) {
            weaponLayout.setBackgroundResource(R.drawable.wi1);
        }

        if(weaponValue == 2) {
            weaponLayout.setBackgroundResource(R.drawable.wi2);
        }

        if(weaponValue == 3) {
            weaponLayout.setBackgroundResource(R.drawable.wi3);
        }

        if(weaponValue == 4) {
            weaponLayout.setBackgroundResource(R.drawable.wi4);
        }

        if(weaponValue == 5) {
            weaponLayout.setBackgroundResource(R.drawable.wi5);
        }

        if(weaponValue == 6) {
            weaponLayout.setBackgroundResource(R.drawable.wi6);
        }

    }
}