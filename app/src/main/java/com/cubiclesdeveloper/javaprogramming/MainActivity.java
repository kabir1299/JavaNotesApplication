package com.cubiclesdeveloper.javaprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView text1, text2;
    Animation anim1,anim2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.tv1);
        text2=findViewById(R.id.textView);

        anim1= AnimationUtils.loadAnimation(this,R.anim.fade_in);
        anim2= AnimationUtils.loadAnimation(this,R.anim.down);
        text1.startAnimation(anim2);
        text2.startAnimation(anim1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,Home.class);
                startActivity(i);
                finish();
            }
        },3000);
    }
}