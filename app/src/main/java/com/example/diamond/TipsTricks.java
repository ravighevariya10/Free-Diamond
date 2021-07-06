package com.example.diamond;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class TipsTricks extends AppCompatActivity {

    ImageView arraw_tips,tip1,tip2,tip3,tip4,tip5,tip6,tip7;
    int tipsValue=0;
    AdRequest adRequest;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tips_tricks);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        arraw_tips = findViewById(R.id.arraw_tips);
        adRequest = new AdRequest.Builder().build();

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
                showAd();
            }
        });

        tip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipsValue = 2;
                showAd();
            }
        });

        tip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipsValue = 3;
                showAd();
            }
        });

        tip4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipsValue = 4;
                showAd();
            }
        });

        tip5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipsValue = 5;
                showAd();
            }
        });

        tip6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipsValue = 6;
                showAd();
            }
        });

        tip7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tipsValue = 7;
                showAd();
            }
        });

    }

    public void showAd(){
        InterstitialAd.load(TipsTricks.this, "ca-app-pub-7287613388864066/8167764203", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                mInterstitialAd = interstitialAd;
                mInterstitialAd.show(TipsTricks.this);

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {

                        Intent intent = new Intent(TipsTricks.this,TipsInformation.class);
                        intent.putExtra("tipsValue",tipsValue);
                        startActivity(intent);

                    }
                });
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
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