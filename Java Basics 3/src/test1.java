import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {

		//convertTemperature(50.0, "Fahrenheit");
		Scanner in = new Scanner(System.in);
		double temp;
		String unit;
		
		//double convertedValue = convertTemperature(50.0, "Fahrenheit");
		//convertedValue = convertedValue *10;
		//System.out.println(convertedValue);
		
		System.out.println("Input temperature");
		temp = in.nextInt();
		
		System.out.println("Is it in Celsius or Fahrenheit?");
		unit= in.nextLine();
		
		System.out.println(convertTemperature(temp, unit));

	}

	public static Double convertTemperature(Double temperature, String unit) {

		Double result = 0.0;

		if (unit.equals("Celsius")) {

			result = temperature * 1.8 + 32;
			//System.out.println(result + " F");
		}
		if (unit.equals("Fahrenheit")) {

			result = (temperature - 32) / 1.8;
			//System.out.println(result + " C");
		}
		return result;
	}

}
