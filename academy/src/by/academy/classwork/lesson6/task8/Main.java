package by.academy.classwork.lesson6.task8;

public class Main {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Horse horse = new Horse();

		dog.name = "�����";
		dog.food = "���������";
		dog.location = "�������������";
		cat.name = "���������";
		cat.food = "������";
		cat.location = "�������������";
		horse.name = "��������";
		horse.food = "������";
		horse.location = "���������";

		Animal[] animals = { dog, cat, horse };
		for (int i = 0; i < animals.length; i++) {
			Veterinary.treatAnimal(animals[i]);
		}

	}
}
