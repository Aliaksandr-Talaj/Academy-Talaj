package by.academy.classwork.lesson6.task8;

public class Cat extends Animal {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String color;

	@Override
	public void makeNoise() {
		System.out.println("Кот мурлычет");
	}

	@Override
	public void eat() {
		System.out.println("Кот ест");
	}

}
