package com.example.diamond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class TipsTricks extends AppCompatActivity {

    ImageView arraw_tips,tip1,tip2,tip3,tip4,tip5,tip6,tip7;
    int tipsValue=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips_tricks);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        arraw_tips = findViewById(R.id.arraw_tips);

        tip1 = findViewById(R.id.tip1);
        tip2 = findViewById(R.id.tip2);
        tip3 = findViewById(R.id.tip3);
        tip4 = findViewById(R.id.tip4);
        tip5 = findViewById(R.id.tip5);
        tip6 = findViewById(R.id.tip6);
        tip7 = findViewById(R.id.tip7);

        arraw_tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TipsTricks.this,MainHomePage.class);
                startActivity(intent);
            }
        });

        tip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipsValue = 1;
                Intent intent = new Intent(TipsTricks.this,TipsInformation.class);
                intent.putExtra("tipsValue",tipsValue);
                startActivity(intent);
            }
        });

        tip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipsValue = 2;
                Intent intent = new Intent(TipsTricks.this,TipsInformation.class);
                intent.putExtra("tipsValue",tipsValue);
                startActivity(intent);
            }
        });

        tip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipsValue = 3;
                Intent intent = new Intent(TipsTricks.this,TipsInformation.class);
                intent.putExtra("tipsValue",tipsValue);
                startActivity(intent);
            }
        });

        tip4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipsValue = 4;
                Intent intent = new Intent(TipsTricks.this,TipsInformation.class);
                intent.putExtra("tipsValue",tipsValue);
                startActivity(intent);
            }
        });

        tip5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipsValue = 5;
                Intent intent = new Intent(TipsTricks.this,TipsInformation.class);
                intent.putExtra("tipsValue",tipsValue);
                startActivity(intent);
            }
        });

        tip6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipsValue = 6;
                Intent intent = new Intent(TipsTricks.this,TipsInformation.class);
                intent.putExtra("tipsValue",tipsValue);
                startActivity(intent);
            }
        });

        tip7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipsValue = 7;
                Intent intent = new Intent(TipsTricks.this,TipsInformation.class);
                intent.putExtra("tipsValue",tipsValue);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        tipsValue = 0;
    }
}