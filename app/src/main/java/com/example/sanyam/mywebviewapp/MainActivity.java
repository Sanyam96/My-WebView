package com.example.sanyam.mywebviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        browser = (WebView) findViewById(R.id.webView);
        browser.loadUrl("https://www.google.co.in");
    }
}
