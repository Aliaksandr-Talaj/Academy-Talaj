package by.academy.homework2.strings;

import java.util.Scanner;

/* ������ ����� �� 1 �� 12. ������� �� ������� �������� ������,
 * ���������������� ������� �����.
 * (����������� �������� ������������ ����� �����).*/

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean repeat = false;
		do {
			System.out.println("������� ����� �� 1 �� 12:");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("������� ����� ������������� ������");
				repeat = false;
				break;
			case 2:
				System.out.println("������� ����� ������������� �������");
				repeat = false;
				break;
			case 3:
				System.out.println("������� ����� ������������� ����");
				repeat = false;
				break;
			case 4:
				System.out.println("������� ����� ������������� ������");
				repeat = false;
				break;
			case 5:
				System.out.println("������� ����� ������������� ���");
				repeat = false;
				break;
			case 6:
				System.out.println("������� ����� ������������� ����");
				repeat = false;
				break;
			case 7:
				System.out.println("������� ����� ������������� ����");
				repeat = false;
				break;
			case 8:
				System.out.println("������� ����� ������������� ������");
				repeat = false;
				break;
			case 9:
				System.out.println("������� ����� ������������� ��������");
				repeat = false;
				break;
			case 10:
				System.out.println("������� ����� ������������� �������");
				repeat = false;
				break;
			case 11:
				System.out.println("������� ����� ������������� ������");
				repeat = false;
				break;
			case 12:
				System.out.println("������� ����� ������������� �������");
				repeat = false;
				break;
			default:
				System.out.println("�� ����� �������� �����");
				repeat = true;
			}
		} while (repeat);
		sc.close();
	}

}
