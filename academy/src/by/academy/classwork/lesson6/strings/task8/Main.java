package by.academy.classwork.lesson6.strings.task8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Введите слова в строку через пробел:");
		Scanner sc = new Scanner(System.in);
		String string = new String();
		string = sc.nextLine();
		sc.close();
		String[] words = string.split(" +");
		String digitalPalindrome = "";
		for (String i : words) {
			int matchCounter = 0;
			if (i.matches("-?[0-9]+")) {
				for (int j = 0; j < i.length(); j++) {
					if (i.charAt(j) == i.charAt(i.length() - 1 - j)) {
						matchCounter++;
					}
				}
			}
			if (matchCounter == i.length()) {
				digitalPalindrome += i + ' ';
			}
		}
		if (digitalPalindrome.isEmpty()) {
			System.out.println("Нет чисел-палиндромов");
		} else {
			String[] palindroms = digitalPalindrome.split(" +");
			if (palindroms.length == 1) {
				System.out.println("Единственное число-палиндром - " + palindroms[0]);
			} else {
				System.out.println("Второе число-палиндром - " + palindroms[1]);
			}
		}
	}
}
