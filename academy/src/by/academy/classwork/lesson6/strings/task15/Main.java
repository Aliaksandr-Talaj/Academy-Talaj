package by.academy.classwork.lesson6.strings.task15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string1;
		String string2;
		do {
			System.out.println("¬ведите первое слово из четного количества букв:");
			string1 = sc.nextLine();
		} while (string1.length() % 2 != 0);
		do {
			System.out.println("¬ведите второе слово из четного количества букв:");
			string2 = sc.next();
		} while (string2.length() % 2 != 0);
		sc.close();
		System.out.println(string1.substring(0, string1.length() / 2)
				+ string2.substring((string2.length() / 2), string2.length()));
	}
}
