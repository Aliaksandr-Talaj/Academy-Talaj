package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		// ���� �����
		Scanner sc = new Scanner(System.in);
		boolean b=true;
		float sum;
		int age;
		do {
			System.out.println("������� ����� �������");
			sum = sc.nextFloat();
			if (sum<0) {
				System.out.println ("����� �� ����� ���� �������������,");
				System.out.println ("��������� ����");
			} else {
				b=false;
			}
		} while (b);
		
		do {
			System.out.println("������� ������� ����������");
			age = sc.nextInt();
			if (age<0) {
				System.out.println ("������� �� ����� ���� �������������,");
				System.out.println ("��������� ����");
				b=true;
			} else {
				b=false;
			}
		} while (b);
		sc.close();
		
		// ���� ���������
		if (sum<100) {
			sum*=0.95; // ������ 5% �� ������� �����
		}
		if (sum>=100 && sum<200) { 
			sum*=0.93; // ������ 7% �� ������� �����
		}
		if (sum>=200 && sum<300) {
			if (age>18) {
				sum*=0.84; // ������ (12+4)% �� ������� ����� � ��������
			} else {
				sum*=0.91; // ������ (12-3)% �� ������� ����� � ��������
			}
		}
		if (sum>=300 && sum<400) {
			sum*=0.85; // ������ 15% �� ������� �����
		}
		if (sum>=400) {
			sum*=0.8; // ������ 20% �� ������� �����
		}
		// ��� ������� �������� � ������������ ��������� ������ �� �����
		// �.�. ��������� ���������� sum ������������ � ������� �����������, 
		// �������������� ������ ������������ � ������� ����������
		
		// �����
		System.out.println("��������� ���� " + sum);
	}
}
