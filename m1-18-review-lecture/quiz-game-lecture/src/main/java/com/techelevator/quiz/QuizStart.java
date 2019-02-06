package com.techelevator.quiz;

import java.util.Scanner;

import com.techelevator.quiz.menu.Menu;
import com.techelevator.quiz.reader.FileQuizReader;
import com.techelevator.quiz.reader.QuizReader;

public class QuizStart {
	
	
	/*
	 * JOB: Setups up and starts the quiz.
	 */
	public void startQuiz() {
		
		// Create a new Menu Object -- to take in and take out
		Menu menu = new Menu(new Scanner(System.in), System.out);
		
		// Get the users name and the file name, using that menu object
		String user = menu.getUserName();
		
		// Create a FileReader Object, passing it the filename
		String filename = menu.getQuizFileFromUser();
		QuizReader quizReader = new FileQuizReader(filename);
		
		// Create a QuizRunner object and pass it the menu and the File Reader
		// One menu makes it easier to pass it around 
		QuizRunner quizRunner = new QuizRunner(menu, quizReader);
		
		// Calls the start method on the QuizRunner to start the Quiz
		// The job of this class is to start the application
		quizRunner.start(user);
		
		
	}
	
		
	
	/*
	 * The main method that starts the Quiz Game
	 */
	public static void main(String[] args) {
		
		// The object created it here, using a public method to call a 'public static
		// - void main can now use the objects above
		// waterfall method started
		QuizStart quizStart = new QuizStart();
		quizStart.startQuiz();

	}

}
