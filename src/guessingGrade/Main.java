package guessingGrade;

import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int gradeLimit = 60;
		Scanner userInput = new Scanner(System.in);
		System.out.println("What is your number grade?");
		String inputGrade = userInput.nextLine();
		int grade = Integer.parseInt(inputGrade);
		if (grade < gradeLimit) {
			System.out.println("Sorry, you have to take the class again.");
			userInput.close();
			System.exit(0);
		} else {
			System.out.println("Congrats!  You passed.");
		}
	}

}
