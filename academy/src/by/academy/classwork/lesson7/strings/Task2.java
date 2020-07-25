package by.academy.classwork.lesson7.strings;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("Введите строку:");
		Scanner sc = new Scanner(System.in);
		String string = new String();
		string = sc.nextLine();
		sc.close();
		String[] words = string.split(" +");
		System.out.println("Количество слов:" + words.length);
	}

}
