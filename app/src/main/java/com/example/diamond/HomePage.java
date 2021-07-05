package com.example.diamond;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class HomePage extends AppCompatActivity {

    ImageView arraw_home_page,free_diamond_main;

    InterstitialAd minterstitialAd;
    AdRequest adRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        arraw_home_page = findViewById(R.id.arraw_home_page);
        free_diamond_main = findViewById(R.id.free_diamond_main);

        adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this, "ca-app-pub-7287613388864066/8167764203", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                super.onAdLoaded(interstitialAd);
                minterstitialAd = interstitialAd;

                minterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        super.onAdDismissedFullScreenContent();
                        Intent intent = new Intent(HomePage.this,MainHomePage.class);
                        startActivity(intent);
                    }
                });

            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                //Toast.makeText(HomePage.this,"Error: "+loadAdError.getMessage(),Toast.LENGTH_LONG).show();
            }
        });

        arraw_home_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomePage.this,Options.class);
                startActivity(intent);
            }
        });

        free_diamond_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(minterstitialAd != null)
                minterstitialAd.show(HomePage.this);
                else
                {
                    Intent intent = new Intent(HomePage.this,MainHomePage.class);
                    startActivity(intent);
                }
            }
        });

    }
}