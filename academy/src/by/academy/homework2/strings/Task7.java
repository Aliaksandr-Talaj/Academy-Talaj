package by.academy.homework2.strings;

import java.util.Scanner;

/* ������ n ���� � �������. ����� �����, ��������� ������ �� ��������� ��������. 
���� ����� ���� ���������, ����� ������ �� ���. */

public class Task7 {

	public static void main(String[] args) {
		System.out.println("������� ����� � ������ ����� ������:");
		Scanner sc = new Scanner(System.in);
		String string = new String();
		string = sc.nextLine();
		sc.close();
		String[] words = string.split(" +");
		int unics = 0;
		int counter = 0;
		for (String i : words) {
			unics = 0;
			for (int j = 0; j < i.length(); j++) {
				if (i.lastIndexOf(i.charAt(j)) == j) {
					unics++;
				}
			}
			if (unics == i.length()) {
				System.out.print("������ �����, ��������� ������ �� ��������� �������� - " + i);
				counter++;
				break;
			}
		}
		if (counter == 0) {
			System.out.print("�����, ��������� ������ �� ��������� ��������, �� �������");
		}
	}
}
