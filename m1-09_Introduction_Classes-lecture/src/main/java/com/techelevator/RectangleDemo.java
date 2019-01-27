package com.techelevator;

public class RectangleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Type
		Rectangle rect = new Rectangle();
		// we want to do something with rectangle
		rect.setHeight(-10);
		rect.setWidth(20);
		
		System.out.println(rect.getHeight() + " " + rect.getWidth() + " " + rect.getArea());
		
		Rectangle rectTwo = new Rectangle();
		rectTwo.setHeight(18);
		rectTwo.setWidth(12);
		System.out.println(  rect.isLargerThan(rectTwo) );
		
		// Second overload
		System.out.println(  rect.isLargerThan(5,10));
		
		Rectangle rectThree = new Rectangle(10, 20);
		
		// Doesn't work because reference types are different
//		System.out.println( rect == rectThree );
		// Also doesn't work
		System.out.println( rect.equals(rectThree) );
		
		System.out.println(rect);
	}

}
