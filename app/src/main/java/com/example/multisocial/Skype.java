package com.example.multisocial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Skype extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skype);
        webView = findViewById(R.id.skypeweb);
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
                            dialog.cancel();
                            finish();
                            startActivity(new Intent(Skype.this,Skype.class));
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
            webView.loadUrl("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=13&ct=1638032328&rver=7.1.6819.0&wp=MBI_SSL&wreply=https%3A%2F%2Flw.skype.com%2Flogin%2Foauth%2Fproxy%3Fclient_id%3D572381%26redirect_uri%3Dhttps%253A%252F%252Fweb.skype.com%252FAuth%252FPostHandler%26state%3Daa63033e-b06c-4974-9c96-313584c610fa&lc=1033&id=293290&mkt=en-US&psi=skype&lw=1&cobrandid=2befc4b5-19e3-46e8-8347-77317a16a5a5&client_flight=ReservedFlight33%2CReservedFlight67");
            webView.setWebViewClient(new MyWebViewClient());
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