package by.academy.classwork.lesson6.task11;

public class Main {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		
		Shape [] shapes = {circle, rectangle};
		
		for (Shape i: shapes) {
			i.draw();
		}
		
	}
}
