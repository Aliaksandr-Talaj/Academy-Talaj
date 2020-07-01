package by.academy.lesson3;

import java.util.Scanner;

public class Loop3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		long mul=1;
		for (int i=1;i<=n;i++) {
			mul*=i;
		}
		System.out.println ("произведение чисел от 1 до "+n+" равно "+mul);
	}
}
