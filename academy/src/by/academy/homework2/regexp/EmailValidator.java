package by.academy.homework2.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {
	private static Pattern pattern = Pattern.compile("(\\w[\\w\\.\\_\\-]{2,})@(\\w+\\.)([a-z]{2,4})");

	public static void main(String[] args) {
		System.out.println("������� email");
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();
		sc.close();
		Validator emailVal = new EmailValidator();
		if (emailVal.validate(test)) {
			System.out.println("Email ������������� �������");
		} else {
			System.out.println("Email �� ������������� �������");
		}
	}

	@Override
	public boolean validate(String testString) {
		Matcher matcher = pattern.matcher(testString);
		return (matcher.find());
	}

}
