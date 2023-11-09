package test;

import java.util.Scanner;

public class loopsextra1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("How many rows?");
		String answer = in.nextLine();
		int row = Integer.parseInt(answer);
		int starCount= 1;
		int spaceCount = row-1;

		for (int x = 1; x <= row; x++) {
			for (int i = 1; i <= spaceCount; i++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= starCount; j++) {
					System.out.print("*");
			
		     }     System.out.println("");
		     spaceCount--;
		     starCount++;
	} 
}
}