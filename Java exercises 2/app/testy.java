package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class testy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<Double> days = new ArrayList<Double>();
		double average = 0;

		for (int i = 0; i < 4; i++) {

			System.out.println((i + 1) + ". day?");
			double Temperature = in.nextDouble();
			days.add(Temperature);

		}
		for (int i = 0; i < days.size(); i++) {

			System.out.println((i + 1) + ". day " + days.get(i));
			average = average + days.get(i);
		}
		System.out.println(average / days.size());

		System.out.println("The three coldest days");
		Collections.sort(days);

		for (int i = 0; i < 3; i++) {
			System.out.println(days.get(i));
		}
	}

}
