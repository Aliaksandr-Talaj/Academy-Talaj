package by.academy.classwork.lesson6.Task2;

public class Person {

	public String fullName;
	public int age;
	
	public void move() {
		System.out.println(this.fullName+" двигается");
	}
	public void talk() {
		System.out.println(this.fullName+" говорит");
	}
	public Person() {
		super();
	}
	public Person(String fullName, int age) {
		this.fullName=fullName;
		this.age=age;
	}
	
}
