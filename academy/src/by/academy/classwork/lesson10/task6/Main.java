package by.academy.classwork.lesson10.task6;

import by.academy.classwork.lesson6.task8.*;

public class Main {
	
	public static void main(String[] args) {
		
	String uno = "First";
	Cat duo = new Cat();
	Integer tres = 3;

	Class6<String, Cat, Integer> c6 = new Class6<String, Cat, Integer>(uno, duo , tres);
	
	c6.printType();
	}
}
