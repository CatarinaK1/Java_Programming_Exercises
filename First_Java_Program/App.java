import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Car car1 = new Car("Toyota","RAV4",40);
		String answer;

		car1.printData();
		do { 
		System.out.println("a=accelerate b=break x=exit");
		answer = in.nextLine();

		if (answer.equals("a")) {

			car1.accelerate();
		}
		if (answer.equals("b")) {

			car1.brake();
		} }
		  while (!answer.equals("x"));
	}

}

class Car {

	// Mudar de public para private torna os atributos acessiveis somente dentro da
	// classe
	private String brand;
	private String model;
	private int amountOfFuel;

	// Construtor padrao
	/*
	 * public Car() { this.brand = ""; this.model = ""; this.amountOfFuel = 0; //
	 * Chamar printData no construtor printData(); }
	 */

	// Construtor parametrizado
	public Car(String brand, String model, int amountOfFuel) {
		this.brand = brand;
		this.model = model;
		this.amountOfFuel = amountOfFuel;
		// Chamar printData no construtor
		//printData();
	}

	// Getter para o atributo model
	public String getModel() {
		return model;
	}

	// Setter para o atributo model
	public void setModel(String model) {
		this.model = model;
	}

	public void printData() {
		// ...
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Fuel: " + amountOfFuel);
	}

	public void refuel(int amount) {
		// this.amountOfFuel = amountOfFuel;
		int newAmount = this.amountOfFuel + amount;

		System.out.println("Fuel in the tank: " + this.amountOfFuel);
		System.out.println("Refuel: " + amount);
		System.out.println("Fuel in the tank after the refuel: " + newAmount);

	}

	public void brake() {

		System.out.println("Car is breaking");

	}

	public void accelerate() {
		amountOfFuel = (amountOfFuel - 1);
		if (amountOfFuel > 0) {
			System.out.println("Car is accelerating");
		}

	}
}