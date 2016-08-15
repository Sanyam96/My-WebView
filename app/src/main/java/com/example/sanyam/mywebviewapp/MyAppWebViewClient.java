package com.example.sanyam.mywebviewapp;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by sanyam on 15/8/16.
 */
public class MyAppWebViewClient extends WebViewClient{

    public boolean shouldOverrideUrlLoading(WebView view, String url, WebResourceRequest request) {
        if(Uri.parse(url).getHost().endsWith("html5rocks.com")) {
            return false;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(intent);
        return true;

        //return super.shouldOverrideUrlLoading(view, request);
    }
}
