package by.academy.classwork.lesson6.strings.task10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("������� ����� k:");
		Scanner sc = new Scanner(System.in);
		double k = sc.nextDouble();
		sc.close();
		switch ((int) Math.ceil(k / 5)) {
		case 1:
			System.out.println("������ � �������� (0, 5]");
			break;
		case 2:
			System.out.println("������ � �������� (5, 10]");
			break;
		default:
			switch ((int) Math.ceil(k / 10)) {
			case 0:
				System.out.println("������ � �������� (-10k,0]");
				break;
			case 2:
				System.out.println("������ � �������� (10, 10k]");
				break;
			default:
				System.out.println("�� ������ �� � ���� �� ����������");
			}
		}
	}

}
