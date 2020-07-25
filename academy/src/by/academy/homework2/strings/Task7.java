package by.academy.homework2.strings;

import java.util.Scanner;

/* Ввести n слов с консоли. Найти слово, состоящее только из различных символов. 
Если таких слов несколько, найти первое из них. */

public class Task7 {

	public static void main(String[] args) {
		System.out.println("Введите слова в строку через пробел:");
		Scanner sc = new Scanner(System.in);
		String string = new String();
		string = sc.nextLine();
		sc.close();
		String[] words = string.split(" +");
		int unics = 0;
		int counter = 0;
		for (String i : words) {
			unics = 0;
			for (int j = 0; j < i.length(); j++) {
				if (i.lastIndexOf(i.charAt(j)) == j) {
					unics++;
				}
			}
			if (unics == i.length()) {
				System.out.print("Первое слово, состоящее только из различных символов - " + i);
				counter++;
				break;
			}
		}
		if (counter == 0) {
			System.out.print("Слова, состоящие только из различных символов, не найдены");
		}
	}
}
