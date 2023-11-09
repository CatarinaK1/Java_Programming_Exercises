import java.util.Scanner;
import java.util.ArrayList;

public class test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		String answer;

		System.out.println("Password Generator");

		do {
			System.out.println("Write a word (type x to exit)");
			answer = in.nextLine();

			words.add(answer);

		} while (!answer.equals("x"));

		words.remove(words.size() - 1);

		for (int i = 0; i < words.size(); i++) {
			System.out.println(words.get(i));
		}

		for (String s : words) {
			System.out.print(s.charAt(0));
			System.out.print(s.charAt(1));
		}

	}
}
