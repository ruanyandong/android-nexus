package com.example.rotate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.text);
        //Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotate);
        //text.startAnimation(animation);
        RotateAnimation rotateAnimation = new RotateAnimation(0,-650,Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotateAnimation.setDuration(3000);
        rotateAnimation.setFillAfter(true);
        text.startAnimation(rotateAnimation);
    }
}
