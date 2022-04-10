package com.birdsanctuarysystem;

public class Penguin extends Bird implements Swimmable{

    public Penguin(){
        super();
    }
    public Penguin(String id) {
        this.id = id;
        name = "Penguin";
        color = Color.BLACK_WHITE;
    }
    @Override
    public void swim(){
        System.out.println("Penguin can swim");
    }
}
