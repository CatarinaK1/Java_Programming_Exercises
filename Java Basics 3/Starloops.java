
//
//public class Starloops {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
import java.util.Scanner;

public class Starloops {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("How many rows?");

		int row = in.nextInt();
		// String answer = in.nextLine();

		// int row = Integer.parseInt(answer);

		for (int x = 1; x <= row; x++) {
			for (int i = 1; i <= x; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}
}
