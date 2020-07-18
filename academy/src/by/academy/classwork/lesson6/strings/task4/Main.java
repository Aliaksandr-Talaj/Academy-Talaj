package by.academy.classwork.lesson6.strings.task4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("������� ����� � ������ ����� ������:");
		Scanner sc = new Scanner(System.in);
		String string = new String();
		string = sc.nextLine();
		sc.close();
		String[] words = string.split(" +");
		if (words.length <= 1) {
			System.out.println("C����, � ������� ����� ���������" + " �������� ����������: " + string);
		} else {
			int[] unics = new int[words.length];
			for (int i = 0; i < words.length; i++) {

				for (int j = 0; j < words[i].length(); j++) {
					if (words[i].lastIndexOf(words[i].charAt(j)) == j) {
						unics[i]++;
					}
				}
			}
			int unicsMin = unics[0];
			for (int i = 1; i < unics.length; i++) {
				if (unicsMin > unics[i]) {
					unicsMin = unics[i];
				}
			}
			for (int i = 0; i < unics.length; i++) {
				if (unics[i] == unicsMin) {
					System.out.println("C����, � ������� ����� ���������" + " �������� ����������: " + words[i]);
					break;
				}
			}
		}
	}
}
