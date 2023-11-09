package test;

import java.util.Arrays;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// String days[] = new String[7];
		double answer[] = new double[7];

		/*days[0] = "1. day? ";
		days[1] = "2. day? ";
		days[2] = "3. day? ";
		days[3] = "4. day? ";
		days[4] = "5. day? ";
		days[5] = "6. day? ";
		days[6] = "7. day? ";*/
		// double q = 0;
		double sum = 0;

		for (int i = 0; i < 7; i++) {
			System.out.println(i + 1 + ". day?");
			// System.out.println(days[i]);
			answer[i] = in.nextInt();
			sum = sum + answer[i];
		}
		for (int i = 0; i < 7; i++) {
		
			// System.out.println(days[i]+" "+ answer[i]);
			System.out.println(i + 1 + ". day " + answer[i]);
		}
		
		System.out.println("Average: " + sum / 7);
		System.out.println("Three coldest days");
		
		Arrays.sort(answer);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(answer[i]);
		}

	}
}
