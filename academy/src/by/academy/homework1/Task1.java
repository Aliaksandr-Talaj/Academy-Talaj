package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		// блок ввода
		Scanner sc = new Scanner(System.in);
		boolean b=true;
		float sum;
		int age;
		do {
			System.out.println("Введите сумму покупки");
			sum = sc.nextFloat();
			if (sum<0) {
				System.out.println ("Сумма не может быть отрицательной,");
				System.out.println ("повторите ввод");
			} else {
				b=false;
			}
		} while (b);
		
		do {
			System.out.println("Введите возраст покупателя");
			age = sc.nextInt();
			if (age<0) {
				System.out.println ("Возраст не может быть отрицательным,");
				System.out.println ("повторите ввод");
				b=true;
			} else {
				b=false;
			}
		} while (b);
		sc.close();
		
		// блок обработки
		if (sum<100) {
			sum*=0.95; // скидка 5% по размеру суммы
		}
		if (sum>=100 && sum<200) { 
			sum*=0.93; // скидка 7% по размеру суммы
		}
		if (sum>=200 && sum<300) {
			if (age>18) {
				sum*=0.84; // скидка (12+4)% по размеру суммы и возрасту
			} else {
				sum*=0.91; // скидка (12-3)% по размеру суммы и возрасту
			}
		}
		if (sum>=300 && sum<400) {
			sum*=0.85; // скидка 15% по размеру суммы
		}
		if (sum>=400) {
			sum*=0.8; // скидка 20% по размеру суммы
		}
		// при текущих условиях и конфигурации программы ошибки не будет
		// т.к. сравнение переменной sum производится в порядке возрастания, 
		// преобразование всегда производится в сторону уменьшения
		
		// вывод
		System.out.println("Финальная цена " + sum);
	}
}
