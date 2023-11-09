import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sScanner in = new Scanner(System.in);
		
		Car car1 = new Car();
		
		car1.brake();
		
		car1.accelerate();
		
		car1.printData();
		
		//amountOfFuel
	}

}

class Car {

	//Define attributes: brand, model, amountOfFuel (int). Set all to public. 
	
	public String brand;
	public String model;
	public int amountOfFuel;
	
	public void brake() {

		System.out.println("Car is breaking");

	}

	// accelerate: The method decreases the amount of fuel by one.
	// If the fuel is more than 0, the method prints "Car is accelerating".
	public void accelerate() {
		amountOfFuel = ( amountOfFuel- 1); 
		if (amountOfFuel > 0) {
			System.out.println("Car is accelerating");
		}
	// printData: method prints the brand, model and the amount of fuel
	// to the console like this (if brand is Kia, model is Rio and amountOfFuel is
	// 2):
	}
	public void printData() {
		System.out.println("Brand: "+ brand);
		System.out.println("Model: "+ model);
		System.out.println("Fuel: "+ amountOfFuel);
	}
}
