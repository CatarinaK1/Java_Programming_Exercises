package test;

import java.util.Scanner;

public class time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//int age;
		/*int months = age * 12;
		int days = age * 365;
		int hours = days * 24;
		int seconds = hours * 3600;
		String answer;*/

		System.out.println("What is your age?");
		
		int age = scanner.nextInt();
		int months = age * 12;
		int days = age * 365;
		int hours = days * 24;
		int seconds = hours * 3600;
		String answer;

		System.out.println("Do you want to know how old you are in months, days, hours or seconds?");
               
		answer = scanner.next();
		
		if (answer.equals("months")) {
			System.out.println(months +" months");
		}
		else if (answer.equals("days")) {
			System.out.println(days+" days");
		}
		else if (answer.equals("hours")) {
			System.out.println(hours+" hours");
		}
		else if (answer.equals("seconds")) {
			System.out.println(seconds+ " seconds");
		}
		else {
			System.out.println("Error");
		}

	}

}
