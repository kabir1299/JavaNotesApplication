package com.cubiclesdeveloper.javaprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;


public class Description extends AppCompatActivity
{
    private InterstitialAd mInterstitialAd;
    private Bundle extra;
    private Context mContext;
    private WebView webView;
    private static final String TAG = "Description";

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        mContext=Description.this;
        webView=(WebView)findViewById(R.id.simpleWebView);

        extra=getIntent().getExtras();
        if(!extra.equals(null))
        {
            String  data = extra.getString("titles");

            Log.d(TAG,"the coming data is "+data);

            String url= "file:///android_asset/"+data+".html";
            webView.loadUrl(url);

            WebSettings webSettings = webView.getSettings();
            webSettings.setBuiltInZoomControls(true);
            webSettings.setDisplayZoomControls(false);
        }
    }

    public void Intertialshow()
    {
        if (mInterstitialAd.isLoaded())
        {
            mInterstitialAd.show();
        }
        else
        {
            finish();
        }
    }

}