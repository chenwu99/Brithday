package com.example.brithday.Activity.Activity.Activity.Activity;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.webkit.WebView;

import com.example.brithday.R;

import static android.view.KeyEvent.KEYCODE_BACK;

public class starActivity extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //getSupportActionBar().hide();//隐藏标题栏;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star);
        ConstraintLayout layouts=(ConstraintLayout) findViewById(R.id.star);
        AlphaAnimation alphaAnimation=new AlphaAnimation(0.1f,1.0f);
        alphaAnimation.setDuration(1500);
        layouts.startAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent=new Intent(starActivity.this,Main2Activity.class);
                startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KEYCODE_BACK) && webView.canGoBack()) {
            webView.goBack();
            return true;
        }
        return (boolean) super.onKeyDown(keyCode, event);
    }

}