package app;

import java.util.Scanner;

public class Method1 {

	public static void main(String[] args) {
		// call the method with hard coded values
		// In other words we send arguments to the method
		// calculateAreaAndPrint(2, 5);
		Scanner in = new Scanner(System.in);

		System.out.println(calculateAreaAndPrint(2, 5));
		System.out.println("Type the width of the room");
		int width = in.nextInt();
		
		System.out.println("Type the lenght og the room");
		int lenght= in.nextInt();
		
		System.out.println(calculateAreaAndPrint(width, lenght));

	}

	public static int calculateAreaAndPrint(int w, int l) {

		int area = w * l;
		// System.out.println(area);
		return area;
	}
	
}
