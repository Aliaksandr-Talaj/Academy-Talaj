package by.academy.classwork.vehicles;

import by.academy.classwork.professions.*;
import by.academy.classwork.details.*;

public class Car {
	String carBrand;
	String carClass;
	double carWeight;
	Driver carDriver;
	Engine carEngine;
	
	public void start() {
			System.out.println("�������");
	}
	public void stop() {
		System.out.println("���������������");
	}
	public void turnRight() {
		System.out.println("������� �������");
	}
	public void turnLeft() {
		System.out.println("������� ������");
	}
	public void printInfo() {
		System.out.println("����� ����������: "+carBrand);
		System.out.println("����� ����������: "+carClass);
		System.out.println("��� ����������, ��: "+carWeight);
		System.out.println("��������: "+carDriver.getFullName());
		System.out.println("���� ��������: "+carDriver.getDrivingExperience());
		System.out.println("�������� ���������: "+carEngine.getEnginePower());
		System.out.println("������������ ���������: "+carEngine.getEngineProducer());
	}
}
