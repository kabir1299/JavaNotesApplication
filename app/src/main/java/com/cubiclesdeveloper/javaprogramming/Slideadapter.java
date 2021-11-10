package com.cubiclesdeveloper.javaprogramming;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Slideadapter extends PagerAdapter
{
    int[] images;
    LayoutInflater layoutInflater;
    Context context;

    public Slideadapter(int[] images, Context context) {
        this.images = images;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View myImageLayout = layoutInflater.inflate(R.layout.slide_images,container, false);
        ImageView imageview = myImageLayout.findViewById(R.id.imageview);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            imageview.setImageDrawable(context.getDrawable(images[position]));
        }else {
            imageview.setImageDrawable(context.getResources().getDrawable(images[position]));
        }

        container.addView(myImageLayout);

        return myImageLayout;
    }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }
}
