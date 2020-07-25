package by.academy.lesson2;

public class Main3 {
	public static void main(String[] args) {
		int i = (int) (Math.random() * 100);
		if (i % 2 == 0) {
			System.out.println("Число " + i + " является четным");
		} else {
			System.out.println("Число " + i + " является нечетным");
		}
	}
}