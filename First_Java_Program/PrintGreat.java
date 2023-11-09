
public class PrintGreat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGreater(2,3);
		printGreater(2,2);
		printGreater(4,3);
	}

	public static void printGreater(int number1, int number2) {
		if(number1 == number2) {
			
			System.out.println("The numbers are equal.");
		}
		if (number1 > number2) {
			System.out.println(number1);
		}
		if (number1 < number2) {
			System.out.println(number2);
		}
	}

}
