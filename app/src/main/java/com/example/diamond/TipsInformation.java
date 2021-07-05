package com.example.diamond;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class TipsInformation extends AppCompatActivity {

    ImageView arraw_tipinfo;
    WebView web_tipinfo;
    int tipsValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips_information);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        tipsValue = getIntent().getIntExtra("tipsValue",0);

        arraw_tipinfo = findViewById(R.id.arraw_tipinfo);
        web_tipinfo = findViewById(R.id.web_tipinfo);

        web_tipinfo.setBackgroundColor(Color.TRANSPARENT);

        arraw_tipinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TipsInformation.this,TipsTricks.class);
                startActivity(intent);
            }
        });

        if(tipsValue == 1) {
            web_tipinfo.loadUrl("file:///android_asset/d1.html");
        }

        if(tipsValue == 2) {
            web_tipinfo.loadUrl("file:///android_asset/d2.html");
        }

        if(tipsValue == 3) {
            web_tipinfo.loadUrl("file:///android_asset/d3.html");
        }

        if(tipsValue == 4) {
            web_tipinfo.loadUrl("file:///android_asset/d4.html");
        }

        if(tipsValue == 5) {
            web_tipinfo.loadUrl("file:///android_asset/d5.html");
        }

        if(tipsValue == 6) {
            web_tipinfo.loadUrl("file:///android_asset/d6.html");
        }

        if(tipsValue == 7) {
            web_tipinfo.loadUrl("file:///android_asset/d7.html");
        }

    }
}