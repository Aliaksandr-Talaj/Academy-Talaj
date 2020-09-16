package by.academy.classwork.thread;

public class Task3 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		Thread t1 = new NewThread3(sb);
		Thread t2 = new NewThread3(sb);
		Thread t3 = new NewThread3(sb);

		t1.run();
		t2.run();
		t3.run();

	}

}
