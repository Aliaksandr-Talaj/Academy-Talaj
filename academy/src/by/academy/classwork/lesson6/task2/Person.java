package by.academy.classwork.lesson6.task2;

public class Person {

	private String fullName;
	private int age;

	public Person() {
		super();
	}

	public Person(String fullName, int age) {
		this.fullName = fullName;
		this.setAge(age);
	}

	public int getAge() {
		return age;
	}

	public void move() {
		System.out.println(this.fullName + " двигается");
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void talk() {
		System.out.println(this.fullName + " говорит");
	}

}
