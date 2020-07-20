package by.academy.classwork.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) {
		String [] tests1 = {"50/50/5555","17/10/1947","18/13/3487","16/02/1952"};
		String [] tests2 = {"50-50-5555","17-10-1947","18-13-3487","16-02-1952"};
		
		Pattern p1 = Pattern.compile("");
		Pattern p2 = Pattern.compile("");
		
		for (String i: tests1) {
			Matcher m1 = p1.matcher(i);
			if (m1.find()) {
				System.out.println(m1.group(0));
			} else {
				System.out.println("failed");
			}
		}
		for (String i: tests2) {
			Matcher m2 = p2.matcher(i);
			if (m2.find()) {
				System.out.println(m2.group(0));
			} else {
				System.out.println("failed");
			}
		}
		
	}

}

//([0-2][0-9])|([0]?[1-9])|([3][01])/([0]?[1-9])|([1][012])/[12][0-9][0-9][0-9]