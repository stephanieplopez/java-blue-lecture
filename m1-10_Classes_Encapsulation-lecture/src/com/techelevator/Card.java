package com.techelevator;

public class Card {
	// Property
	private String suit;
	
	// String
	private String rank;
	private boolean faceUp = false;
	
	public Card(String suit, String rank) {
		// this (instance) is referring to that individual card (suit comes from constructor)
		this.suit = suit;
		this.rank = rank;
	}
	
	// Getters
	
	public String getSuit() {
		return this.suit;
	}
	
	public String getRank() {
		return this.rank;
	}
	
	// For boolean you can have is instead of get
	public boolean isFaceUp() {
		return this.faceUp;
	}
	
	// this statment is asking 'is
	public boolean flip () {
		// opposite state
		faceUp = !faceUp;
		return faceUp;
	}
	
	// Take into consideration what it shows
	@Override
	public String toString() {
		if (faceUp) {
			return rank + suit;
		} else {
			return "##";
		}
	}
	
	
}
