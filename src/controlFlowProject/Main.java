package controlFlowProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		System.out.println("Numbers:");
//		AsciiChars.printNumbers();
//		System.out.println("Uppercase letters:");
//		AsciiChars.printUpperCase();
//		System.out.println("Lowercase letters:");
//		AsciiChars.printLowerCase();
		
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter your name: ?");
		String name = userInput.nextLine();
		
		System.out.printf("Hello %s! Do you with to continue with this survey, y/n?\n", name);
		String continueAnswer = userInput.nextLine();
		
		if(continueAnswer.equalsIgnoreCase("yes")) {
		} else if (continueAnswer.equalsIgnoreCase("y")) {
		} else {
			System.out.println("Please come back later to complete survey.");
			System.exit(0);
		}
		
		String confirm;
		do {
		
		ArrayList<String> answers = new ArrayList<String>();
		ArrayList<String> questions = new ArrayList<String>();
		questions.add("What is the name of your favorite pet? (example. Ralph, Bert, etc.)");
		questions.add("What is the age of your favorite pet?");
		questions.add("What is your lucky number?");
		questions.add("What is your favortie Quarterback's jersey number? (if you do not have a favorite quarterback, just press 0)");
		questions.add("What is the two-digit model year of your car? (example. 77, 21, 99, etc.)");
		questions.add("What is the first name of your favorite actor/actress? (example. Ralph, Bert, Anne, etc.)");
		questions.add("Enter a random number between 1 and 50? (no decimal points)");
		
		for(int i = 0; i < questions.size(); i++) {
				System.out.println(questions.get(i));
				answers.add(userInput.nextLine());
		
		}
		
		System.out.println(answers);
		
		
		ArrayList<Integer> lotteryNumbers = new ArrayList<>();
		
		int randNumOne = (int) Math.round(Math.random() * 3);
		int randNumTwo = (int) Math.round(Math.random() * 3);
		int randNumThree = (int) Math.round(Math.random() * 3);
		
		int lotteryNumberOne = answers.get(0).charAt(2);
		
		int lotteryNumberTwo = Integer.parseInt(answers.get(4)) + Integer.parseInt(answers.get(2));
		
		int lotteryNumberThree = Integer.parseInt(answers.get(6)) * randNumOne;
		
		int lotteryNumberFour = answers.get(5).charAt(0);
		
		int lotteryNumberFive = answers.get(5).charAt(answers.get(5).length() - 1);
		// to randomize the answer that gets put in to magicBall
		int magicBallQuestion = (int) Math.round(Math.random());
		// number 1 or 0 being quarterback or lucky number
		
		int quarterBackNum = Integer.parseInt(answers.get(3));
		int luckyNum = Integer.parseInt(answers.get(2));
		
		
		
		int magicBall;
		
		if (magicBallQuestion == 1) {
			//magicBall gets quarterBackNum
			magicBall = quarterBackNum;
		} else {
			magicBall = luckyNum;
		}
		
		magicBall = magicBall * randNumTwo;
		if (magicBall <= 0) {
			magicBall = 1;
		}
		
		while (true) {
			if(magicBall <= 75 && magicBall >= 1) 
				break;
			magicBall = magicBall - 75;
		}
		System.out.println("Your magic ball number is: " + magicBall);
		
//		if (magicBall == 0) {
//			magicBall = Integer.parseInt(answers.get(2)) * randNumTwo;
//		} else {
//			magicBall = Integer.parseInt(answers.get(3)) * randNumTwo;
//			while (true) {
//				if(magicBall <= 75 && magicBall >= 1) 
//					break;
//				magicBall = magicBall - 75;
//			}
//			System.out.println("Your magic ball number is: " + magicBall);
//		}
//		
		
		
		
		if (lotteryNumberOne > 65) {
			lotteryNumbers.add(lotteryNumberOne - 65);
		} else {
			lotteryNumbers.add(lotteryNumberOne);
		}
		
		
		if (lotteryNumberTwo > 65) {
			lotteryNumbers.add(lotteryNumberTwo - 65);
		} else {
			lotteryNumbers.add(lotteryNumberTwo);
		}
		
		
		if (lotteryNumberThree > 65) {
			lotteryNumbers.add(lotteryNumberThree - 65);
		} else {
			lotteryNumbers.add(lotteryNumberThree);
		}
		
		
		if (lotteryNumberFour > 65) {
			lotteryNumbers.add(lotteryNumberFour - 65);
		} else {
			lotteryNumbers.add(lotteryNumberFour);
		}
		
		
		if (lotteryNumberFive > 65) {
			lotteryNumbers.add(lotteryNumberFive - 65);
		} else {
			lotteryNumbers.add(lotteryNumberFive);
		}
		
		
		System.out.println("Your lottery numbers are: " + lotteryNumbers + "\n");
		
		System.out.println();
		
		System.out.println("Would you like to take the survey again? y/n \n");
		

		confirm = userInput.nextLine();
		} while (confirm == "y");
		
			userInput.close();

	}

}
