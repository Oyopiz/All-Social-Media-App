package com.example.multisocial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Facebook extends AppCompatActivity {
WebView webView;
Context context=this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        webView=findViewById(R.id.facebookweb);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        if (!DetectConnection.checkInternetConnection(this)) {
            AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
            builder1.setMessage("No internet connection.");
            builder1.setCancelable(true);

            builder1.setPositiveButton(
                    "Retry",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            finish();
                            startActivity(new Intent(Facebook.this,Facebook.class));
                        }
                    });

            builder1.setNegativeButton(
                    "Cancel",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                            finish();
                        }
                    });

            AlertDialog alert11 = builder1.create();
            alert11.show();
        } else {
            webView.getSettings().setJavaScriptEnabled(true);
            webView.getSettings().setAllowContentAccess(true);
            webView.loadUrl("https://www.facebook.com/");
            webView.setWebViewClient(new MyWebViewClient());
        }
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }else {
            super.onBackPressed();
        }
    }
    public class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}