package com.example.brithday.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.brithday.Activity.Class.yypService;
import com.example.brithday.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this, yypService.class);
        startService(intent);
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        Intent intent = new Intent(MainActivity.this,yypService.class);
        stopService(intent);
        super.onStop();
    }
}