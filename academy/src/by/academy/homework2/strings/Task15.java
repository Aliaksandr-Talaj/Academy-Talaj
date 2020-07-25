package by.academy.homework2.strings;

import java.util.Scanner;

/* Условие здачи: ввести 2 слова,
 * состоящие из четного числа букв.
 * Получить слово состоящее из первой половины
 * первого слова и второй половины второго слова.*/

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string1;
		String string2;
		do {
			System.out.println("Введите первое слово из четного количества букв:");
			string1 = sc.nextLine();
		} while (string1.length() % 2 != 0);
		do {
			System.out.println("Введите второе слово из четного количества букв:");
			string2 = sc.next();
		} while (string2.length() % 2 != 0);
		sc.close();
		System.out.println(string1.substring(0, string1.length() / 2)
				+ string2.substring((string2.length() / 2), string2.length()));
	}
}
