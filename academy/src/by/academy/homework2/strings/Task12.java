package by.academy.homework2.strings;

/* Написать программу, которая выводит числа
 * от 1 до 25 в виде матрицы 5x5
 * слева направо и сверху вниз.*/

public class Task12 {

	public static void main(String[] args) {
		int x=1;
		for (int i=0; i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf(" %2d", x++);
			}
			System.out.println();
		}
	}

}
