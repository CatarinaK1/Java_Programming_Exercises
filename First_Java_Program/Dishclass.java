
public class Dishclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dishwasher dw1 = new Dishwasher();
		
		//dw1.printData();
		//dw2.printData();
		dw1.setProgramme(3);
		//System.out.println(dw1.turnOnOff());
		System.out.println(dw1.getIsOn());
	}

}

class Dishwasher {
	private boolean isOn;
	private int programme;

	public void setProgramme(int programme) {
		
		this.programme = programme;
		
		if (programme == 1) {
			
			System.out.println("normal");
		}
		
		if (programme == 2) {
			
			System.out.println("auto");
		}
		if (programme == 3) {
			
			System.out.println("intensive");
		}

	}
	
	public Dishwasher() {
		this.programme = 1;
	    this.isOn = false;
		printData();
	}
	
     public boolean turnOnOff() {
    	 
    	 if (isOn == false) {
    		 isOn = true;
    		 return isOn;
    	 }
    	 else {
    		 this.isOn = false;
    		 return isOn;
    	 }
	
}
     private void printData() {
  		System.out.println("Is the dishwasher on: "+ isOn);
 		System.out.println("Programme: "+programme);

 	}
 	public boolean getIsOn() {
		this.isOn = isOn;
 		return isOn;
	}
}