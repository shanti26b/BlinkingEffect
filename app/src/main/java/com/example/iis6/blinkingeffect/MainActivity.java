package com.example.iis6.blinkingeffect;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {

    TextView textView;
    Button  buttonlink;
    Animation animationlink;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        buttonlink = (Button) findViewById(R.id.button);
        animationlink = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
        animationlink.setAnimationListener(this);

        buttonlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setVisibility(View.VISIBLE);
                {
                    textView.startAnimation(animationlink);
                }
            }
        });

    }


    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        if (animation == animationlink) {

        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
