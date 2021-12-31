package com.example.multisocial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Discord extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discord);
        webView = findViewById(R.id.webdiscord);
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
                            startActivity(new Intent(Discord.this,Discord.class));
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
            webView.loadUrl("https://discord.com/login?brand_id=96508&locale_id=1&return_to=https%3A%2F%2Fsupport.discord.com%2Fhc%2Fen-us%2Fcommunity%2Fposts%2F360056220432-Login&service=zendesk&timestamp=1638031575");
            webView.setWebViewClient(new MyWebViewClient());
            this.webView.getSettings().setDomStorageEnabled(true);
        }
    }
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
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