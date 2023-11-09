import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Utils util = new Utils();

		int w, l;

		System.out.println("Width?");
		w = in.nextInt();

		System.out.println("Length?");
		l = in.nextInt();

		util.areaCalc(w, l);

	}

}

class Utils {

	public static void printTitle() {
		System.out.println("*******");
		System.out.println("* OOP *");
		System.out.println("*******");
	}

	public static void areaCalc(int w, int l) {
		int area = w * l;
		System.out.println("Area is " + area);
	}
}