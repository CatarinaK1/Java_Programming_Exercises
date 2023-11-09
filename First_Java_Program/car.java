import java.util.Scanner;

public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new scanner (System.in);
		
		printData Car1 = new printData();
		
		Car1.isbreak();
	}

}

class brake {
	public void isbreak() {

		System.out.println("Car is breaking");

	}
}

// accelerate: The method decreases the amount of fuel by one.
// If the fuel is more than 0, the method prints "Car is accelerating".
	class accelerate {
	
	public void fuel() {
				int carFuel - 1;
				if (carFuel > 0) {
					System.out.println("Car is accelerating");
				}
			}
}
//printData: method prints the brand, model and the amount of fuel 
// to the console like this (if brand is Kia, model is Rio and amountOfFuel is
// 2):

	class printData{
		
		public void attributes() {
			System.out.println("Brand:");
			System.out.println("Model:");
			System.out.println("Fuel: ");
		}
	}