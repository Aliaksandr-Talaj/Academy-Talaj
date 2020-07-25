package by.academy.homework2.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

	private static Pattern pattern = Pattern
			.compile("\\+?1\\s*\\W?\\s*([2-9][0-8][0-9])\\s*\\W?\\s*([2-9][0-9]{2})\\s*\\W?\\s*([0-9]{4})");

	public static void main(String[] args) {
		System.out.println("Введите номер телефона");
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();
		sc.close();
		Validator phoneVal = new AmericanPhoneValidator();
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