package app;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 1000;
		int min = 1;
		int guess;
		int guessCount = 0;
		int rightNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
		Scanner in = new Scanner(System.in);

		do {
			System.out.println("Guess number between 1-1000");
			guess = in.nextInt();
			guessCount++;

			if (guess < rightNumber) {
				System.out.println("The right number is higher");
			}

			if (guess > rightNumber) {
				System.out.println("The right number is lower");
			}

		} while (guess != rightNumber);

		if (guess == rightNumber) {
			System.out.println("Uwu");
			System.out.println("You guessed "+ guessCount);

		}

	}

}
