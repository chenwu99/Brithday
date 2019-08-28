package com.example.brithday.Activity.Activity.Activity.Activity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.brithday.Activity.Class.yypService;
import com.example.brithday.Activity.Fragment.L_Fragment;
import com.example.brithday.Activity.Fragment.R_Fragment;
import com.example.brithday.Activity.Fragment.S_Fragment;
import com.example.brithday.Activity.MainActivity;
import com.example.brithday.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = new Intent(Main2Activity.this, yypService.class);
        startService(intent);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        replaceFragment(new R_Fragment());//显示记录的界面
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.sheng:
//                    textView.setText("小柚子");
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                    startActivity(intent);
//                    replaceFragment(new S_Fragment());
                    return true;
                case R.id.ri:
//                    textView.setText("她她圈");
                    replaceFragment(new R_Fragment());
                    return true;
                case R.id.kuai:
//                    textView.setText("记录");
                    replaceFragment(new L_Fragment());
                    return true;

            }
            return false;
        }
    };

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        Intent intent = new Intent(Main2Activity.this,yypService.class);
        stopService(intent);
        super.onStop();
    }
       private  void replaceFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment,fragment).commit();
    }

}
