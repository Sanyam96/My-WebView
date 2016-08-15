package com.example.sanyam.mywebviewapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mWebView = (WebView) findViewById(R.id.webView);

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Uri uri = Uri.parse("https://www.facebook.com/");

        //mWebView.loadUrl(""+uri);

        //mWebView.loadUrl("https://ideone.com/EImE6H");
        //mWebView.loadUrl("https://drive.google.com/open?id=0B9y7ghifNmVnOUQtMTVHSGhaNVU");
        //mWebView.loadUrl("https://www.google.co.in");
        //mWebView.loadUrl("http://beta.html5test.com/");
        //mWebView.loadUrl("http://www.html5rocks.com/");

        //mWebView.setWebViewClient(new WebViewClient());

        //mWebView.loadUrl("http://www.bvpieee.com");
        mWebView.loadUrl("https://github.com/Sanyam96/");

        // Stop local links and redirects from opening in browser instead of WebView
        mWebView.setWebViewClient(new MyAppWebViewClient());

    }
}
