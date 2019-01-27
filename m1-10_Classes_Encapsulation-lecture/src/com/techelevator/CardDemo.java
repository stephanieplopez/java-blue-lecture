package com.techelevator;

public class CardDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
								  // suit, rank
		Card aceOfSpades = new Card("s","A");
		
		System.out.println(aceOfSpades);
		
		// Calling a method
		aceOfSpades.flip();
		System.out.println(aceOfSpades);
		
		// We next create a card
		Deck deckOfCards = new Deck();
		System.out.println(deckOfCards);
		
		Card nextCard = deckOfCards.deal();
		nextCard.flip();
		System.out.println(  nextCard );
		
		nextCard = deckOfCards.deal();
		nextCard.flip();
		System.out.println(  nextCard );
		
		deckOfCards.shuffle();
		System.out.println(deckOfCards);

	}

}
