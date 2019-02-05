package com.techelevator.farm;

// We have to add all the method
// Tractor isn't a farm animal and that's why we added an interface
public class Tractor implements Singable, Sellable {

	@Override
	public String getName() {
		return "Tractor";
	}
	
	@Override
	public String getSound() {
		return "Vrooom";
	}
	
	@Override
	public int getPrice() {
		return 2000;
	}
}
