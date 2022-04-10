package com.birdsanctuarysystem;

public class Parrot extends Bird implements Flyable{

    public Parrot(){
        super();
    }

    public Parrot(String id) {
        this.id = id;
        name = "Parrot";
        color = Color.GREEN;
    }
    @Override
    public void fly(){
        System.out.println("Parrot can fly");
    }
}
