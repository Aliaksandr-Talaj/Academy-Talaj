package by.academy.classwork.reflectoinAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Task1 {

	public static void main(String[] args) {

		Cat cat = new Cat("Orion", "MilkyWay", 12);
		Tiger tiger = new Tiger("Matroskin", "Bunny", "scary");

		Class<Cat> catClass = Cat.class;
		Class<Tiger> tigerClass = Tiger.class;

		for (Field c : catClass.getDeclaredFields()) {

			System.out.println(c);

		}
		System.out.println();
		for (Field c : tigerClass.getDeclaredFields()) {

			System.out.println(c);

		}
		System.out.println();
		for (Method c : catClass.getDeclaredMethods()) {

			System.out.println(c);
		}
		System.out.println();

		for (Method c : tigerClass.getDeclaredMethods()) {

			System.out.println(c);
		}
	}

}
