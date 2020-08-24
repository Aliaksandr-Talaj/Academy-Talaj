package by.academy.classwork.lambda;

import java.util.function.Predicate;

public class Task5 {
	public static void main(String[] args) {
		
		 Predicate <String> starts = (String s) -> (s.charAt(0)=='J'||s.charAt(0)=='N');
		 Predicate <String> ends = (String s) -> (s.charAt(s.length()-1)=='A');
		
		 String str = "JavA";
				
		 
		 System.out.println(str);
		 System.out.println(starts.and(ends).test(str));
	}	
}
