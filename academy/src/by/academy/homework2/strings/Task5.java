package by.academy.homework2.strings;

import java.util.Scanner;

/* ������ n ���� � �������. ����� ���������� ����,
   ���������� ������ ������� ���������� ��������,
   � ����� ��� � ���������� ���� � ������ ������
   ������� � ��������� ����. */

public class Task5 {

	public static void main(String[] args) {
		System.out.println("������� ����� � ������:");
		Scanner sc = new Scanner(System.in);
		String string = new String();
		string = sc.nextLine();
		sc.close();
		String[] words = string.split(" +");
		int latinsCounter = 0;
		int consEqVow = 0;
		for (String i : words) {
			int c = 0, v = 0;
			if (i.matches("[a-zA-Z]+")) {
				latinsCounter++;
				c = 0;
				v = 0;
				for (int j = 0; j < i.length(); j++) {
					switch (i.charAt(j)) {
					case 'A':
					case 'a':
					case 'E':
					case 'e':
					case 'I':
					case 'i':
					case 'O':
					case 'o':
					case 'U':
					case 'u':
					case 'Y':
					case 'y':
						v++;
						break;
					default:
						c++;
					}
				}
				if (c == v) {
					consEqVow++;
				}
			}
		}
		System.out.println("���������� ����, ���������� ������ ��������� �������: " + latinsCounter);
		System.out.println("����� ��� ����, ���������� ������ ���������� ������� � ���������: " + consEqVow);
	}

}
