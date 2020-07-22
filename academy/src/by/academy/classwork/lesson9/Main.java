package by.academy.classwork.lesson9;

import by.academy.deal.*;

public class Main {

	public static void main(String[] args) {
		Box<Product> product1 = new Box<Product>();
		Box<User> user1 = new Box<User>();

		Product milk = new Product();
		User juseppe = new User();

		product1.setItem(milk);
		user1.setItem(juseppe);

	}

}
