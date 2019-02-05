package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaintCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. Defined a List to store data
		List<Rectangle> walls = new ArrayList<Rectangle>();
		
		while(true) {
			
			System.out.println();
			System.out.println("[1] Add a wall");
			System.out.println("[2] Calculate paint required (and Exit)");
			System.out.print("Please choose >>> ");
			String userChoice = scan.nextLine();
			
			System.out.println();
			
			if(userChoice.equals("1")) {
				
				System.out.print("Enter wall height >>> ");
				int height = Integer.parseInt(scan.nextLine());
				System.out.print("Enter wall width >>> ");				
				int width = Integer.parseInt(scan.nextLine());
				

				//2. Storing a list a of walls into 
				Rectangle wall = new Rectangle(height, width);
				walls.add(wall);
				int area = height * width;
				System.out.println("Added "+ wall);
				
			} else if(userChoice.equals("2")) {
				
				int count = 1;
				int totalArea = 0;
				
				// for each one of these
				for (Rectangle wall : walls) {
//					totalArea += walls.getArea();
					System.out.println("Wall " + count + ": " + wall);
					count++;
				}

				

				System.out.println("===============================");
				System.out.println("Total Area: "+totalArea+" square feet");
				
				// 1 gallon of paint covers 400 square feet
				float gallonsRequired = (float)totalArea / 400;
				System.out.println("Paint Required: "+gallonsRequired+" gallons");
				
				System.exit(0); // Causes the program to end
			}
		}
	}

}
