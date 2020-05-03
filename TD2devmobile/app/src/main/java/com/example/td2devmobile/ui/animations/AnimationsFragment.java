package com.example.td2devmobile.ui.animations;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.td2devmobile.R;

public class AnimationsFragment extends Fragment {

    private boolean[] states = new boolean[5];
    private View root;
    private TextView timeLabel;
    private SeekBar timeSlider;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.activity_main, container, false);

        timeLabel = (TextView) root.findViewById(R.id.timeLabel);
        timeSlider = (SeekBar) root.findViewById(R.id.timeSlider);

        timeLabel.setText(String.valueOf(timeSlider.getProgress()));

        timeSlider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                timeLabel.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        return root;
    }

    public void fadeAnimation(View view) {
        Button fadeBtn = (Button) view;
        Animation animation;

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        fadeBtn.startAnimation(animation);
        fadeBtn.setVisibility(View.INVISIBLE);

        states[0] = true;
    }

    public void scaleAnimation(View view) {
        Button scaleBtn = (Button) view;
        Animation animation;

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
        scaleBtn.startAnimation(animation);
        scaleBtn.setVisibility(View.INVISIBLE);

        states[1] = true;
    }

    public void outAnimation(View view) {
        Button translateBtn = (Button) view;
        Animation animation;

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.out);
        translateBtn.startAnimation(animation);
        translateBtn.setVisibility(View.INVISIBLE);

        states[2] = true;
    }

    public void fadeAndScaleAnimation(View view) {
        Button fadeAndScaleBtn = (Button) view;
        Animation animation;

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_and_scale);
        fadeAndScaleBtn.startAnimation(animation);
        fadeAndScaleBtn.setVisibility(View.INVISIBLE);

        states[3] = true;
    }

    public void tvOffAnimation(View view) {
        Button tvOffBtn = (Button) view;
        Animation animation;

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.tv_off);
        tvOffBtn.startAnimation(animation);
        tvOffBtn.setVisibility(View.INVISIBLE);

        states[4] = true;
    }

    public void appearAnimation() {
        Button[] btns = {
                (Button) root.findViewById(R.id.fadeBtn),
                (Button) root.findViewById(R.id.scaleBtn),
                (Button) root.findViewById(R.id.outBtn),
                (Button) root.findViewById(R.id.fadeAndScaleBtn),
                (Button) root.findViewById(R.id.tvOffBtn),
        };
        Animation animation;

        animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.appear);
        animation.setDuration(Integer.parseInt(this.timeLabel.getText().toString()));
        animation.setInterpolator(new OvershootInterpolator());

        for (int i = 0; i < btns.length; i++) {
            if (states[i]) {
                btns[i].startAnimation(animation);
                btns[i].setVisibility(View.VISIBLE);

                states[i] = false;
            }
        }
    }
}
