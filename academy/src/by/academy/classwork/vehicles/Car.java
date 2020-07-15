package by.academy.classwork.vehicles;

import by.academy.classwork.professions.*;
import by.academy.classwork.details.*;

public class Car {
	protected String carBrand;
	protected String carClass;
	protected double carWeight;
	protected Driver carDriver;
	protected Engine carEngine;

	public void start() {
		System.out.println("Поехали");
	}

	public void stop() {
		System.out.println("Останавливаемся");
	}

	public void turnRight() {
		System.out.println("Поворот направо");
	}

	public void turnLeft() {
		System.out.println("Поворот налево");
	}

	public void printInfo() {
		System.out.println("Марка автомобиля: " + carBrand);
		System.out.println("Класс автомобиля: " + carClass);
		System.out.println("Вес автомобиля, кг: " + carWeight);
		System.out.println("Водитель: " + carDriver.getFullName());
		System.out.println("Стаж вождения: " + carDriver.getDrivingExperience());
		System.out.println("Мощность двигателя: " + carEngine.getEnginePower());
		System.out.println("Произодитель двигателя: " + carEngine.getEngineProducer());
	}
}
