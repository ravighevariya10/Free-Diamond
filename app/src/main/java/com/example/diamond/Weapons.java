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

public class Weapons extends AppCompatActivity {

    ImageView arraw_weapon,w1,w2,w3,w4,w5,w6;
    int weaponValue=0;

    AdRequest adRequest;
    InterstitialAd mInterstitialAd;

    Intent activityIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weapons);

        activityIntent = getIntent();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        arraw_weapon = findViewById(R.id.arraw_weapon);

        w1 = findViewById(R.id.w1);
        w2 = findViewById(R.id.w2);
        w3 = findViewById(R.id.w3);
        w4 = findViewById(R.id.w4);
        w5 = findViewById(R.id.w5);
        w6 = findViewById(R.id.w6);

        adRequest = new AdRequest.Builder().build();

        arraw_weapon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Weapons.this,MainHomePage.class);
                startActivity(intent);
            }
        });

        w1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weaponValue = 1;
                showAd();
            }
        });

        w2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weaponValue = 2;
                showAd();
            }
        });

        w3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weaponValue = 3;
                showAd();
            }
        });

        w4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weaponValue = 4;
                showAd();
            }
        });

        w5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weaponValue = 5;
                showAd();
            }
        });

        w6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weaponValue = 6;
                showAd();
            }
        });

    }

    public void showAd(){
        InterstitialAd.load(Weapons.this, "ca-app-pub-7287613388864066/8167764203", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                mInterstitialAd = interstitialAd;
                mInterstitialAd.show(Weapons.this);

                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                    @Override
                    public void onAdDismissedFullScreenContent() {

                        Intent intent = new Intent(Weapons.this,WeaponInfo.class);
                        intent.putExtra("weaponValue",weaponValue);
                        startActivity(intent);

                    }
                });
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                Toast.makeText(Weapons.this,"Error: Your Internet connection is not stable",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Weapons.this,WeaponInfo.class);
                intent.putExtra("weaponValue",weaponValue);
                startActivity(intent);
            }
        });
    }

}