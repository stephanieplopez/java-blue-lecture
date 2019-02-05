package com.techelevator.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookReader {
						// Either by adding throws
	// 1. We need to get file information from "user"
													// imported FileNotFounException
	public static void main(String[] args) throws FileNotFoundException {
		
		// - int startlingLine = 116;
		// - int lineCount = 200;
		
		
		int lineCount = 500;
		File inputFile = getFileFromUser();
		
		// 3. Code to read the file
		// 4. Create a resource (an object) that normally we would have to close
		// try creates a 'scope'
		try (Scanner fileIn = new Scanner(inputFile)) {
			
			// int lineNumber = 0;
			int lineNumber = 0;
			while (fileIn.hasNextLine() && lineNumber < lineCount) {
				String line = fileIn.nextLine();
				lineNumber++;
				// - if (lineNumber > starting Line) {
				System.out.println(lineNumber + " : " + line);
			}
			
		} catch (FileNotFoundException e) {
			throw e;
		}
		// 4. (cont'd) clean the above --- we are done with it
		
	}
	
	// 2. put in getFileFromUser
	public static File getFileFromUser() {
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter path to input file >>> ");
		String path = userInput.nextLine();
		
		File inputFile = new File(path);
		if(inputFile.exists() == false) { // checks for the existence of a file
			System.out.println(path+" does not exist");
			System.exit(1); // Ends the program
		} else if(inputFile.isFile() == false) {
			System.out.println(path+" is not a file");
			System.exit(1); // Ends the program
		}
		return inputFile;
	}

}
