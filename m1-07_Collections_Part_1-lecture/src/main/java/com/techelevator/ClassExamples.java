package com.techelevator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ClassExamples {

	public static void main(String[] args) {
		
		// without using the "import"
		// We are declaring we want to use this package
//		java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now ();
//		System.out.println(currentDateTime.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-DD")));
			
		// With import
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-DD")));
		
		// We start with interface
		// Then we import some list
		List<String> names = new ArrayList<String>();
		// Now we 'add' names
		names.add("John");
		names.add("Bob");
		names.add("Sue");
		names.add("Jane");
		
		//size is the same as length, but we need to remember to use that instead of length
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		names.remove("Bob");
		System.out.println(names.size());
	
		names.set(0, "Sally");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		if (names.contains("Sue")) {
			System.out.println("List Contains Sue");
		}
		if (names.contains("Joe") == false) {
			System.out.println("List does not Contains Joe");
		}
		// Only an object can go here <T> any object can go here
		List<Integer> numbers = new ArrayList<Integer>();
		// adding a number to the ArrayList
		numbers.add(1);
		// Auto unboxed from Integer to integer so we can use the value to add
		int z = numbers.get(0) + 5;
		// OR:
		// Integer z = numbers.get(0) + 5
		System.out.println(z);
		
		// Additional example of Boolean
		List<Boolean> booleans = new ArrayList<Boolean>();
		booleans.add(true);
		
		
		
		//Comparing for and For each loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		System.out.println("-----------------------");
		
		for (String currentName : names) {
			System.out.println(currentName);
		}
		int [] nums = { 1, 2, 3, 4, 5 };
		// Define a variable type THEN the variable 
		for (int number : nums) {
			System.out.println(number);
		}
		
		// Example of List Autoboxing with a for each loop
		List<Integer> iNums = new ArrayList<Integer>();
		iNums.add(6);
		iNums.add(7);
		iNums.add(8);
		
		for (int number: iNums) {
			System.out.println(number);
		}
		System.out.println("\n-----------------------\n");
		
		// Write code and then imported Queue and LinkedList
		Queue<String> ourQueue = new LinkedList<String>();
		ourQueue.offer("Joe");
		ourQueue.offer("Nancy");
		ourQueue.offer("Jill");
		
		for (String name: ourQueue) {
			System.out.println(name);
		}
		// Poll removes Joe and moves Nancy and Jill up in the queue
		String next = ourQueue.poll();
		System.out.println("Now Serving " + next);
		
		
		// Peek is a lookahead but doesn't remove anything 
		// Ex: Email
		ourQueue.offer("Bill");
		String whoIsNext = ourQueue.peek();
		System.out.println(whoIsNext + " is next in line");
		
		// Checks if the queue is empty or not
		while(ourQueue.isEmpty() == false) {
			System.out.println(ourQueue.poll());
		}
		
		System.out.println("\n-----------------------\n");
		// Reverses list and removes them -- ex: CTRL Z, browser history
		Stack<String> ourStack = new Stack<String>();
		
		ourStack.push("Sue");
		ourStack.push("Bill");
		ourStack.push("Steve");
	
		while (ourStack.isEmpty() == false) {
//			String person = ourStack.pop();
//			System.out.println(person);
			System.out.println(ourStack.pop());
			
		}
		
		
		
		
		
		
	}
}
