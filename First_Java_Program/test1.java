
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateElectricityAssistance(2600, 0.4);
	}

	public static void calculateElectricityAssistance(int consumption, double price) {
		double total = 0;
		// ((2600*0,4) - 400) * 0,6 = 384 €
		total = ((consumption * price) - 400) * 0.6;
		System.out.println(total);
	}

}
