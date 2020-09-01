package by.academy.classwork.lambda;

import java.util.Scanner;
import java.util.function.Function;

public class Task7 {

	public static void main(String[] args) {
		
		Function<Double, String> sign = (n) -> { if (n==0) { return "Ноль";} else if (n>0){return "Положительное число";} else{return "Отрицательное число";}};
		
		System.out.println("Введите число");
		Scanner sc = new Scanner(System.in);
		System.out.println(sign.apply(sc.nextDouble()));
		sc.close();
	}
	
}
