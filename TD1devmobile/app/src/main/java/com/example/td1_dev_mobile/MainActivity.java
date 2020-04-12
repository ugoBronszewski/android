package com.example.td1_dev_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View view){
        TextView t = (TextView) findViewById(R.id.message);
        t.setText("Au revoir");
    }

    public void changeImage(View view) {
        ImageView img1 = (ImageView) findViewById(R.id.img1);
        ImageView img2 = (ImageView) findViewById(R.id.img2);

        if (img1.getVisibility() == View.VISIBLE) {
            img1.setVisibility(View.INVISIBLE);
            img2.setVisibility(View.VISIBLE);
        } else {
            img2.setVisibility(View.INVISIBLE);
            img1.setVisibility(View.VISIBLE);
        }
    }

    public void compteurAdd(View view) {
        TextView t = (TextView) findViewById(R.id.compteur);

        int compteur = parseInt(t.getText().toString());
        compteur++;
        t.setText(String.valueOf(compteur));
    }

    public void compteurMinus(View view) {
        TextView t = (TextView) findViewById(R.id.compteur);

        int compteur = parseInt(t.getText().toString());
        compteur--;
        t.setText(String.valueOf(compteur));
    }
}
