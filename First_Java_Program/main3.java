
public class main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LightSwitch light = new LightSwitch();

		light.printInfo();
	}

}

class LightSwitch {

	public boolean lightsOn;

	public void printInfo() {

		if (lightsOn) {

			System.out.println("Lights are on");
		} else {
			System.out.println("Lights are off");
		}
	}
}

class Dimmer extends LightSwitch {
	public int brightness;

	public void setBrightness() {
	 this.brightness = brightness;
		if (brightness == 0) {
			lightsOn = false;
		} else {
			lightsOn = true;
		}
	}

	@Override
	public void printInfo() {
		if (brightness > 0) {
		System.out.println("Brightness is " + brightness+".");
		}
		else {
			System.out.println("Lights are off.");
		}
	}
}

class Utils{
	//Create a static method called printTitle. 
	//The method prints the title to the console like this:
	public static void printTitle() {
		System.out.println("*******");
		System.out.println("* OOP *");
		System.out.println("*******");
	}
	public static int areaCalc(int w, int l) {
		int area = w*l;
		return area;
	}
}