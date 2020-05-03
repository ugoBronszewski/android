package com.example.td2devmobile.ui.earth;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.td2devmobile.R;

public class EarthFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_main, container, false);
        ImageView img = (ImageView) root.findViewById(R.id.imageView12);
        img.setBackgroundResource(R.drawable.earth);
        AnimationDrawable animation = (AnimationDrawable) img.getBackground();
        animation.start();
        return root;
    }
}
