public class monitorApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Monitor monitor1 = new Monitor();
		monitor1.start();
		Monitor monitor2 = new Monitor();

		if (monitor1.isOn) {
			System.out.println("Monitor is on");
		}
		if (monitor2.isOn) {
			System.out.println("Monitor 2 is on");
		} else {
			System.out.println("monitor2 is off");
		}

	}

}

class Monitor {

	public boolean isOn;

	public void start() {
		isOn = true;
	}

	public void shutdown() {
		isOn = false;
	}
}
