package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    ImageView background, splashTop;
    LinearLayout textsplash, texthome, menus;
    Animation frombottom;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);

        background = (ImageView) findViewById(R.id.background);
        splashTop = (ImageView) findViewById(R.id.splashTop);
        textsplash = (LinearLayout) findViewById(R.id.textsplash);
        texthome = (LinearLayout) findViewById(R.id.texthome);

        background.animate().translationY(-1600).setDuration(1800).setStartDelay(1800);
        splashTop.animate().alpha(0).setDuration(1800).setStartDelay(1800);
        textsplash.animate().translationY(140).alpha(0).setDuration(1800).setStartDelay(2000);

        texthome.startAnimation(frombottom);
        menus.startAnimation(frombottom);

    }
}
