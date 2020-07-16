package by.academy.classwork.lesson6.strings.task1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Количество строк: ");
		int n = sc.nextInt();
		String[] strings = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("строка №" + (i + 1));
			strings[i] = sc.next();
		}
		sc.close();
		String maxLengthString = strings[0];
		String minLengthString = strings[0];
		for (String i : strings) {
			if (i.length() > maxLengthString.length()) {
				maxLengthString = i;
			}
			if (i.length() < minLengthString.length()) {
				minLengthString = i;
			}
		}
		System.out.println("\nСамые короткие строки: ");
		for (String i : strings) {
			if (i.length() == minLengthString.length()) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nс количеством символов:" + minLengthString.length());
		System.out.println("\nСамые длинные строки: ");
		for (String i : strings) {
			if (i.length() == maxLengthString.length()) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nс количеством символов:" + maxLengthString.length());
	}
}
