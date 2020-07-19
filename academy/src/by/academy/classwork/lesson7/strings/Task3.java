package by.academy.classwork.lesson7.strings;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		System.out.println("¬ведите строку:");
		Scanner sc = new Scanner(System.in);
		String string = new String();
		string = sc.nextLine();
		sc.close();
		String[] words = string.split(" +");
		for (String word : words) {
			System.out.print(word.charAt((word.length() - 1)));
		}
	}
}