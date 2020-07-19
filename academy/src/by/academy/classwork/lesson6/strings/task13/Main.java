package by.academy.classwork.lesson6.strings.task13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("��� ��������� ���� \"a*x^2+b*x+c=0\"");
		System.out.println("������� a:");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		System.out.println("������� b:");
		double b = sc.nextDouble();
		System.out.println("������� c:");
		double c = sc.nextDouble();
		sc.close();
		if (a == 0) {
			System.out.println("x = " + (-c / b));
		} else {
			double d = Math.pow(b, 2) - 4 * a * c;
			if (d < 0) {
				System.out.println("��������� �� ����� ������");
			} else if (d == 0) {
				System.out.println((-1 * b) / (2 * a));
			} else {
				System.out.println("x1 = " + ((-b + Math.sqrt(d)) / (2 * a)));
				System.out.println("x2 = " + ((-b - Math.sqrt(d)) / (2 * a)));
			}
		}
	}
}
