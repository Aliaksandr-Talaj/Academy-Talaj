package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("������� ��� ����������");
		String vType = sc.nextLine();
		System.out.println("������� �������� ����������");
		switch (vType) {
			case "int":
				int i=sc.nextInt();
				System.out.println("������� �� ������� �� 2 ����� "+ i%2);
				break;
			case "double":
				double d=sc.nextDouble();
				System.out.println("70% �� ����� ���������� "+ 0.7*d);
				break;
			case "float":
				float f=sc.nextFloat();
				System.out.println("������� �������� ����� "+f*f);
				break;
			case "char":
				String s=sc.nextLine();
				char c=s.charAt(0);
				System.out.println("��� ������� "+(int)c);
				break;
			case "String":
				String str=sc.nextLine();
				System.out.println("Hello "+str);
				break;
			default:
				System.out.println("Unsupported type");
		}
		sc.close();
	}
}
