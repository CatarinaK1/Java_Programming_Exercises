package test;

import java.util.Scanner;
import java.util.ArrayList;

public class AdvancedArray2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		ArrayList<String> groceries = new ArrayList<String>();
		String item;

		do {
			System.out.println("Add item (x = exit)");
			item = in.nextLine();

			groceries.add(item);

			if (item.equals("x")) {
				break;
			}

		} while (item != "x");

		groceries.remove(groceries.size() - 1);

		for (int i = 0; i < groceries.size(); i++) {
			System.out.println(groceries.get(i));

		}

	}

}
