package OOP;

public abstract class Mammal {
	
	private double weight;
	
	public Mammal (double weightKg) {
		
		this.weight = weightKg;
	}
	
	public void setWeight (double weightKg) {
		if (weightKg > 0)
			this.weight = weightKg;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public abstract void eat();
	
	public abstract boolean isBig();
}


//========================  RunClass.java  ===============================


