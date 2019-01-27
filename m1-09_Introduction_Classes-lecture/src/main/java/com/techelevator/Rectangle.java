package com.techelevator;

public class Rectangle {
//if this is changed to private the user can't see this 
	// We start by giving it properties
	// We need to consider who can access this
	// Getter/Setter set properties for member variables
	
	/*
	 * Member Variables
	 */
	
	
	private int height;
	private int width;
	
	
	/*
	 * Constructor
	 * Has no return type, and name must match class name
	 * If no explicit constructor is given this no-argument constructor is the default
	 */
	
	public Rectangle () {

	}
	
	/*
	 * Constructor Override
	 * Once a constructor override is created, then the no-argument constructor
	 * must be explicitly created (as above)
	 */
	
	public Rectangle(int height, int width) {
		this.height = Math.abs(height);
		this.width = Math.abs(width);
	}
	
	/*
	 * Getters/Setters
	 */
	
	
	// Usually will be private with get
	public int getHeight() {
		return height;
	}
	
	// void means we are not return anything -- takes varabile
	// setter 
	// we want the one in this class -- this internal thing
	// Here in this object use this variable and set the value to this variable -- in the class we are building (rectangle
	// -- in this case
	public void setHeight(int height) {
		/* this refers to thisclass. So this.height is the one defined as private int height at the top*/
		this.height = Math.abs(height);	
	}
	
	// Getter example
	public int getWidth() {
		return width;
	}
	
	// Setter example - we have control so that x never happens
	public void setWidth(int width) {
		//negatives are invalid
		this.width = Math.abs(width);
	}
	/*
	 * A derived property is not stored, it is calculated
	 */
	
	
	public int getArea() {
		return width * height;
	}

	/*
	 *  A method (or function)  simplify repetitive actions we perform against an object
	 *  Give the object behavior (things it can do)
	 */
	public boolean isLargerThan(Rectangle other) {
		// When this runs do this to the method you are calling
		if (this.getArea() > other.getArea()) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * A method Overload MUST have the same return type and name, 
	 * and different type and/or number of arguments
	 */
	public boolean isLargerThan(int otherHeight, int otherWidth) {
		int otherArea =  otherHeight * otherWidth;
		return this.getArea() > otherArea;
	}
	
	/*
	 *  We can override an inherited method like .equals using the SAME method signature
	 */
	
	//Notates that we are covering up some other type of code 
	@Override
	// Signature for equals
	public boolean equals(Object obj) {
		// Write code to say when it's important to us -- cast Rectangle
		Rectangle other = (Rectangle) obj;
		// Defining arguments
		return this.height == other.getHeight() && this.width == other.getWidth();
	}
	
	@Override
	public String toString() {
		// Returns what we want to print as a string
		return this.width + "x" + this.height + "-" + this.getArea() + " square feet";
				
	}
	
}
