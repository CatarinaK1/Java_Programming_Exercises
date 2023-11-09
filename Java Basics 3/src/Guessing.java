import java.util.ArrayList;
import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int rightNumber = 3;
		ArrayList<Integer> guesses = new ArrayList<Integer>();
		int guess;

		do {
			System.out.println("Guess the right number between 1-5");
			System.out.println("If you want to exit, 0");
			guess = in.nextInt();
			
			/*if (guess == 0 || guess > 5 ) {
				break;
			}*/

			guesses.add(guess);

			if (guess == rightNumber) {

				System.out.println("Great!");
			}

			if (guess > 5 || guess <= 0) {
				break;
			}


		} while (guess != rightNumber);
		
		guesses.remove(guesses.size()-1);

		System.out.println("Your guesses");
		for (int i = 0; i < guesses.size(); i++) {

			System.out.println(guesses.get(i));
		}

	}

}
