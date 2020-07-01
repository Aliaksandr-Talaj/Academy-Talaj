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
			System.out.println("введенные числа равны, ");
		} else {
			if (i>j) {
				System.out.println(i+" - большее, "+j+" - меньшее, ");
			} else {
				System.out.println(j+" - большее, "+i+" - меньшее, ");
			}
		}
		System.out.print("среднее арифметическое - " + s);
	}
}
