package edu.tomerbu.lec8galleryviewpager.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import edu.tomerbu.lec8galleryviewpager.R;


public class GalleryFragment extends Fragment {

    private int imageRes;

    //ctor replacement:
    public static GalleryFragment newInstance(int imageRes) {

        Bundle args = new Bundle();
        args.putInt("image", imageRes);
        GalleryFragment fragment = new GalleryFragment();
        fragment.setArguments(args);
        return fragment;
    }



    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        ImageView iv = root.findViewById(R.id.image_gal);

        imageRes = getArguments().getInt("image");

        iv.setImageResource(imageRes);

        return root;
    }
}