package com.example.kamabi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class ViewpagerAdapter extends PagerAdapter {
    Context mContext ;
    List<ItemOnboarding> mItemOnboarding;

    public ViewpagerAdapter(Context mContext, List<ItemOnboarding> mListScreen) {
        this.mContext = mContext;
        this.mItemOnboarding = mListScreen;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutScreen = inflater.inflate(R.layout.layout_onboarding,null);

        ImageView imgSlide = layoutScreen.findViewById(R.id.slider_image);
        TextView title = layoutScreen.findViewById(R.id.slider_heading);
        TextView description = layoutScreen.findViewById(R.id.slider_desc);

        title.setText(mItemOnboarding.get(position).getTitle());
        description.setText(mItemOnboarding.get(position).getDescription());
        imgSlide.setImageResource(mItemOnboarding.get(position).getScreenImg());

        container.addView(layoutScreen);

        return layoutScreen;

    }

    @Override
    public int getCount() {
        return mItemOnboarding.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {

        container.removeView((View)object);

    }
}
