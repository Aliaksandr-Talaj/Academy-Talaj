package by.academy.lesson3;

import java.util.Scanner;

public class Loop4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int pos=0,neg=0,zero=0;
		for (int i=1;i<=n;i++) {
			int c=sc.nextInt();
			if (c==0) {
				zero++;
			} else if (c>0) {
				pos++;
				} else {
				neg++;
				}
		}
		sc.close();
		System.out.println ("количество положительных - "+pos);
		System.out.println ("количество отрицательных - "+neg);
		System.out.println ("количество нулей - "+zero);
	}
}