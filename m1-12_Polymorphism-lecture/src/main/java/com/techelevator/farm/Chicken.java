package com.techelevator.farm;

public class Chicken extends FarmAnimal implements Sellable {
	
	
	public Chicken() {
		this(false);
	}
	
	// Constructor
	
	public Chicken(boolean sleeping) {
		super("Chicken", "cluck!", 25, sleeping);
	}
	
	// contains layEgg() method only specific to this class
	public void layEgg() {
		System.out.println("Chicken laid an egg!");
	}
	
	@Override
	public String eat() {
		return "The Chicken is eating";
	}

}