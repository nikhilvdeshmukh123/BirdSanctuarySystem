package com.birdsanctuarysystem;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	private static UserInterface instance;
	private UserInterface(){
		
	}
	
	static synchronized UserInterface getInstance() {
		if(instance == null) {
			instance = new UserInterface();
		}
		return null;
	}
    int showMainMenu(){
        System.out.println("Enter\n 1: Add bird\n 2: Remove bird \n 3: Edit bird \n 4: Print bird \n " +Main.MAINEXIT +": Exit");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return n;
    }

    void print(Set birdSet){
        for (Object bird: birdSet){
            System.out.println(bird);
        }
    }

    void printFlyable(Set<Bird> birdSet){
        for(Bird bird : birdSet){
            if(bird instanceof Flyable){
//                ((Flyable)bird).fly();
                Flyable flyableBird = (Flyable)bird;
                flyableBird.fly();
            }
        }
    }
    void printSwimmable(Set<Bird> birdSet){
        for(Bird bird : birdSet){
            if(bird instanceof Swimmable){
//                ((Swimmable)bird).swim();
                Swimmable swimmableBird = (Swimmable)bird;
                swimmableBird.swim();
            }
        }
    }
    
    
    
    
    
}