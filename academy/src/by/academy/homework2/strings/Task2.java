package by.academy.homework2.strings;

import java.util.Scanner;

/* ������ n ����� � �������.
 * ����������� � ������� ������
 * � ������� ����������� (��������) 
 * �������� �� �����.*/

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� �����: ");
		int n = sc.nextInt();
		String[] strings = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("������ �" + (i + 1));
			strings[i] = sc.next();
		}
		sc.close();
		for (int i = 0; i < strings.length; i++) {
			String temp;
			for (int j = 0; j < strings.length; j++) {
				if (strings[i].length() < strings[j].length()) {
					temp = strings[i];
					strings[i] = strings[j];
					strings[j] = temp;
				}
			}
		}
		for (String i : strings) {
			System.out.println(i + " ");
		}
	}
}
