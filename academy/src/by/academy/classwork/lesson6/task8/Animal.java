package by.academy.classwork.lesson6.task8;

import java.io.Serializable;

public class Animal implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String food;
	String location;

	public void makeNoise() {
		System.out.println("Животное шумит");
	}

	public void eat() {
		System.out.println("Животное ест");
	}

	public void sleep() {
		System.out.println("Животное спит");
	}
}
