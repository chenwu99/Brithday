package com.example.brithday.Activity.Activity.Activity.Activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.brithday.Activity.Fragment.L_Fragment;
import com.example.brithday.R;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        editText=findViewById(R.id.edittext);
        editText.setOnClickListener(this);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((editText.getText().toString()).equals("chenwu990728")){
                    Toast.makeText(Main3Activity.this, "Nice", Toast.LENGTH_SHORT).show();
                    replaceFragment(new L_Fragment());
                }
                else {
                    Toast.makeText(Main3Activity.this, "Wrong,下面是跟苏小杭的悄悄话奥", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {

    }

    private  void replaceFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment,fragment).commit();
    }

}
