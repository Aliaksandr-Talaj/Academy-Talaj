package by.academy.classwork.thread;

public class NewThread3 extends Thread {

	private static char c = 'a';
	private StringBuilder sb;

	public NewThread3() {
		super();
	}

	public NewThread3(StringBuilder sb) {
		super();
		this.sb = sb;
	}

	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			sb.append(c);
		}
		System.out.println(sb);
		sb.delete(0, sb.length());
		c++;
	}

}
