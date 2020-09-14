package by.academy.classwork.thread;

public class Task2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <=100; i++) {
			if (i%10==0) {
				System.out.println(i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread (new Task2());
		Thread t2 = new Thread (new Task2());
		Thread t3 = new Thread (new Task2());
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	
}
