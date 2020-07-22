package by.academy.homework2.strings;

import java.util.Scanner;

/* ��������� �������� switch, �������� ���������,
 * ������� ������� �� ����� ��������� � ��������������
 * ���������� �������� k ����������
 * (-10k, 5], [0, 10], [5, 15], [10, 10k].*/

public class Task11 {

	public static void main(String[] args) {
		System.out.println("������� ����� k:");
		Scanner sc = new Scanner(System.in);
		double k = sc.nextDouble();
		sc.close();
		int i = 0;
		if (k >= -10 * k && k <= 0) {
			i = 1;
		}
		if (k >= 0 && k <= 5) {
			i = 2;
		}
		if (k >= 5 && k <= 10) {
			i = 3;
		}
		if (k >= 10 && k <= 15) {
			i = 4;
		}
		if (k > 15 && k <= 10 * k) {
			i = 5;
		}
		switch ((int) k) {
		case 5:
			System.out.println("������ � ��������� [-10k, 5], [0, 10] � [5, 15]");
			break;
		case 10:
			System.out.println("������ � ��������� [0, 10], [5, 15] � [10, 10k]");
			break;
		default:
			switch (i) {
			case 1:
				System.out.println("������ � �������� [-10k, 5]");
				break;
			case 2:
				System.out.println("������ � ��������� [-10k, 5] � [0, 10]");
				break;
			case 3:
				System.out.println("������ � ��������� [0, 10] � [5, 15]");
				break;
			case 4:
				System.out.println("������ � ��������� [5, 15] � [10, 10k]");
				break;
			case 5:
				System.out.println("������ � ��������� [10, 10k]");
				break;
			default:
				System.out.println("�� ������ �� � ���� �� ����������");
			}
		}
	}

}
