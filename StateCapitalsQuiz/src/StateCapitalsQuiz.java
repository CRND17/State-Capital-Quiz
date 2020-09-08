//Christopher Dreyer

import java.util.Scanner;

//A quiz game on which the user will guess the capitals of each state.
//The score will then be printed at the end.
public class StateCapitalsQuiz {

	public static void main(String[] args) {
		
		String[][] stateCapitals = {
	            {"Alabama", "Montgomery"},
	            {"Alaska", "Juneau"},
	            {"Arizona", "Phoenix"},
	            {"Arkansas", "Little Rock"},
	            {"California", "Sacramento"},
	            {"Colorado", "Denver"},
	            {"Connecticut", "Hartford"},
	            {"Delaware", "Dover"},
	            {"Florida", "Tallahassee"},
	            {"Georgia", "Atlanta"},
	            {"Hawaii", "Honolulu"},
	            {"Idaho", "Boise"},
	            {"Illinois", "Springfield"},
	            {"Maryland", "Annapolis"},
	            {"Minnesota", "Saint Paul"},
	            {"Iowa", "Des Moines"},
	            {"Maine", "Augusta"},
	            {"Kentucky", "Frankfort"},
	            {"Indiana", "Indianapolis"},
	            {"Kansas", "Topeka"},
	            {"Louisiana", "Baton Rouge"},
	            {"Oregon", "Salem"},
	            {"Oklahoma", "Oklahoma City"},
	            {"Ohio", "Columbus"},
	            {"North Dakota", "Bismark"},
	            {"New York", "Albany"},
	            {"New Mexico", "Santa Fe"},
	            {"New Jersey", "Trenton"},
	            {"New Hampshire", "Concord"},
	            {"Nevada", "Carson City"},
	            {"Nebraska", "Lincoln"},
	            {"Montana", "Helena"},
	            {"North Carolina", "Raleigh"},
	            {"Missouri", "Jefferson City"},
	            {"Mississippi", "Jackson"},
	            {"Massachusetts", "Boston"},
	            {"Michigan", "Lansing"},
	            {"Pennsylvania", "Harrisburg"},
	            {"Rhode Island", "Providence"},
	            {"South Carolina", "Columbia"},
	            {"South Dakota", "Pierre"},
	            {"Tennessee", "Nashville"},
	            {"Texas", "Austin"},
	            {"Utah", "Salt Lake City"},
	            {"Vermont", "Montpelier"},
	            {"Virginia", "Richmond"},
	            {"Washington", "Olympia"},
	            {"West Virginia", "Charleston"},
	            {"Wisconsin", "Madison"},
	            {"Wyoming", "Cheyenne"}
	    };
		
		Scanner guess = new Scanner(System.in);
		int score = 0; //Score variable
		float percent = 0; //Percentage variable
		for (int i = 0; i < stateCapitals.length; i++) {
			System.out.println("Enter the state capital of " + stateCapitals[i][0]); //User input
			String string = guess.nextLine();
			if(string.equalsIgnoreCase(stateCapitals[i][1])) {
				System.out.println("Good job! That is the correct answer.");
				score++; //Increments the score for every correct answer.
				percent = (float) ((score*100)/stateCapitals.length); //Calculates the percentage score.
			}
			else {
				System.out.println("Incorrect. Correct answer is " + stateCapitals[i][1]);
			}
		}
		System.out.println("Your score is " + score + " out of 50. Your grade is " + percent + "%.");
	}
}

