package by.academy.classwork.lesson6.task8;

public class Dog extends Animal {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	double bitePower;

	@Override
	public void makeNoise() {
		System.out.println("Собака лает");
	}

	@Override
	public void eat() {
		System.out.println("Собака ест");
	}

}
