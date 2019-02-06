package com.techelevator.quiz.reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.techelevator.quiz.exception.LoadQuizException;
import com.techelevator.quiz.question.Answer;
import com.techelevator.quiz.question.MultipleChoiceQuestion;
import com.techelevator.quiz.question.Question;
import com.techelevator.quiz.question.TrueFalseQuestion;

public class FileQuizReader implements QuizReader {
	
	// variable declarations, only difference is how it's assigned
	// Stored in constructor
	private String filePath;
	
	// variable declarations, only difference is how it's assigned
	public FileQuizReader(String filePath) {
		
		// variable declarations, only difference is how it's assigned
		this.filePath = filePath;
	}
		
	public List<Question> read() throws LoadQuizException {
		
		// Faciliates the job -- gets the lines from the file
		
		List<String> lines;
		try {
			lines = readFile();
		} catch (FileNotFoundException e) {
			/*
			 * Catch the File Exception and throw a more general custom
			 * LoadQuizException, so our read() method is not coupled to loading
			 * questions from files
			 */
			throw new LoadQuizException("File Not Found", e);
		}
		
		
		return buildQuestionsFromFileStrings(lines);
	}
	
	
	private List<String> readFile() throws FileNotFoundException {
		
		List<String> lines = new ArrayList<String>();
		
		File inputFile = new File(filePath);
		try (Scanner fileScanner = new Scanner (inputFile)) {
			while (fileScanner.hasNextLine()) {
				lines.add(fileScanner.nextLine());
			}
		}
		// Need to build file object
	
		
		return lines;
		
	}
	
	
	private List<Question> buildQuestionsFromFileStrings(List<String> lines) {
		
		List<Question> questions = new ArrayList<Question>();
		
		for (String line : lines) {
			if (line == null) { continue; }
			
			String[] parts = line.split(",");
			if (parts[1].equals("MC")) {
				questions.add(buildMultipleChoiceQuestion(parts));
			}
			
			if (parts[1].equals("TF")) {
				questions.add(buildTrueFalseQuestion(parts));
			}
			
		}
		
		return questions;
	}
	
	private Question buildMultipleChoiceQuestion(String[] parts) {
		
		Question question = new MultipleChoiceQuestion(parts[0]);
		
		for (int i = 2; i < 6; i++) {
			question.addAnswer(buildAnswer(parts[i]));
		}
		
		return question;
	}
	
	
	private Question buildTrueFalseQuestion(String[] parts) {
		
		Question question = new TrueFalseQuestion(parts[0]);
		
		for (int i = 2; i < 4; i++) {
				question.addAnswer(buildAnswer(parts[i]));
		}
		
		return question;
	}
	
	
	
	private Answer buildAnswer(String answerString) {
		
		if (answerString.endsWith("*")) {
					return new Answer(
							answerString.substring(0, answerString.length() -1), true);
		} else {
			return new Answer(answerString, false);
		}
		
	}
	
}
