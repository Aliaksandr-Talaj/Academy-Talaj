package by.academy.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelephoneValidator implements Validator{

	private static Pattern pattern = Pattern.compile("(\\+375|80)[\\s\\-]?\\(?(29|24|25|44|33)\\)?[\\s\\-]?(\\d{3})[\\s\\-]?(\\d{2})[\\s\\-]?(\\d{2})");
	
	@Override
	public boolean isntValid(String testString) {
		Matcher matcher = pattern.matcher(testString);
		return !(matcher.find());
		}

}
