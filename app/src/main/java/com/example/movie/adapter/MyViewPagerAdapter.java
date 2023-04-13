package com.example.movie.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.movie.fragments.FreeFragment;
import com.example.movie.fragments.HighlyRatedFragment;
import com.example.movie.fragments.HomeFragment;
import com.example.movie.fragments.KidAndFamilyFragment;
import com.example.movie.fragments.RecentlyAddedFragment;

public class MyViewPagerAdapter extends FragmentStateAdapter {

    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new FreeFragment();
            case 2:
                return new HighlyRatedFragment();
            case 3:
                return new RecentlyAddedFragment();
            case 4:
                return new KidAndFamilyFragment();
            default:
                return new HomeFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
