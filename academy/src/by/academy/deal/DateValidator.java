package by.academy.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateValidator implements Validator {
	Pattern p1 = Pattern.compile("^([0]?[1-9]|[12][0-9]|[3][01])/([0][1-9]|[1-9]|1[0-2])/\\d{4}$");
	Pattern p2 = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0][1-9]|[1-9]|1[0-2])-\\d{4}$");

	@Override
	public boolean isntValid(String testString) {

		Matcher m1 = p1.matcher(testString);
		Matcher m2 = p2.matcher(testString);
		if (m1.find() || m2.find()) {
			return false;
		} else {
			return true;
		}
	}
	public boolean isFirstFormat(String testString) {
		Matcher m1 = p1.matcher(testString);
		return (m1.find());
	}

}
