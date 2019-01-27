package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	//With arrays, we have a shortcut
	private final static String[] SUITS = {"c","s","d","h"};
	private final static String[] RANKS = {"A","2","3","4","5","6","7","8","9","T","J","Q","K"};
	
	// Cards are set to private to keep info private
	private List<Card> listOfCards = new ArrayList<Card>();
	
	// How to hold deck
	public Deck() {
		// Loops through suit and creates suit
		for (String suit : SUITS) {
			// loops through ranks and creates it
			for (String rank : RANKS) {
				// We create the card
				Card currentCard = new Card(suit, rank);
				// then add it to our deck
				listOfCards.add(currentCard);
			}
		}
	}
	
	public Card deal() {
		// We need to get a card the top card from the deck
		if (size() != 0) {
		return listOfCards.remove(0);
		} else {
			//can't return an empty string here, because we beed to return a card, so we list null
			return null;
		}
	}
	
	public void shuffle() {
		// Lists are collections
		Collections.shuffle(listOfCards);
	}
	
	
	// Delegate method -- delegate the size of the cards (allows for access to list of cards (array)
	public int size() {
		return listOfCards.size();
	}
	
	
	private void flip() {
		for (Card card : listOfCards) {
			card.flip();
		}
	}
	
	
	@Override
	public String toString() {
		// We turn the card over by caling flip()
		this.flip();
		String flippedCards = "Deck [listOfCards=" + listOfCards + "]";
		// We have to flip it back over to return
		this.flip();
		return flippedCards;
	}
	
}
