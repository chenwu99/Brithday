package com.example.brithday.Activity.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.brithday.R;


public class L_Fragment extends Fragment {


    private int count=0;
    private ImageView imageview;
    //private TextView textView;
    int [] photo={R.drawable.c2,R.drawable.c1,R.drawable.c3,R.drawable.c4,R.drawable.enene};
    //Stirng [] name={"mt","cc"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            imageview.setImageResource(photo[(0+count)%5]);
            super.handleMessage(msg);
        }
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
    View view= inflater.inflate(R.layout.fragment_l_, container, false);
    imageview=view.findViewById(R.id.cm);

        new Thread(){
        @Override
        public void run() {
            super.run();
            while(true) {
                count++;
                handler.sendMessage(new Message());
                try{
                    sleep(1500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }.start();
        return view;
}





}
