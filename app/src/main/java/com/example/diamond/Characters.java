package com.example.diamond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class Characters extends AppCompatActivity {

    ImageView arraw_char,c1,c2,c3,c4,c5,c6;
    int charValue=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.characters);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        arraw_char = findViewById(R.id.arraw_char);

        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);
        c3 = findViewById(R.id.c3);
        c4 = findViewById(R.id.c4);
        c5 = findViewById(R.id.c5);
        c6 = findViewById(R.id.c6);

        arraw_char.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Characters.this,MainHomePage.class);
                startActivity(intent);
            }
        });

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                charValue = 1;
                Intent intent = new Intent(Characters.this,CharInfo.class);
                intent.putExtra("charValue",charValue);
                startActivity(intent);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                charValue = 2;
                Intent intent = new Intent(Characters.this,CharInfo.class);
                intent.putExtra("charValue",charValue);
                startActivity(intent);
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                charValue = 3;
                Intent intent = new Intent(Characters.this,CharInfo.class);
                intent.putExtra("charValue",charValue);
                startActivity(intent);
            }
        });

        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                charValue = 4;
                Intent intent = new Intent(Characters.this,CharInfo.class);
                intent.putExtra("charValue",charValue);
                startActivity(intent);
            }
        });

        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                charValue = 5;
                Intent intent = new Intent(Characters.this,CharInfo.class);
                intent.putExtra("charValue",charValue);
                startActivity(intent);
            }
        });

        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                charValue = 6;
                Intent intent = new Intent(Characters.this,CharInfo.class);
                intent.putExtra("charValue",charValue);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        charValue = 0;
    }

}