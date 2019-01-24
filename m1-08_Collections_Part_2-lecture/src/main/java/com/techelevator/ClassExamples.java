package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ClassExamples {

	public static void main(String[] args) {
		
		/*
		 * Map Examples
		 */
		
		/*
		 * Map<T1, T2> name = new HashMap<T1, T2>(), where T1 is the datatype of the key
		 * and T2 is the datatype of the value 
		 */
		Map<Integer, Boolean> ourMap = new HashMap<Integer, Boolean>();
		
		/*
		 * Add key value pairs to the Map using .put(key, value)
		 */
		//stored as UpperCase Integer
		ourMap.put(10, true);
		ourMap.put(20, false);
		
		/*
		 * Retrieve values from the Map using .get(key)
		 */
		// Autoboxes to lowercase Integer
		System.out.println("10 is " + ourMap.get(10));
		// It went from a lowercase Integer to an UpperCase integer
		boolean valueOf20 = ourMap.get(20);
		System.out.println("20 is " + valueOf20);
		
		/* Using the same key with a different value, replaces the value */
		// Must be unique
		ourMap.put(10, false);
		// By using put, we updated the value --8A notes
		System.out.println("10 is " + ourMap.get(10));
		
		// we are using it the same as an array
		// we can use it immediately as the variable type in it's value
		if (ourMap.get(20) == false) {
			System.out.println("20 is false");
		}
		
		Map<String, String> items = new HashMap<String, String>();
		// keys are case sensitive
		items.put("A1", "Chips");
		items.put("A2", "Soda");
		items.put("A3", "Candy");
		items.put("A4", "Soda");
		
		// Working the same was a vending machine
		System.out.println("A1 has " + items.get("A1"));
		
		/* Values can be empty or null */
		// Maps can ONLY use a for each loop
		
//		items.put("B1", "");
//		items.put("B1", null);
		

		
		/* 
		 * We can use a for each to loop through the keySet, which is a list of the keys
		 * in the map
		 */

		
		for (String key : items.keySet()) {
			System.out.println(key + " contains" + items.get(key));
			
			//
			if (items.get(key).equals("Chips")) {
				System.out.println("Chips are at " + key);
				
			}
		}
		
		/* 
		 * Items can be removed using .remove(key)
		 */
		// If our map items contains key
		if (items.containsKey("A3") == true) {
			System.out.println("Map contains A3");
		}
		// calling remove, the key and the value
		items.remove("A3");
		
		// Does it contain the key we removed?
		if (items.containsKey("A3") == false) {
			// Because of the items.remove above it now returns true
			System.out.println("A3 had been removed");
		}
		
		
		/*
		 * .containsKey(key) can be used to see if the map has a key with
		 * that value
		 */

		/*
		 * Solve the problem in the method below
		 */
		 // This is the test case that runs
		 Map<String, Integer> amountMap = new HashMap<String, Integer>();
		 amountMap.put("Joe", 100);
		 amountMap.put("Steve", 200);
		
		 for (String key : amountMap.keySet()) {
		 	System.out.println(key + " Starts with $" + amountMap.get(key));
		 }
		
		 amountMap = giveHalfOfJoesMoneyToSteve(amountMap);
		
		 for (String key : amountMap.keySet()) {
		 	System.out.println(key + " now has $" + amountMap.get(key));
		 }


		/*
		 * Set Examples
		 */

		/*
		 * Set<T> name = new HashSet<T>, where T is the datatype the set will hold
		 * HashSet does not preserve order
		 * Sets only allow unique values
		 * If we add a duplicate value, it does not error but is not not added
		 */
		 // Remember to import Set and HashSet
		 
		Set<Integer> numbers = new HashSet <Integer>();
		numbers.add(10);
		numbers.add(12); 
		numbers.add(10);
		numbers.add(10);
		numbers.add(8);
		numbers.add(502); 
		
		// 10 was only added 1 time and it counts 4 total
		// Generally you don't keep things in a set, you hold them there temp
		System.out.println(numbers.size());
		 
		/*
		 * Set has not get method and the items cannot be accessed by index, so we must use
		 * for each to get the values
		 */
		for (Integer i : numbers) {
			// After it loops it will not return the list in the same order
			System.out.println(i);
		}
		
		/*
		 * TreeSet works like HashSet, but maintains natural order
		 */

		Set<Integer> numberTree = new TreeSet <Integer>();
		numbers.add(10);
		numbers.add(12); 
		numbers.add(10);
		numbers.add(10);
		numbers.add(8);
		numbers.add(502); 
		
		System.out.println(numberTree.size());
		 /*
		  * For the map amountMap, it contains key Joe and Steve and the amount of money each one has 
		  * Give half of Joe's money to Steve and return the map with the new values
		  */
		
	}
	
	public static Map<String, Integer> giveHalfOfJoesMoneyToSteve(Map<String, Integer> amountMap) {
		// First thing we do is get Joe's half ofthe money
		// it's not a double so we are using int
		// We store division one time -- is important, 
		int halfOfJoesMoney = amountMap.get("Joe") / 2;
		
		amountMap.put("Joe", halfOfJoesMoney);
		// Updating Steve Money       Getting Steve's Original Money 
		//							        gets 200  + 50
		amountMap.put("Steve", amountMap.get("Steve") + halfOfJoesMoney);
		amountMap.put("Joe", amountMap.get("Joe") - halfOfJoesMoney);
		// Update amount in map
		
		return amountMap;
	}

}
