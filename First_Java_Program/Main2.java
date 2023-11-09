
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

    class Car {

	// Mudar de public para private torna os atributos acessiveis somente dentro da
	// classe
	private String brand;
	private String model;
	private int amountOfFuel;

	// Construtor padrao
	public Car() {
		this.brand = "";
		this.model = "";
		this.amountOfFuel = 0;
		// Chamar printData no construtor
		// printData();
	}

	// Construtor parametrizado
	public Car(String brand, String model, int amountOfFuel) {
		this.brand = brand;
		this.model = model;
		this.amountOfFuel = amountOfFuel;
		// Chamar printData no construtor
		// printData();
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

	// Create a method refuel. The method has one parameter amount.
	// Using the amount you can define how much is refueled.
	// Notice that there might be some fuel in the tank already.
	// In the method, print like this
	// (if the amount of fuel was in the beginning 10 and we refuel 5 litres)
	 public void refuel(int amount) {
		// this.amountOfFuel = amountOfFuel;
		int newAmount = this.amountOfFuel + amount;

		System.out.println("Fuel in the tank: " + this.amountOfFuel);
		System.out.println("Refuel: " + amount);
		System.out.println("Fuel in the tank after the refuel: " + newAmount);

	}
}