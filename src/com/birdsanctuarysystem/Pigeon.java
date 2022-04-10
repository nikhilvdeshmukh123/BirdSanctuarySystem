package com.birdsanctuarysystem;

public class Pigeon extends Bird implements Flyable{

    public Pigeon(){
        super();
    }

    public Pigeon(String id) {
        this.id = id;
        name = "Pigeon";
        color = Color.RED;
    }

    @Override
    public void fly() {
        System.out.println("Pigeon can fly");
    }
}
