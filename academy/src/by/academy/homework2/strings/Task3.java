package by.academy.homework2.strings;

import java.util.Scanner;

/* Ввести n строк с консоли.
 * Вывести на консоль те строки,
 * длина которых меньше (больше) 
 * средней, а также длину.*/

public class Task3 {

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
		int sum = 0;
		for (String i : strings) {
			sum += i.length();
		}
		int average = (int) (Math.round(((double) sum) / ((double) strings.length)));
		System.out.println("\nСтроки с длиной выше среднего значения: ");
		for (String i : strings) {
			if (i.length() > average) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\nСтроки с длиной ниже среднего значения: ");
		for (String i : strings) {
			if (i.length() < average) {
				System.out.print(i + " ");
			}
		}
	}
}
