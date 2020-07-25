package by.academy.classwork.lesson6.task8;

public class Dog extends Animal {
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
