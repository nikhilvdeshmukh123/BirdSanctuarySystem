package com.birdsanctuarysystem;

public class Duck extends Bird implements Flyable, Swimmable{

    public Duck(){
        super();
    }

    public Duck(String id) {
        this.id = id;
        name = "Duck";
        color = Color.CYAN_GREEN;
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}
