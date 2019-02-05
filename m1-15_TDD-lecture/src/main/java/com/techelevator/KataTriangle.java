package com.techelevator;

/*
 * Create a Triangle Classifier with the following method: 
 * 	String classify(int length1, int length2, int length3)
 * 
 * This method accepts three numeric values each representing the length of one
 * side of a triangle. It returns the Triangle type, "scalene", "isosceles", or "equilateral",
 * where the return value corresponds to the actual type of the triangle.
 * 
 * If the lengths of the sides cannot correspond to a real triangle, then return "invalid"
 */
public class KataTriangle {

	
	
	// 1. identify what our type of tests should be 
	// 2. Added in the method signature "String classify etc"
	// 3. Use Test Cases to identify what each specific job is
	// 4. Put them into methods, the methods have ONE specific job -- only returning
	// true or false
	String classify(int length1, int length2, int length3) {

	if(!isTriangle(length1, length2, length3))	{
		return "invalid";
	}
	
	if(isScalene(length1, length2, length3))	{
		return "scalene";
	}
	
	if(isIsosceles(length1, length2, length3))	{
		return "isosceles";
	}
	
	if (isEquilateral(length1, length2, length3)) {
		return "equilateral";
	}	
	return null;
	}
	
	
	private boolean isEquilateral(int length1, int length2, int length3) {
		if (length1 == length2 && length1 == length3) {
			return true;
		}
		return false;
	}
	
	private boolean isIsosceles(int length1, int length2, int length3) {
		if ( (length1 == length2 && length1 != length3) ||
				(length1 == length3 && length1 != length2) ||
				(length2 == length3 && length2 != length1)) {
			return true;
		}
		return false;
	}

	
	private boolean isScalene(int length1, int length2, int length3) {
		if (length1 != length2 && length1 != length3 && length2 != length3) {
			return true;
		}
		return false;
	}

	
	// breaking down each test case into individual methods
	private boolean isTriangle(int length1, int length2, int length3) {
		if (length1 < 1 || length2 < 1 || length3 < 1) {
			return false;
		}

		if ( (length1 + length2 < length3) ||
				(length1 + length3 < length2) ||
				(length3 + length2 < length1)
				) {
			return false;
		} 
		return true;
	}
	
}		
//		Refactored the below into the above		
//		if (length1 + length2 < length3) {
//			return "invalid";
//		}
//		
//		if (length1 + length3 < length2) {
//			return "invalid";
//		}
//		
//		if (length3 + length2 < length1) {
//			return "invalid";
//		}
//		return null;
//	}
