import java.util.Scanner;

public class method2Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Is the subject human, horse or dog?");
		String aSubject = in.nextLine();

		System.out.println("What is the body temperature?");
		// String aTemperature = in.nextLine();
		int aTemperature = in.nextInt();

		// int aaTemperature = Integer.parseInt(aTemperature);

		printFeverLimits();

		// hasFever(aSubject, aTemperature);
		// System.out.println(hasFever(aSubject, aTemperature));
		if (hasFever(aSubject, aTemperature)) {
			System.out.println("The subject has fever");
		}
		else {
			System.out.println("The subject has no fever");
		}
	}

	public static void printFeverLimits() {

		System.out.println("Fever Limits");
		System.out.println("- Human 37");
		System.out.println("- Dog 39");
		System.out.println("- Horse 38");
	}

	public static boolean hasFever(String aSubject, int aaTemperature) {

		boolean Answer = false;

		if (aSubject.equals("Human")) {

			if (aaTemperature > 37) {
				// System.out.println("The subject has fever");
				Answer = true;
			}
		}
		if (aSubject.equals("Dog")) {

			if (aaTemperature > 39) {

				// System.out.println("The subject has fever");
				Answer = true;
			}
		}
		if (aSubject.equals("Horse")) {

			if (aaTemperature > 39) {

				// System.out.println("The subject has fever");
				Answer = true;
			}
		}
		return Answer;
	}

}
