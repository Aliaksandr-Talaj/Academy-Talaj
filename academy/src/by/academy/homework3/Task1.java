package by.academy.homework3;

import java.util.Scanner;
import by.academy.deal.DateValidator;

public class Task1 {

	public static void main(String[] args) {

		MyCustomDate date1;
		MyCustomDate date2;
		String dateInput;
		DateValidator dateVal = new DateValidator();
		Scanner sc = new Scanner(System.in);
		boolean isIncorrect;
		do {
			do {
				System.out.println("Enter the first date in the required format (\"dd-mm-yyyy\" or \"dd/mm/yyyy\"):");
				dateInput = sc.nextLine();
			} while (dateVal.isntValid(dateInput));

			date1 = new MyCustomDate(dateInput);
			isIncorrect = date1.isIncorrect();

		} while (isIncorrect);

		date1.printDayOfWeek();

		do {
			do {
				System.out.println("Enter the second date in the required format (\"dd-mm-yyyy\" or \"dd/mm/yyyy\"):");
				dateInput = sc.nextLine();
			} while (dateVal.isntValid(dateInput));

			date2 = new MyCustomDate(dateInput);
			isIncorrect = date2.isIncorrect();

		} while (isIncorrect);
		sc.close();

		date2.printDayOfWeek();

		System.out.println("Days between two dates: " + MyCustomDate.daysBetween(date1, date2));

	}
}
