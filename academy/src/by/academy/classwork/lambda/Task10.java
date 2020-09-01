package by.academy.classwork.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task10 {

	private static Map<String, Calculation> operations = new HashMap<String, Calculation>();
	static {
		operations.put("+", (i, j) -> i + j);
		operations.put("-", (i, j) -> i - j);
		operations.put("*", (i, j) -> i * j);
		operations.put("/", (i, j) -> i / j);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number x : ");
		Double x = sc.nextDouble();

		System.out.println("Enter operation ( + , - , *, / )");
		Calculation operator = operations.get(sc.next());
		
		System.out.print("Enter number y : ");
		Double y = sc.nextDouble();
		sc.close();

		System.out.println(calculate(operator, x, y));

	}

	private static Double calculate(Calculation o, Double x, Double y) {

		return o.calc(x, y);

	}

}
