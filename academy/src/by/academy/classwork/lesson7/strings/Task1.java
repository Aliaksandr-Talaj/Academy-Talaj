package by.academy.classwork.lesson7.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) {
		System.out.println("Введите строку:");
		Scanner sc = new Scanner(System.in);
		String string = new String();
		string = sc.nextLine();
		sc.close();
		long start = System.currentTimeMillis();
		Pattern pattern = Pattern.compile("[,.?!:;]");
		Matcher matcher = pattern.matcher(string);
		int counter = 0;
		while (matcher.find()) {
			counter++;
		}
		System.out.println("Количество знаков препинания: " + counter);
		System.out.println("Время выполнения, мс: " + (System.currentTimeMillis() - start));
	}

}
