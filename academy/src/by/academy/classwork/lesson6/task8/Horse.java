package by.academy.classwork.lesson6.task8;

public class Horse extends Animal {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
