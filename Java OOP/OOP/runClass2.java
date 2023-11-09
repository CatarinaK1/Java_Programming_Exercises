package OOP;

public class runClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Job1 job1 = new Job1();
		Job2 job2 = new Job2();
		
		Thread thread_A = new Thread(job1);
		Thread thread_B = new Thread(job2);
		
		thread_A.setPriority(10);
		thread_B.setPriority(1);
		
		thread_A.start();
		thread_B.start();
	}

}
