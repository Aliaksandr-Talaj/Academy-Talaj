package by.academy.classwork.lambda;

import java.util.function.Predicate;

public class Task2 {
	public static void main(String[] args) {
		
		 Predicate <String> notNull = (String s) -> s!=null;
	
		 String str = new String();
				 str = null;
		 System.out.println(str);
		 System.out.println(notNull.test(str));
	}	
}
