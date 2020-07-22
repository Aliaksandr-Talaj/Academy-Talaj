package by.academy.homework2.strings;

import java.util.Scanner;

/* »спользу€ оператор switch, написать программу,
 * котора€ выводит на экран сообщени€ о принадлежности
 * некоторого значени€ k интервалам
 * (-10k, 0], (0, 5], (5, 10], (10, 10k].*/

public class Task10 {

	public static void main(String[] args) {
		System.out.println("¬ведите число k:");
		Scanner sc = new Scanner(System.in);
		double k = sc.nextDouble();
		sc.close();
		switch ((int) Math.ceil(k / 5)) {
		case 1:
			System.out.println("¬ходит в интервал (0, 5]");
			break;
		case 2:
			System.out.println("¬ходит в интервал (5, 10]");
			break;
		default:
			switch ((int) Math.ceil(k / 10)) {
			case 0:
				System.out.println("¬ходит в интервал (-10k,0]");
				break;
			case 2:
				System.out.println("¬ходит в интервал (10, 10k]");
				break;
			default:
				System.out.println("Ќе входит ни в один из интервалов");
			}
		}
	}

}
