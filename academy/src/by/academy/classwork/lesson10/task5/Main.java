package by.academy.classwork.lesson10.task5;

public class Main {

	public static void main(String[] args) {
		Food food = new Food();
		Cookable boiling = new Cookable() {

			@Override
			public void cook(String str) {
				System.out.println(str + " boiling");
			}

		};
		food.prepare(boiling, "cofee");

	}

}
