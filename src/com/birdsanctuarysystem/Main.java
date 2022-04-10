package com.birdsanctuarysystem;

import java.util.Scanner;

public class Main {
//	BirdRepository birdRepository = new BirdRepository();	
//	UserInterface ui = new UserInterface();
	
    Scanner scanner = new Scanner(System.in);
    static final int MAINEXIT = 5;
    	
    void addBird(){
        //TO-DO Bird creation via user input
        Bird penguin = new Penguin("png001");
        Bird penguin2 = new Penguin("png001");
        Bird duck = new Duck("dk002");
        Bird ostrich = new Ostrich("os003");
        Bird parrot = new Parrot("prt004");
        Bird pigeon =  new Pigeon("pgn005");
        
        BirdRepository birdRepository = BirdRepository.getInstance();
       
        birdRepository.add(duck);
        birdRepository.add(penguin);
        birdRepository.add(penguin2);
        birdRepository.add(parrot);
        birdRepository.add(ostrich);
        birdRepository.add(pigeon);
    }

    void handleUserSelection(int option) {
        BirdRepository birdRepository = BirdRepository.getInstance();
        UserInterface ui = UserInterface.getInstance();
        switch (option) {
            case 1:
                addBird();
                break;
            case 2:
            	
                System.out.println("Enter bird ID to remove");
                String id = scanner.nextLine();
                Bird remoBird = birdRepository.getBird(id);
                birdRepository.remove(remoBird);
                
                break;
            case 3:
            	
            	
                break;
            case 4:
            	ui.print(birdRepository.getBirdList());
                break;
            case MAINEXIT:
                System.out.println("Bye");
                break;
            default:
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Bird Sanctuary");
        Main main = new Main();
        int option;
        do {
            option = ui.showMainMenu();
            main.handleUserSelection(option);
        }
        while(option != MAINEXIT);




//        UserInterface ui = new UserInterface();
//        ui.print(birdRepository.getBirdList());
//        birdRepository.remove(pigeon);
//        birdRepository.remove(parrot);
//        System.out.println("Removed pigeon and parrot");
//        ui.print(birdRepository.getBirdList());
//    }


}