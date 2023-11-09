package test;

public class arrays1 {

	public static void main(String[] args) {

		String[] colors = new String[3];

		colors[0] = "Green";
		colors[1] = "Blue";
		colors[2] = "Yellow";

		System.out.println(colors[1]);

		for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]);
			//	System.out.println((i+1)+ ". "+colors[i]);
		}

	}

}
