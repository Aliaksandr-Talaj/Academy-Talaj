package by.academy.classwork.lambda;

import java.util.function.Predicate;

public class Task4 {
	public static void main(String[] args) {
		
		 Predicate <String> notNull = (String s) -> s!=null;
		 Predicate <String> notEmpty = (String s) -> !s.isEmpty();
		 String str = new String();
				
		 
		 System.out.println(str);
		 System.out.println(notNull.and(notEmpty).test(str));
	}	
}
