package by.academy.classwork.lesson6.strings.task14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("������� ����� �� 1 �� 12:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
		switch (i) {
		case 1: 
			System.out.println("������� ����� ������������� ������");
			break;
		case 2: 
			System.out.println("������� ����� ������������� �������");
			break;
		case 3: 
			System.out.println("������� ����� ������������� ����");
			break;
		case 4: 
			System.out.println("������� ����� ������������� ������");
			break;
		case 5: 
			System.out.println("������� ����� ������������� ���");
			break;
		case 6: 
			System.out.println("������� ����� ������������� ����");
			break;
		case 7: 
			System.out.println("������� ����� ������������� ����");
			break;
		case 8: 
			System.out.println("������� ����� ������������� ������");
			break;
		case 9: 
			System.out.println("������� ����� ������������� ��������");
			break;
		case 10: 
			System.out.println("������� ����� ������������� �������");
			break;
		case 11: 
			System.out.println("������� ����� ������������� ������");
			break;
		case 12: 
			System.out.println("������� ����� ������������� �������");
			break;
		default :
			System.out.println("�� ����� �������� �����");
		}
	}

}
