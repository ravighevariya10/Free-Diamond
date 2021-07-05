package com.example.diamond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class CharInfo extends AppCompatActivity {

    LinearLayout charLayout;
    ImageView arraw_charinfo;
    int charValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.char_info);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        charValue = getIntent().getIntExtra("charValue",0);

        arraw_charinfo = findViewById(R.id.arraw_charinfo);
        charLayout = findViewById(R.id.charlayout);

        arraw_charinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CharInfo.this,Characters.class);
                startActivity(intent);
            }
        });

        if(charValue == 1) {
           charLayout.setBackgroundResource(R.drawable.char1);
        }

        if(charValue == 2) {
            charLayout.setBackgroundResource(R.drawable.char2);
        }

        if(charValue == 3) {
            charLayout.setBackgroundResource(R.drawable.char3);
        }

        if(charValue == 4) {
            charLayout.setBackgroundResource(R.drawable.char4);
        }

        if(charValue == 5) {
            charLayout.setBackgroundResource(R.drawable.char5);
        }

        if(charValue == 6) {
            charLayout.setBackgroundResource(R.drawable.char6);
        }

    }
}