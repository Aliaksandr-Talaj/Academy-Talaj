package by.academy.homework2.strings;

import java.util.Scanner;

/* Написать программу, позволяющую корректно находить
 * корни квадратного уравнения.
 * Параметры уравнения должны задаваться с командной строки.*/

public class Task13 {

	public static void main(String[] args) {
		System.out.println("Для уравнения вида \"a*x^2+b*x+c=0\"");
		System.out.println("введите a:");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.println("введите b:");
		double b = sc.nextDouble();
		System.out.println("введите c:");
		double c = sc.nextDouble();
		sc.close();
		if (a == 0) {
			System.out.println("x = " + (-c / b));
		} else {
			double d = Math.pow(b, 2) - 4 * a * c;
			if (d < 0) {
				System.out.println("Уравнение не имеет корней");
			} else if (d == 0) {
				System.out.println((-1 * b) / (2 * a));
			} else {
				System.out.println("x1 = " + ((-b + Math.sqrt(d)) / (2 * a)));
				System.out.println("x2 = " + ((-b - Math.sqrt(d)) / (2 * a)));
			}
		}
	}
}
