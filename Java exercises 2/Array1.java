package app;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			String[] colors = new String[3];
//			
//			colors[0] = "Green";
//			colors[1]= "Blue";
//			colors[2]= "Yellow";
//			
//			int number = 1;
//			
//			System.out.println(colors[1]);
//			
//			for (int i = 0; i<colors.length; i++) {
//				
//				System.out.println((i+1)+". " +colors[i]);
//			}
//			
		// String name = "anna";
		char[] name = new char[3];
		/*name[0] = 'a';
		name[1] = 'n';
		name[2] = 'f';
		name[3] = 'a';
		name[0] = 'u';
		name[1] = 'w';
		name[2] = 'u';*/
		System.out.println(palindromeChecker("Catarina".toCharArray()));
		System.out.println(palindromeChecker("Adrian".toCharArray()));
		System.out.println(palindromeChecker("boob".toCharArray()));
	}
	public static boolean palindromeChecker(char [] name) {

		boolean isPalindrome = true;

		for (int i = 0; i < name.length / 2; i++) {
			if (name[i] == name[name.length - i - 1]) {
				
				//System.out.println(name);
			} else { 
				isPalindrome= false;
				break;
			}
		}
		return isPalindrome;
	}
}
