import java.util.Scanner;

public class CodeLockApp {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String Answer;
		CodeLock cl = new CodeLock();
		String cl2 = CodeLock.getCode();	
		//  Ask the user to type the code. 
	    //Check if the code is right using the checkCode method of the object. 
	    //Exit the loop, if the object’s isOpen is true.
		
		while (true){
			System.out.println("Input code");
			Answer= in.nextLine();
			
			cl.checkCode(Answer);
			
			if(Answer.equals(cl2)) {
				break;
			}
	
	}
			
			
			
	}

}

class CodeLock{

	static private String code;
	private boolean isOpen;

	public CodeLock() {

		this.code = "1234";
		this.isOpen = false;
	}

	public void printStatus() {
	
		if (isOpen == true) {

			System.out.println("Door is open");
		} else {
			System.out.println("Door is locked");
		}
	}

	public void checkCode(String code) {

		if (this.code.equals(code)) {

			this.isOpen = true;
			
		} else {
			this.isOpen = false;
		}
		printStatus();
	}

	public boolean getIsOpen() {

		return this.isOpen;
	}
	
	static public String getCode() {
		return code;
	}
}