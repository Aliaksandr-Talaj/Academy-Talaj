package by.academy.classwork.lambda;

import java.util.function.Supplier;

public class Task8 {

	public static void main(String[] args) {
		
		Supplier<Double> random = () -> (Math.random()*10);
		
		System.out.printf("%,.2f%n", random.get());
		
	}
	
}
