import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// <access level> static <return value> <name of the method>
		// (argument)
		// { <the code of the method>}
		printLine();
		
		// calls method but nothing is printed to the console
		askAndReturnName();
		
		//Prints the return value to the console
		System.out.println("The name is "+ askAndReturnName());
		
		//Check if the return value is equal to Justin
		if (askAndReturnName().equals("Justin")) {
			System.out.println("Correct!");
		}
		

	}

	public static void printLine() {

		System.out.println("Hi!");
	}

	public static String askAndReturnName() {
		Scanner in = new Scanner(System.in);
		String name;
		System.out.println("Please, type your name");
		name = in.nextLine();

		return name;
	}

}
