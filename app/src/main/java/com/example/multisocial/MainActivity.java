package com.example.multisocial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class MainActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    private  int TAG = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        setAds();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_about:
        break;
        case R.id.menu_github:

            break;
            case R.id.menu_settings:

                break;
    }
        return super.onOptionsItemSelected(item);
    }

    public void instagram(View view) {
        if (mInterstitialAd != null){
            mInterstitialAd.show(MainActivity.this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    startActivity(new Intent(MainActivity.this, Instagram.class));
                    super.onAdDismissedFullScreenContent();
                    mInterstitialAd = null;
                    setAds();
                }
            });
        }else {
            startActivity(new Intent(this, Instagram.class));
    }

    }
    public void twitter(View view) {
        if (mInterstitialAd != null){
            mInterstitialAd.show(MainActivity.this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    startActivity(new Intent(MainActivity.this, Twitter.class));
                    super.onAdDismissedFullScreenContent();
                    mInterstitialAd = null;
                    setAds();
                }
            });
        }else {
            startActivity(new Intent(this, Twitter.class));
        }
    }

    public void youtube(View view) {
        if (mInterstitialAd != null){
            mInterstitialAd.show(MainActivity.this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    startActivity(new Intent(MainActivity.this, Youtube.class));
                    super.onAdDismissedFullScreenContent();
                    mInterstitialAd = null;
                    setAds();
                }
            });
        }else {
            startActivity(new Intent(this, Youtube.class));
        }

    }

    public void linkedin(View view) {
        if (mInterstitialAd != null){
            mInterstitialAd.show(MainActivity.this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    startActivity(new Intent(MainActivity.this, Linkedin.class));
                    super.onAdDismissedFullScreenContent();
                    mInterstitialAd = null;
                    setAds();
                }
            });
        }else {
            startActivity(new Intent(this, Linkedin.class));
        }

    }

    public void facebook(View view) {
if (mInterstitialAd != null){
    mInterstitialAd.show(MainActivity.this);
    mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
        @Override
        public void onAdDismissedFullScreenContent() {
            startActivity(new Intent(MainActivity.this, Facebook.class));
            super.onAdDismissedFullScreenContent();
            mInterstitialAd = null;
            setAds();
        }
    });
}else {
    startActivity(new Intent(this, Facebook.class));
}

    }

    public void twitch(View view) {
        if (mInterstitialAd != null){
            mInterstitialAd.show(MainActivity.this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    startActivity(new Intent(MainActivity.this, Twitch.class));
                    super.onAdDismissedFullScreenContent();
                    mInterstitialAd = null;
                    setAds();
                }
            });
        }else {
            startActivity(new Intent(this, Twitch.class));
        }

    }

    public void telegram(View view) {
        if (mInterstitialAd != null){
            mInterstitialAd.show(MainActivity.this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    startActivity(new Intent(MainActivity.this, Telegram.class));
                    super.onAdDismissedFullScreenContent();
                    mInterstitialAd = null;
                    setAds();
                }
            });
        }else {
            startActivity(new Intent(this, Telegram.class));
        }

    }

    public void dropbox(View view) {
        if (mInterstitialAd != null){
            mInterstitialAd.show(MainActivity.this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    startActivity(new Intent(MainActivity.this, Dropbox.class));
                    super.onAdDismissedFullScreenContent();
                    mInterstitialAd = null;
                    setAds();
                }
            });
        }else {
            startActivity(new Intent(this, Dropbox.class));
        }

    }

    public void tiktok(View view) {
        if (mInterstitialAd != null){
            mInterstitialAd.show(MainActivity.this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    startActivity(new Intent(MainActivity.this, Tiktok.class));
                    super.onAdDismissedFullScreenContent();
                    mInterstitialAd = null;
                    setAds();
                }
            });
        }else {
            startActivity(new Intent(this, Tiktok.class));
        }
    }

    public void skype(View view) {
        if (mInterstitialAd != null){
            mInterstitialAd.show(MainActivity.this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    startActivity(new Intent(MainActivity.this, Skype.class));
                    super.onAdDismissedFullScreenContent();
                    mInterstitialAd = null;
                    setAds();
                }
            });
        }else {
            startActivity(new Intent(this, Skype.class));
        }

    }

    public void quora(View view) {
        if (mInterstitialAd != null){
            mInterstitialAd.show(MainActivity.this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    startActivity(new Intent(MainActivity.this, Quora.class));
                    super.onAdDismissedFullScreenContent();
                    mInterstitialAd = null;
                    setAds();
                }
            });
        }else {
            startActivity(new Intent(this, Quora.class));
        }

    }

    public void reddit(View view) {
        if (mInterstitialAd != null){
            mInterstitialAd.show(MainActivity.this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    startActivity(new Intent(MainActivity.this, Reddit.class));
                    super.onAdDismissedFullScreenContent();
                    mInterstitialAd = null;
                    setAds();
                }
            });
        }else {
            startActivity(new Intent(this, Reddit.class));
        }

    }

    public void discord(View view) {
        if (mInterstitialAd != null){
            mInterstitialAd.show(MainActivity.this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    startActivity(new Intent(MainActivity.this, Discord.class));
                    super.onAdDismissedFullScreenContent();
                    mInterstitialAd = null;
                    setAds();
                }
            });
        }else {
            startActivity(new Intent(this, Discord.class));
        }

    }

    public void snapchat(View view) {
        if (mInterstitialAd != null){
            mInterstitialAd.show(MainActivity.this);
            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    startActivity(new Intent(MainActivity.this, Snapchat.class));
                    super.onAdDismissedFullScreenContent();
                    mInterstitialAd = null;
                    setAds();
                }
            });
        }else {
            startActivity(new Intent(this, Snapchat.class));
        }

    }
    public  void setAds(){
        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,"ca-app-pub-5437726332312712/4604675059", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        // The mInterstitialAd reference will be null until
                        // an ad is loaded.
                        mInterstitialAd = interstitialAd;
                        Log.i(String.valueOf(TAG), "onAdLoaded");
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error
                        Log.i(String.valueOf(TAG), loadAdError.getMessage());
                        mInterstitialAd = null;
                    }
                });
    }
}
