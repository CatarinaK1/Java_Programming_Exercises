package test;

import java.util.Scanner;

public class age2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int age;
		System.out.println("Insert age");

		age = in.nextInt();

		if (age < 18) {
			System.out.println("You are underage.");
		}

		else {
			System.out.println("You are an adult.");

		}
		System.out.println("Press space to exit.");
	}
}
