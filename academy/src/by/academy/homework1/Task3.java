package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите число");
		int i = sc.nextInt();
		sc.close();
		for (int j = 1; j <= 10; j++) {
			System.out.println(j * i);
		}
	}
}
