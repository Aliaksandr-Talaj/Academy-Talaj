package by.academy.homework3;

import by.academy.classwork.lesson6.task8.*;

public class Task2 {

	// для проверки класса Container

	public static void main(String[] args) {

		Container<Animal> container1 = new Container<Animal>(2);
		Container<Integer> container2 = new Container<Integer>();
		Container<Character> container3 = new Container<Character>(4);

		Dog dog = new Dog();
		Cat cat = new Cat();
		Horse horse = new Horse();

		container1.add(dog);
		container1.add(cat);
		container1.add(horse);
		container1.add(cat);
		container1.add(cat);

		container1.print();
		container1.remove(cat);
		container1.print();
		container1.remove(0);
		container1.print();
		container1.removeAll(cat);
		container1.print();

		for (int i = 0; i < 18; i++) {
			container2.add(i);
		}
		container2.print();
		System.out.println(container2.getFirst());
		System.out.println(container2.getLast());
		System.out.println(container2.getIndexOfLast());
		System.out.println(container2.getSize());

		container3.setArray(new Character[] { 'F', null, 'I', null });
		container3.addToFirstFreeSlot('B');
		container3.addToFirstFreeSlot('!');
		container3.print();

	}

}
