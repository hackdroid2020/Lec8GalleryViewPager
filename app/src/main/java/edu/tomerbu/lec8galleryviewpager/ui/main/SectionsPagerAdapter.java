package edu.tomerbu.lec8galleryviewpager.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import edu.tomerbu.lec8galleryviewpager.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentStatePagerAdapter{
    private final Context mContext;
    //we need an array of imageRES
    int[] images = {R.drawable.back_1, R.drawable.chat, R.drawable.magic_ball, R.drawable.unit};
    String[] titles = {"Back", "Chat", "Ball" ,"Unit"};

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a GalleryFragment (defined as a static inner class below).
        return GalleryFragment.newInstance(images[position]);
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
    @Override
    public int getCount() {
        //# of total pages.
        return images.length;
    }
}