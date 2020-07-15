package by.academy.classwork.lesson6.task8;

public class Main {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Horse horse = new Horse();

		dog.name = "Шарик";
		dog.food = "Зайчатина";
		dog.location = "Простоквашино";
		cat.name = "Матроскин";
		cat.food = "Молоко";
		cat.location = "Простоквашино";
		horse.name = "Росинант";
		horse.food = "Травка";
		horse.location = "Голландия";

		Animal[] animals = { dog, cat, horse };
		for (int i = 0; i < animals.length; i++) {
			Veterinary.treatAnimal(animals[i]);
		}

	}
}
