package by.academy.homework2.regexp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3_4 {

	public static SimpleDateFormat format1 = new SimpleDateFormat("d/M/yyyy");
	public static SimpleDateFormat format2 = new SimpleDateFormat("d-M-yyyy");
	public static SimpleDateFormat format3 = new SimpleDateFormat("День\t d\nМесяц\t MMMM\nГод\t yyyy");

	public static void main(String[] args) throws ParseException {

		Pattern p1 = Pattern.compile("^([0]?[1-9]|[12][0-9]|[3][01])/([0][1-9]|[1-9]|1[0-2])/\\d{4}");
		Pattern p2 = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}");

		System.out.println("Введите дату");
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();
		sc.close();

		Matcher m1 = p1.matcher(test);
		Matcher m2 = p2.matcher(test);

		if (m1.find()) {
			System.out.println(m1.group(0) + " соответствует паттерну dd/MM/yyyy");
			Date date = format1.parse(test);
			Calendar c = new GregorianCalendar();
			c.setTime(date);
			System.out.println(format3.format(c.getTime()));
		} else {
			if (m2.find()) {
				System.out.println(m2.group(0) + " соответствует паттерну dd-MM-yyyy");
				Date date = format2.parse(test);
				Calendar c = new GregorianCalendar();
				c.setTime(date);
				System.out.println(format3.format(c.getTime()));
			} else {
				System.out.println(test + " не соответствует ни одному из необходимых паттернов");
			}
		}
	}

}