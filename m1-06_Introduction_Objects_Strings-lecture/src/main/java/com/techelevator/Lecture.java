package com.techelevator;


public class Lecture {

	public static void main(String[] args) {

		String str = "TechElevator";
		/*
		 * charAt returns the character a given index in the string
		 */

		char c = str.charAt(4);
		System.out.println(c);
		
		/*
		 * calling a METHOD length - return the count of the characters in the string
		 */
		int length = str.length();
		System.out.println(length);
		
		/*
		 * sub string - returns part of a string, where the first number is the beginning index (inclusive) and the 
		 * second number is the ending index (exclusive)
		 */
		
		String sub = str.substring(2, 5);
		System.out.println(sub);
		
		// To get the end of the string, just give the starting index
		String tor = str.substring(9);
		System.out.println(tor);
		
		/*
		 *  contains(), startsWith(), endsWith()
		 */
		boolean contains = str.contains("El");
		if (contains) {
			System.out.println("El " + contains);
		}
		if (contains == false) {
			System.out.println("el " + contains);
		}
		
		/*
		 * toUpperCase(), toLowerCase()
		 */
		String upperCaseStr = str.toUpperCase();
		System.out.println("Original " + str);
		System.out.println("Upper " + str);
		// This is okay to use if you don't need to call this returned value again
//		System.out.println(str.toUpperCase());
		
		/*
		 * indexOf() - gives index of FIRST occurrence
		 */
		int index = str.indexOf("El");
		
		System.out.println(index);
		
		/*
		 *  replace() - replaces value with 
		 */
		// Variable to hold it
		String replace = str.replace("e", "-");
		System.out.println(replace);
		
		// Can have it replace letters next to it, but not multiple letters
		String replaceTe = str.replace("Te", "-");
		System.out.println(replace);
	
		/*
		 * trim() - removes leading and ending spaces
		 */
		String trim = " Hello ".trim();
		System.out.println("::" + trim + "::");
		
		/*
		 *  split()
		 */
		String nums = "One two three four";
		String[] splitString = nums.split(" ");
		// this does NOT work
		// System.out.println(splitString);
		
		/*
		 *  join() - opposite of split, joins together 
		 */
		String one = "One";
		String three = "Three";
		// variable to hold this string
		String joined = String.join(" < ", one, "Two", three, "Four");
		System.out.println(joined);
		
		char[] awesomeArray = new char[] { 'A', 'w','e','s','o','m','e', };
		String awesomeString1 = new String(awesomeArray);
		System.out.println(awesomeString1);
		// New object and that's why it will not be equal
		String awesomeString2 = new String(awesomeArray);
		if (awesomeString1.equals(awesomeString2)) {
			System.out.println("Equal");
		}
		String awesomeString3 = awesomeString1;
		if (awesomeString1 == awesomeString3) {
			System.out.println("1 nd 3 are ==");
		}
		//.equals compares the word
		if (awesomeString1.equals(awesomeString3)) {
			System.out.println("1 and 3 are .equals");
		}
		
//		}	
//	}		
//}
		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");
		
		/* The String class gets special treatment in the Java language.  One 
		 * example of this is that there is a literal representation of a 
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */
		
		String greeting = "Hello, World!";  // creates a new instance of String using a literal
		System.out.println("greeting : "+greeting);
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();
		
		/* Below are examples of calling various String methods */
		
		System.out.println("***** charAt *****");
		
		String name = "Obama";
		char first = name.charAt(0);   // 'O'
		char fourth = name.charAt(3);  // 'm'
		System.out.println(name);
		System.out.println(first);
		System.out.println(fourth);
		
		
		System.out.println("***** contains *****");
		String hello = "Hello World!";
		System.out.println("hello : "+hello);
		boolean containsHello = hello.contains("Hello");
		System.out.println("containsHello : "+containsHello);
		boolean containsBogus = hello.contains("bogus");
		System.out.println("containsBogus : "+containsBogus);
		
		/* Other commonly used methods:
		 * 
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */
		
		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();
		
		char[] helloArray = new char[] { 'H', 'e', 'l', 'l', 'o' };
		String hello1 = new String(helloArray);
		String hello2 = new String(helloArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if(hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1+" is not equal to "+hello2);
		}
		
		String hello3 = hello1;
		if(hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}
		
		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		
		if(hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1+" is not equal to "+hello2);
		}
		
	}
}
