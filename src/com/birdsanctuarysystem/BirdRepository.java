package com.birdsanctuarysystem;

import java.util.ArrayList;
import java.util.HashSet;
//import java.util.List;
import java.util.Set;

public class BirdRepository {
//    private List birdList = new ArrayList<>();
    private static BirdRepository instance;
	private Set<Bird> birdSet = new HashSet();
    
    public BirdRepository() {
		
	}
    
    static synchronized BirdRepository getInstance() {
    	if(instance == null) {
    		instance = new BirdRepository();
    	}
    	return instance;
    }
//    private void setBirdList(Set birdList){
//        this.birdList = birdList;
//    }

    public Set getBirdList(){
        return birdSet;
    }

    void add(Bird bird){
        birdSet.add(bird);
    }

    void remove(Bird bird){
        birdSet.remove(bird);
    }

    Bird getBird(String id){
        for(Bird bird: birdSet){
            if(bird.id.equals(id)){
                return bird;
            }
        }
        return null;
    }
}
