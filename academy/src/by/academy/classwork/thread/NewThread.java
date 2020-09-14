package by.academy.classwork.thread;

public class NewThread extends Thread{

	@Override
	public void run() {
		for (int i =0; i<100; i++) {
			System.out.print('C');
		}
	}
	
}
