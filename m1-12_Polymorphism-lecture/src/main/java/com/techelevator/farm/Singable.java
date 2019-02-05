package com.techelevator.farm;

public interface Singable {
	
	// Adding signature doesn't need 'public, because interfaces are always public
	// Interfaces are often small, no code is stored 
	String getName();
	String getSound();
	
}
