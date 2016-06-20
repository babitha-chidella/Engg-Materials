package org.enggmat.application.engineeringmaterials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class CSE_CPP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse__cpp);
        WebView mWeb;
        mWeb= (WebView) findViewById(R.id.webView);
        mWeb.getSettings().setJavaScriptEnabled(true);
        mWeb.getSettings().setBuiltInZoomControls(true);
        mWeb.loadUrl("file:///android_asset/CSE_CPP/csecpp.html");


    }
}
