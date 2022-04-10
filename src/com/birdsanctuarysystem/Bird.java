package com.birdsanctuarysystem;

import java.util.Objects;

public abstract class Bird {
    enum Color {RED, GREEN, WHITE, BLACK_WHITE, CYAN_GREEN}
    String id;
    String name;
    Color color;

    void eat(){
        System.out.println(getClass().getSimpleName() + " eats");
    }

    void fly(){
        System.out.println(getClass().getSimpleName() + " can fly");
    }

    void swim(){
        System.out.println(getClass().getSimpleName() + " can swim");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bird bird = (Bird) o;
        return Objects.equals(id, bird.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
