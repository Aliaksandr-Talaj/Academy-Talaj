package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Введите тип переменной");
		String vType = sc.nextLine();
		System.out.println("Введите значение переменной");
		switch (vType) {
			case "int":
				int i=sc.nextInt();
				System.out.println("Остаток от деления на 2 равен "+ i%2);
				break;
			case "double":
				double d=sc.nextDouble();
				System.out.println("70% от числа составляет "+ 0.7*d);
				break;
			case "float":
				float f=sc.nextFloat();
				System.out.println("Квадрат значения равен "+f*f);
				break;
			case "char":
				String s=sc.nextLine();
				char c=s.charAt(0);
				System.out.println("Код символа "+(int)c);
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
