package com.cubiclesdeveloper.javaprogramming;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.os.Handler;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Timer;
import java.util.TimerTask;

public class ContactUs extends AppCompatActivity
{
    ViewPager viewPager;
    private InterstitialAd mInterstitialAd;
    int images[] = {R.drawable.cube1, R.drawable.cube2, R.drawable.cube3};
    int currentPageCunter = 0;
    @Override
    public void onBackPressed()
    {
        Intertialshow();
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us2);
        viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new Slideadapter(images, com.cubiclesdeveloper.javaprogramming.ContactUs.this));
        final Handler handler = new Handler();
        final Runnable update  = new Runnable() {
            @Override
            public void run()
            {
                if (currentPageCunter == images.length)
                {
                    currentPageCunter = 0 ;
                }
                viewPager.setCurrentItem(currentPageCunter++,true);
            }
        };
        Timer timer = new Timer();
        timer.schedule(new TimerTask()
        {
            @Override
            public void run()
            {
                handler.post(update);
            }
        },1000,1000);
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