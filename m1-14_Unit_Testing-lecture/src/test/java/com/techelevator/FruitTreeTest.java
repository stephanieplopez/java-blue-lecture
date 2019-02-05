package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class FruitTreeTest {
	
	// 1. instantiate class with a variable
	private FruitTree fruitTree;

	// mark it so this runs first -- mark it with an annotation
	
	@Before
	public void setup() {
		// Runs Before every test
		fruitTree = new FruitTree("Apple", 20);
	}
	
	// Used in rare cases
	@After
	public void cleanup() {
		// Runs After every test
	}
	
	// writing test itself
	@Test
	public void fruit_tree_has_20_fruits_when_created() {
		// Arrange
		// Act - single call to the method (Asking the class to do something)
		int piecesOfFruitLeft = fruitTree.getPiecesOfFruitLeft();
		// Assert -- be sure to use org.junit
		                   // the "expected value" -- but what we got back was piecesOfFruitLeft
		Assert.assertEquals(20, piecesOfFruitLeft);
	}
	
	@Test
	public void fruit_tree_starts_with_apples() {
		// Arrange
		// Act
		String typeOfFruit = fruitTree.getTypeOfFruit();
		// Assert
		Assert.assertEquals("Apple", typeOfFruit);
	}
	
	// What happens if I try to pick more fruit than there is to pick
	@Test
	public void no_fruit_picked_if_more_than_remaining_attempted() {
		// Arrange
		fruitTree.pickFruit(15);
		// Act
		boolean wasPicked = fruitTree.pickFruit(7);
		// Assert -- "Comment to see why it failed"
		Assert.assertFalse("PickFruit returned TRUE", wasPicked);
		// Possible side effect
		Assert.assertEquals("Wrong number of remaining fruit", 5, fruitTree.getPiecesOfFruitLeft());
	}

}
