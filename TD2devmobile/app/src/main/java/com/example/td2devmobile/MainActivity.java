package com.example.td2devmobile;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = (ImageView) findViewById(R.id.imageView12);
        img.setBackgroundResource(R.drawable.earth);
        AnimationDrawable animation = (AnimationDrawable) img.getBackground();
        animation.start();
    }
}
