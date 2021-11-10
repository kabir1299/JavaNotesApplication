package com.cubiclesdeveloper.javaprogramming;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import androidx.recyclerview.widget.GridLayoutManager;

import androidx.recyclerview.widget.RecyclerView;



import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;



import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;





public class Home extends AppCompatActivity
{
    private static final String TAG = "Home";


    private Context mContext;
    ArrayList<String> titleArrayList;
    private RecyclerView mRecyclerView;
    ArrayList<Integer> image;
    BottomNavigationView bottombar;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bottombar=findViewById(R.id.bottomselected);

        bottombar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                int id=item.getItemId();
                if(id==R.id.contact_us_you)
                {
                    Intent in = new Intent(Home.this,ContactUs.class);
                    startActivity(in);
                    return true;
                }
                else if(id==R.id.info);
                {
                    Intent in = new Intent(Home.this,Aboutapp.class);
                    startActivity(in);

                }
                return true;
            }
        });
        mContext=Home.this;

        titleArrayList = new ArrayList<String>();
        titleArrayList.add(Constants.Chapter_1);
        titleArrayList.add(Constants.Chapter_2);
        titleArrayList.add(Constants.Chapter_3);
        titleArrayList.add(Constants.Chapter_4);
        titleArrayList.add(Constants.Chapter_5);
        titleArrayList.add(Constants.Chapter_6);
        titleArrayList.add(Constants.Chapter_7);
        titleArrayList.add(Constants.Chapter_8);
        titleArrayList.add(Constants.Chapter_9);
        titleArrayList.add(Constants.Chapter_10);
        titleArrayList.add(Constants.Chapter_11);
        titleArrayList.add(Constants.Chapter_12);
        titleArrayList.add(Constants.Chapter_13);
        titleArrayList.add(Constants.Chapter_14);
        titleArrayList.add(Constants.Chapter_15);
        titleArrayList.add(Constants.Chapter_16);
        titleArrayList.add(Constants.Chapter_17);
        titleArrayList.add(Constants.Chapter_18);
        titleArrayList.add(Constants.Chapter_19);
        titleArrayList.add(Constants.Chapter_20);
        titleArrayList.add(Constants.Chapter_21);
        titleArrayList.add(Constants.Chapter_22);
        titleArrayList.add(Constants.Chapter_23);
        titleArrayList.add(Constants.Chapter_24);
        titleArrayList.add(Constants.Chapter_25);
        titleArrayList.add(Constants.Chapter_26);
        titleArrayList.add(Constants.Chapter_27);
        titleArrayList.add(Constants.Chapter_28);
        titleArrayList.add(Constants.Chapter_29);
        titleArrayList.add(Constants.Chapter_30);
        titleArrayList.add(Constants.Chapter_31);
        titleArrayList.add(Constants.Chapter_32);
        titleArrayList.add(Constants.Chapter_33);
        titleArrayList.add(Constants.Chapter_34);
        titleArrayList.add(Constants.Chapter_35);
        titleArrayList.add(Constants.Chapter_36);
        titleArrayList.add(Constants.Chapter_37);
        titleArrayList.add(Constants.Chapter_38);
        titleArrayList.add(Constants.Chapter_39);
        titleArrayList.add(Constants.Chapter_40);
        titleArrayList.add(Constants.Chapter_41);
        titleArrayList.add(Constants.Chapter_42);
        titleArrayList.add(Constants.Chapter_43);




        image=new ArrayList<Integer>();
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);
        image.add(R.drawable.man);


        mRecyclerView= (RecyclerView) findViewById(R.id.title_layout_recyclerview);
        mRecyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager= new GridLayoutManager(mContext, 2,GridLayoutManager.VERTICAL,false);
        //mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mRecyclerView.setLayoutManager(gridLayoutManager);
        TitleAdapter titleAdapter = new TitleAdapter(mContext, titleArrayList,image, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position)
            {
                Context context;
                Intent in = new Intent(mContext,Description.class);
                in.putExtra("titles",titleArrayList.get(position));
                in.putExtra("image",image.get(position));
                startActivity(in);

               // Toast.makeText(mContext,"clicked"+ titleArrayList.get(position),Toast.LENGTH_SHORT).show();
            }

        });


        mRecyclerView.setAdapter(titleAdapter);
    }


}