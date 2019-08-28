package com.example.brithday.Activity.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.brithday.Activity.Class.Fruit;
import com.example.brithday.Activity.Class.FruitAdapte;
import com.example.brithday.R;

import java.util.ArrayList;
import java.util.List;


public class R_Fragment extends Fragment {

    private List<Fruit> fruitList=new ArrayList<>();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_r_, container, false);
        initFruits();
        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.recycle_view);
        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapte adapte =new FruitAdapte(fruitList);
        recyclerView.setAdapter(adapte);
        return view;
    }

    private void initFruits() {
        for (int i = 0; i < 1; i++) {
            Fruit apple = new Fruit("2015，我们初中毕业", R.drawable.r7);
            fruitList.add(apple);
            Fruit banana = new Fruit("2018，我们一中毕业", R.drawable.r1);
            fruitList.add(banana);
            Fruit orange = new Fruit("2018，我们一起参加升学宴",R.drawable.r2);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("2018，我们在黑大", R.drawable.r8);
            fruitList.add(watermelon);
            Fruit grape = new Fruit("2018，我们一起国庆回家", R.drawable.r3);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("2019，我们一起跨年", R.drawable.r4);
            fruitList.add(pineapple);
            Fruit cherry = new Fruit("2019，我们大一期末", R.drawable.c99);
            fruitList.add(cherry);
            Fruit cherr = new Fruit("今天，我们一起过生日，下次小皮不要缺席啊", R.drawable.r5);
            fruitList.add(cherr);

        }
    }


}
