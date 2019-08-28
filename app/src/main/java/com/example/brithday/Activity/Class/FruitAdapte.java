package com.example.brithday.Activity.Class;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.brithday.R;
//import com.example.myapplication6.R;

import java.util.List;

public class FruitAdapte extends RecyclerView.Adapter<FruitAdapte.ViewHolder>{
    private List<Fruit>mFruitList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView fruitImage;
        TextView fruitName;
        View fruitView;
        public ViewHolder(View view){
            super(view);
            fruitView =view;
            fruitImage=(ImageView) view.findViewById(R.id.fruit_image);
            fruitName=(TextView) view.findViewById(R.id.fruit_name);
        }
    }//内部类，view是Recycleview子项最外层的布局。

    public FruitAdapte(List<Fruit>fruitList){
        mFruitList=fruitList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int i) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item,parent,false);
        final ViewHolder holder=new ViewHolder(view);
        holder.fruitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int poistion=holder.getAdapterPosition();
                Fruit fruit=mFruitList.get(poistion);
//                Toast.makeText(v.getContext(),"这么丑的你"+fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });

        holder.fruitImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position=holder.getAdapterPosition();
                Fruit fruit=mFruitList.get(position);
//                Toast.makeText(v.getContext(),"真丑"+fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });

        return holder;
    }//创建ViewHolder实例，加载fruit_xml布局，然后把fruit_xml布局传入到构造函数中，最后返回ViewHolder返回。

    @Override
    public void onBindViewHolder( ViewHolder viewHolder, int poistion) {
        Fruit fruit=mFruitList.get(poistion);
        viewHolder.fruitImage.setImageResource(fruit.getImageID());
        viewHolder.fruitName.setText(fruit.getName());

    }//通过position获取当前Fruit实例，再将数据设置到ViewHolder的ImageView和Textview.



    @Override
    public int getItemCount() {
        return mFruitList.size();
    }//作用：告诉 Recycleview 一共有多少子项，直接返回数据源的长度。
}
