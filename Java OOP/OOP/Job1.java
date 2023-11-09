package OOP;

public class Job1 extends Thread{
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().toString()+ " " + i);
		}
	}
}
