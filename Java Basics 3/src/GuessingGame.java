import java.util.ArrayList;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int min = 1;
		int max = 1000;
		int guess;
		int guessCount = 0;
		ArrayList<Integer> guesses = new ArrayList<Integer>();

		int randomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);

		do {
			System.out.println("Guess number between 1-1000");
			guess = in.nextInt();
			guessCount++;
			guesses.add(guess);

			if (guess < randomNumber) {

				System.out.println("The random number is higher");

			}
			if (guess > randomNumber) {

				System.out.println("The number is lower");
			}

		} while (guess != randomNumber);

		System.out.println("Congrats");
		System.out.println("Your guesses " + guessCount);

		for (int i = 0; i < guesses.size(); i++) {

			System.out.println(guesses.get(i));
		}

	}

}
