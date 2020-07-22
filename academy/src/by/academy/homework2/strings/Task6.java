package by.academy.homework2.strings;

import java.util.Scanner;

/* Ввести n слов с консоли. Найти слово, символы в котором идут в строгом порядке 
возрастания их кодов. Если таких слов несколько, найти первое из них. */

public class Task6 {
	
	public static void main(String[] args) {
		System.out.println("Введите слова в строку через пробел:");
		Scanner sc = new Scanner(System.in);
		String string = new String();
		string = sc.nextLine();
		sc.close();
		String[] words = string.split(" +");

		for (String i : words) {
			int counter = 0;
			for (int j = 0; j < i.length() - 1; j++) {
				if (i.charAt(j) < i.charAt(j + 1)) {
					counter++;
				}
			}
			if (counter == i.length() - 1) {
				System.out.println(i);
				break;
			}
		}
	}
}
