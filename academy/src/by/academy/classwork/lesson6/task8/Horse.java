package by.academy.classwork.lesson6.task8;

public class Horse extends Animal {
	double legLength;

	@Override
	public void makeNoise() {
		System.out.println("Лошадь ржет");
	}

	@Override
	public void eat() {
		System.out.println("Лошадь ест");
	}

}
