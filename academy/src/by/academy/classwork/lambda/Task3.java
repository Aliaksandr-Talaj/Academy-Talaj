package by.academy.classwork.lambda;

import java.util.function.Predicate;

public class Task3 {
	public static void main(String[] args) {
		
		 Predicate <String> notEmpty = (String s) -> s.isEmpty();
	
		 String str = new String();
			
		 System.out.println(str);
		 System.out.println(notEmpty.test(str));
	}	
}
