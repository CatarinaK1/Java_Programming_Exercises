
public class Multiplication {
	public static void main(String[] args) {
		
		/*int result = multiplication(4,5);
		
		result = add(result,3);*/
		
		
		
		System.out.println(add(multiplication(4,5),3));
	}
	
	public static int multiplication(int a, int b) {
		
		int sum= a*b;
		return sum;
	}
	
	public static int add(int a, int b) {
		int sum = a+b;
		return sum;
	}
}
