package test;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int answer;
		String[] aphrorisms = new String[4];

		aphrorisms[0] = "Actions speak louder than words.";
		aphrorisms[1] = "A barking dog never bites.";
		aphrorisms[2] = "A penny saved is a penny earned.";
		aphrorisms[3] = "All things come to those who wait.";

		System.out.println("Pick number from 1-4.");
		answer = Integer.parseInt(in.nextLine());

		System.out.println(aphrorisms[answer - 1]);
	}

}
