package OOP;

public class Job2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().toString()+ " " + i);
		}
	}
}
