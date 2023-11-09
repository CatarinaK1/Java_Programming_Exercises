import java.util.Arrays;

public class Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] carsArray = {"Audi", "Tesla","Fiat"};
		Arrays.sort(carsArray);
		
		for (int i = 0; i < carsArray.length; i++)
			System.out.println(carsArray[i]);
	}

}
