package by.academy.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	private static Pattern pattern = Pattern.compile("(\\w[\\w\\.\\_\\-]{2,})@(\\w+\\.)([a-z]{2,4})");

	@Override
	public boolean isntValid(String testString) {

		Matcher matcher = pattern.matcher(testString);
		return !(matcher.find());
	}

}
