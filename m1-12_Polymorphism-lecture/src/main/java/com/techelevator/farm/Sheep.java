package com.techelevator.farm;

public class Sheep extends FarmAnimal {
	
	public Sheep() {
		this(false);
	}
	
	
	// The constructor does not have to match the superclass
	// We removed 
	public Sheep(boolean sleeping) {
		super("Sheep", "Baaa", 0, sleeping);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String eat() {
		return "The Chicken is eating";
	}

	

}
