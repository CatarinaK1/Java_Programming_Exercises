package test;

import java.util.Scanner;

public class Names {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int fn;
		int ln;
		System.out.println("First number?");
		fn = in.nextInt();
		System.out.println("Last number?");
		ln = in.nextInt();
		for (; fn <= ln; fn++)
			// 3 partes
			System.out.println(fn);
	}
}
