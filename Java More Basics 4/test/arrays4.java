package test;

import java.util.Scanner;

public class arrays4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int numbers[]= new int[] { 16, 18, 5, 3, 10};
		
		int min= numbers[0];
		
		for(int i=0; i< numbers.length; i++) {

			int currNumber=numbers[i];
			
			if (currNumber< min) {
				min = currNumber;
			}
		}
		System.out.println(min);
	}
}