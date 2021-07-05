package com.example.diamond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;

public class DiamondInfo extends AppCompatActivity {

    ImageView arraw_diainfo;
    WebView web_diainfo;
    int diaValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diamond_info);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        diaValue = getIntent().getIntExtra("diaValue",0);

        arraw_diainfo = findViewById(R.id.arraw_diainfo);
        web_diainfo = findViewById(R.id.web_diainfo);

        web_diainfo.setBackgroundColor(Color.TRANSPARENT);

        arraw_diainfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DiamondInfo.this,Diamond.class);
                startActivity(intent);
            }
        });

        if(diaValue == 1) {
            web_diainfo.loadUrl("file:///android_asset/dia1.html");
        }

        if(diaValue == 2) {
            web_diainfo.loadUrl("file:///android_asset/dia2.html");
        }

        if(diaValue == 3) {
            web_diainfo.loadUrl("file:///android_asset/dia3.html");
        }


    }
}