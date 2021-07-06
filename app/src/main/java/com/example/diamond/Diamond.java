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

public class Diamond extends AppCompatActivity {

    ImageView arraw_diamond,dia_1,dia_2,dia_3;
    int diaValue;
    AdRequest adRequest;
    InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diamond);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        arraw_diamond = findViewById(R.id.arraw_diamond);
        adRequest = new AdRequest.Builder().build();

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
                showAd();
            }
        });

        dia_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diaValue = 2;
                showAd();
            }
        });

        dia_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diaValue = 3;
                showAd();
            }
        });

    }

    public void showAd(){
        InterstitialAd.load(Diamond.this, "ca-app-pub-7287613388864066/8167764203", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                mInterstitialAd = interstitialAd;
                mInterstitialAd.show(Diamond.this);

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {

                        Intent intent = new Intent(Diamond.this,DiamondInfo.class);
                        intent.putExtra("diaValue",diaValue);
                        startActivity(intent);

                    }
                });
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
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