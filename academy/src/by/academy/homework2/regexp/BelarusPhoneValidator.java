package by.academy.homework2.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

	private static Pattern pattern = Pattern.compile("(\\+375|80)[\\s\\-]?\\(?(29|24|25|44|33)\\)?[\\s\\-]?(\\d{3})[\\s\\-]?(\\d{2})[\\s\\-]?(\\d{2})");

	public static void main(String[] args) {
		System.out.println("Введите номер телефона");
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();
		sc.close();
		Validator phoneVal = new BelarusPhoneValidator();
		if (phoneVal.validate(test)) {
			System.out.println("Номер соответствует формату");
		} else {
			System.out.println("Номер не соответствует формату");
		}
	}

	@Override
	public boolean validate(String testString) {
		Matcher matcher = pattern.matcher(testString);
		return (matcher.find());
	}
}
