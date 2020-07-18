package by.academy.classwork.lesson6.strings.task5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("¬ведите слова в строку:");
		Scanner sc = new Scanner (System.in);
		String string = new String ();
		string = sc.nextLine();
		sc.close();
		String [] words = string.split(" +");
		
		for (String i:words) {
			System.out.println(i);
		}
	}

}
