package by.academy.classwork.lesson6.strings.task14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Введите число от 1 до 12:");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
		switch (i) {
		case 1: 
			System.out.println("Данному числу соответствует январь");
			break;
		case 2: 
			System.out.println("Данному числу соответствует февраль");
			break;
		case 3: 
			System.out.println("Данному числу соответствует март");
			break;
		case 4: 
			System.out.println("Данному числу соответствует апрель");
			break;
		case 5: 
			System.out.println("Данному числу соответствует май");
			break;
		case 6: 
			System.out.println("Данному числу соответствует июнь");
			break;
		case 7: 
			System.out.println("Данному числу соответствует июль");
			break;
		case 8: 
			System.out.println("Данному числу соответствует август");
			break;
		case 9: 
			System.out.println("Данному числу соответствует сентябрь");
			break;
		case 10: 
			System.out.println("Данному числу соответствует октябрь");
			break;
		case 11: 
			System.out.println("Данному числу соответствует ноябрь");
			break;
		case 12: 
			System.out.println("Данному числу соответствует декабрь");
			break;
		default :
			System.out.println("вы ввели неверное число");
		}
	}

}
