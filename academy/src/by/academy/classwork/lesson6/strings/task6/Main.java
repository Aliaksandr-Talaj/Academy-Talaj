package by.academy.classwork.lesson6.strings.task6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("¬ведите слова в строку:");
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
