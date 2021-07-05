package com.example.diamond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Diamond extends AppCompatActivity {

    ImageView arraw_diamond,dia_1,dia_2,dia_3;
    int diaValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diamond);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        arraw_diamond = findViewById(R.id.arraw_diamond);

        dia_1 = findViewById(R.id.dia_1);
        dia_2 = findViewById(R.id.dia_2);
        dia_3 = findViewById(R.id.dia_3);

        arraw_diamond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Diamond.this,MainHomePage.class);
                startActivity(intent);
            }
        });

        dia_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diaValue = 1;
                Intent intent = new Intent(Diamond.this,DiamondInfo.class);
                intent.putExtra("diaValue",diaValue);
                startActivity(intent);
            }
        });

        dia_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diaValue = 2;
                Intent intent = new Intent(Diamond.this,DiamondInfo.class);
                intent.putExtra("diaValue",diaValue);
                startActivity(intent);
            }
        });

        dia_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diaValue = 3;
                Intent intent = new Intent(Diamond.this,DiamondInfo.class);
                intent.putExtra("diaValue",diaValue);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        diaValue = 0;
    }

}