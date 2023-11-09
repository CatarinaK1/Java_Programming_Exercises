package test;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name;
		int count = 0;

		do {
			System.out.println("Guess my name (type stop to exit)");
			name = in.nextLine();
			if (name.equals("stop")) {
				break;
			}
			count++;
		} while (!"Emma".equals(name));

		if (name.equals("Emma")) {
			System.out.println("Congratulations!");
		}

		System.out.println("You guessed " + count + " times.");
	}
}