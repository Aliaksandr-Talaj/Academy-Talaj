package by.academy.lesson2;

import java.util.Scanner;


public class Main5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		sc.close();
		float s = ((float)i+(float)j)/2; 
		if (i==j) {
			System.out.println("��������� ����� �����, ");
		} else {
			if (i>j) {
				System.out.println(i+" - �������, "+j+" - �������, ");
			} else {
				System.out.println(j+" - �������, "+i+" - �������, ");
			}
		}
		System.out.print("������� �������������� - " + s);
	}
}
