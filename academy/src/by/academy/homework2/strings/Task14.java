package by.academy.homework2.strings;

import java.util.Scanner;

/* Ввести число от 1 до 12. Вывести на консоль название месяца,
 * соответствующего данному числу.
 * (Осуществить проверку корректности ввода чисел).*/

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean repeat = false;
		do {
			System.out.println("Введите число от 1 до 12:");
			int i = sc.nextInt();
			switch (i) {
			case 1:
				System.out.println("Данному числу соответствует январь");
				repeat = false;
				break;
			case 2:
				System.out.println("Данному числу соответствует февраль");
				repeat = false;
				break;
			case 3:
				System.out.println("Данному числу соответствует март");
				repeat = false;
				break;
			case 4:
				System.out.println("Данному числу соответствует апрель");
				repeat = false;
				break;
			case 5:
				System.out.println("Данному числу соответствует май");
				repeat = false;
				break;
			case 6:
				System.out.println("Данному числу соответствует июнь");
				repeat = false;
				break;
			case 7:
				System.out.println("Данному числу соответствует июль");
				repeat = false;
				break;
			case 8:
				System.out.println("Данному числу соответствует август");
				repeat = false;
				break;
			case 9:
				System.out.println("Данному числу соответствует сентябрь");
				repeat = false;
				break;
			case 10:
				System.out.println("Данному числу соответствует октябрь");
				repeat = false;
				break;
			case 11:
				System.out.println("Данному числу соответствует ноябрь");
				repeat = false;
				break;
			case 12:
				System.out.println("Данному числу соответствует декабрь");
				repeat = false;
				break;
			default:
				System.out.println("вы ввели неверное число");
				repeat = true;
			}
		} while (repeat);
		sc.close();
	}

}
