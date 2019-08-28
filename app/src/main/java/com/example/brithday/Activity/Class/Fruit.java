package com.example.brithday.Activity.Class;

public class Fruit {

    private String name;
    private int imageID;
    public Fruit(String n, int i){
        name=n;
        imageID=i;
    }

    public String getName(){
        return name;
    }

    public int getImageID(){
        return imageID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }
}
