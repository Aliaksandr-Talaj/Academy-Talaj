package by.academy.lesson3;

import java.util.Scanner;

public class Loop2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum=0;
		for (int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println ("сумма чисел от 1 до "+n+" равна "+sum);
	}
}
