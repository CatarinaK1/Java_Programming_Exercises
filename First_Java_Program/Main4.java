
public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CodeLock cl = new CodeLock();
		
		//cl.checkCode("1111");
		//cl.checkCode("1234");

		System.out.println(cl.getIsOpen());
	}

}
class CodeLock{
	
	private String code;
	private boolean isOpen;
	
	public CodeLock(){
		
		this.code= "1234";
		this.isOpen = false;
	}
	
	private void printStatus() {
		this.isOpen= isOpen;
		if (isOpen == true) {
			
			System.out.println("Door is open");
		}
		else {
			System.out.println("Door is locked");
		}
	}
	// The method has one parameter
	//The method checks if the value of the parameter equals to the value of the code attribute
	//If it does, isOpen will be true. If not, isOpen will be false. Lastly, the method calls printStatus method.
	
	public void checkCode(String code) {
		
		if (code == this.code) {
			
			this.isOpen = true;
		}
		else {
			this.isOpen = false;
		}
		printStatus();
	}
	public boolean getIsOpen() {
		
		return this.isOpen;
	}
}