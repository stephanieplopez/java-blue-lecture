package com.techelevator.farm;

// A cow is a farmAnimal and implements Sellable
public class Cow extends FarmAnimal implements Sellable {

	public Cow() {
		super("Cow", "moo!", 1500);
	}

}